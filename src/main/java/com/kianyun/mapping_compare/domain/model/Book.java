package com.kianyun.mapping_compare.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String title;
    private String author;
    private String aka;
    private CurrencyType currencyType;
    private LocalDate createAt;
    private Long price;
}
