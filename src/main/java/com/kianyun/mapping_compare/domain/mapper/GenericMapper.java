package com.kianyun.mapping_compare.domain.mapper;

public interface GenericMapper<D, E> extends CMapper {
    D to(E e);
    E from(D d);
}
