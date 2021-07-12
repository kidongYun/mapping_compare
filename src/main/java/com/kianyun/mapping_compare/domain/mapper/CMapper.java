package com.kianyun.mapping_compare.domain.mapper;

public interface CMapper {
    <S, D> D map(S source, Class<D> destinationType);
}
