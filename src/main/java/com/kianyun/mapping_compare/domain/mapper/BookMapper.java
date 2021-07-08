package com.kianyun.mapping_compare.domain.mapper;

import com.kianyun.mapping_compare.domain.dto.BookDTO;
import com.kianyun.mapping_compare.domain.model.Book;
import org.mapstruct.Mapper;

@Mapper
public interface BookMapper extends GenericMapper<Book, BookDTO> {

}
