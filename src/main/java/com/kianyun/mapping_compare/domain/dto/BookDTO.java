package com.kianyun.mapping_compare.domain.dto;

import com.kianyun.mapping_compare.domain.model.CurrencyType;
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
public class BookDTO {
    private String title;
    private String author;
    private String nickName;
    private CurrencyType currencyType;
    private LocalDate publishedAt;
    private Long price;
}
