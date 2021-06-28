package com.kianyun.mapping_compare.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class CurrencyType {
    private final String type;

    public CurrencyType(String type) {
        this.type = type;
    }
}
