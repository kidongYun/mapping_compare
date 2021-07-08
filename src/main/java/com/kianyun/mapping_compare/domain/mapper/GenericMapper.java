package com.kianyun.mapping_compare.domain.mapper;

public interface GenericMapper<D, E> {
    E map(D e);
}
