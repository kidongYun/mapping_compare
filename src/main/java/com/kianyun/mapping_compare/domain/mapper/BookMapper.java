package com.kianyun.mapping_compare.domain.mapper;

import com.kianyun.mapping_compare.domain.dto.BookDTO;
import com.kianyun.mapping_compare.domain.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper extends GenericMapper<BookDTO, Book> {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);
}
