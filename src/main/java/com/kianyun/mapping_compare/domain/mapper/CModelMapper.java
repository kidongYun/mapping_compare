package com.kianyun.mapping_compare.domain.mapper;

import org.modelmapper.ModelMapper;

import java.lang.reflect.Type;
import java.util.function.Supplier;

public class CModelMapper<D, E> implements GenericMapper<D, E> {
    private final ModelMapper mapper;

    public CModelMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public D map(E e) {
        return mapper.map();
    }
}
