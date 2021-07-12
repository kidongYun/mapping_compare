package com.kianyun.mapping_compare.util;

import com.kianyun.mapping_compare.domain.mapper.GenericMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MapperFactory<S, D> {

    @Autowired
    GenericMapper<S, D> genericMapper;

    public GenericMapper<S, D> getInstance() {
        return genericMapper;
    }
}
