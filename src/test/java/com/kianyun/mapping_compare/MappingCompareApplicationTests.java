package com.kianyun.mapping_compare;

import com.kianyun.mapping_compare.domain.dto.BookDTO;
import com.kianyun.mapping_compare.domain.mapper.BookMapper;
import com.kianyun.mapping_compare.domain.mapper.CMapper;
import com.kianyun.mapping_compare.domain.mapper.CModelMapper;
import com.kianyun.mapping_compare.domain.mapper.GenericMapper;
import com.kianyun.mapping_compare.domain.model.Book;
import com.kianyun.mapping_compare.domain.model.CurrencyType;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@Slf4j
@SpringBootTest
class MappingCompareApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test_use_model_mapper() {
        ModelMapper modelMapper = new ModelMapper();

        modelMapper
                .createTypeMap(Book.class, BookDTO.class)
                .addMapping(Book::getCreateAt, BookDTO::setPublishedAt)
                .addMapping(Book::getAka, BookDTO::setNickName);

        BookDTO bookDTO = BookDTO.builder()
                .title("Selfish Gene")
                .author("Lichard Dokins")
                .price(24000L)
                .currencyType(CurrencyType.builder().type("KRW").build())
                .nickName("Rich")
                .publishedAt(LocalDate.of(1984, 6,20)).build();

        Book book = modelMapper.map(bookDTO, Book.class);

        log.info("YKD : " + book.toString());
    }

    @Test
    public void test() {
        GenericMapper<BookDTO, Book> mapper = new CModelMapper<>(new ModelMapper(), Book::new);

        BookDTO bookDTO = BookDTO.builder()
                .title("Selfish Gene")
                .author("Lichard Dokins")
                .price(24000L)
                .currencyType(CurrencyType.builder().type("KRW").build())
                .nickName("Rich")
                .publishedAt(LocalDate.of(1984, 6,20)).build();

        Book book = mapper.map(bookDTO);
    }

//    @Test
//    public void test_use_map_struct() {
//        Book book = Book.builder()
//                .title("Selfish Gene")
//                .author("Lichard Dokins")
//                .price(24000L)
//                .currencyType(CurrencyType.builder().type("KRW").build())
//                .aka("Rich")
//                .createAt(LocalDate.of(1984, 6, 20)).build();
//
//        BookDTO bookDTO = BookMapper.INSTANCE.to(book);
//
//        log.info("YKD : " + bookDTO.toString());
//    }
//
//    @Test
//    public void test_use_c_mapper() {
//        CMapper mapper = new CModelMapper();
//
//        BookDTO bookDTO = BookDTO.builder()
//                .title("Selfish Gene")
//                .author("Lichard Dokins")
//                .price(24000L)
//                .currencyType(CurrencyType.builder().type("KRW").build())
//                .nickName("Rich")
//                .publishedAt(LocalDate.of(1984, 6,20)).build();
//
//        Book book = mapper.map(bookDTO, Book.class);
//
//        log.info("YKD : " + book.toString());
//    }
}
