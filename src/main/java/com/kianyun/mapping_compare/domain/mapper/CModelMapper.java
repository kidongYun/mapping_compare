package com.kianyun.mapping_compare.domain.mapper;

import org.modelmapper.ModelMapper;

import java.lang.reflect.Type;
import java.util.function.Supplier;

public class CModelMapper<D, E> implements GenericMapper<D, E> {
    private final ModelMapper mapper;
    private final Supplier<E> supplier;

    public CModelMapper(ModelMapper mapper, Supplier<E> supplier) {
        this.mapper = mapper;
        this.supplier = supplier;
    }

    @Override
    public E map(D e) {
        return mapper.map(e, (Type) supplier.get().getClass());
    }
}
