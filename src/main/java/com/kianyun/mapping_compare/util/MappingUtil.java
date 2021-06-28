package com.kianyun.mapping_compare.util;

import com.kianyun.mapping_compare.domain.mapper.CMapper;

import java.util.function.Supplier;

public class MappingUtil {
    private CMapper mapper;

    public MappingUtil(CMapper mapper) {
        this.mapper = mapper;
    }

    public <D> D map(Object source, Class<D> destinationType) {
        return doWithLogging(() -> mapper.map(source, destinationType));
    }

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
