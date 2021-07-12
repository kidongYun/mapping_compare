package com.kianyun.mapping_compare.util;

import com.kianyun.mapping_compare.domain.dto.BookDTO;
import com.kianyun.mapping_compare.domain.mapper.BookMapper;
import com.kianyun.mapping_compare.domain.mapper.BookMapperImpl;
import com.kianyun.mapping_compare.domain.mapper.CMapper;
import com.kianyun.mapping_compare.domain.mapper.GenericMapper;
import com.kianyun.mapping_compare.domain.model.Book;

import java.util.function.Supplier;

public class MappingUtil {
    private CMapper mapper;

    public MappingUtil(CMapper mapper) {
        this.mapper = mapper;
    }

    public <S, D> D map(S source, Class<D> destinationType) {
        return doWithLogging(() -> mapper.map(source, destinationType));
    }

//    public <D> D map(Object source, Class<D> destinationType) {
//        return doWithLogging(() -> mapper.map(source, destinationType));
//    }

    private <D> D doWithLogging(Supplier<D> action) {
        try {
            return action.get();
        } catch (org.modelmapper.MappingException e) {
            throw new MappingException(e);
        }
    }

    static class MappingException extends RuntimeException {
        MappingException(Throwable cause) {
            super("Mapping failed.", cause);
        }
    }
}
