package com.kianyun.mapping_compare.domain.mapper;

import org.springframework.stereotype.Component;

@Component
public interface GenericMapper<S, D> {
    D map(S e);
}
