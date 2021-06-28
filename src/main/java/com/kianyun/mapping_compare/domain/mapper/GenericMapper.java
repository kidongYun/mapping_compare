package com.kianyun.mapping_compare.domain.mapper;

public interface GenericMapper<D, E> {
    D map(E e);
}
