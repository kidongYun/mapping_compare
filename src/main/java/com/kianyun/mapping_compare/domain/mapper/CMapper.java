package com.kianyun.mapping_compare.domain.mapper;

public interface CMapper {
    <D> D map(Object source, Class<D> destinationType);
}
