package com.kianyun.mapping_compare.domain.mapper;

import com.kianyun.mapping_compare.domain.dto.BookDTO;
import com.kianyun.mapping_compare.domain.model.Book;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface BookMapper extends GenericMapper<BookDTO, Book> {

}
