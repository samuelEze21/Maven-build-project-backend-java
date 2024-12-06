package org.africa.semicolon.quidexCurrencyApplication.dtos.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;



@Data
public class CurrencyConversionRequestDTO {

    @NotBlank(message = "Source currency code is required")
    private String sourceCurrency;

    @NotBlank(message = "Target currency code is required")
    private String targetCurrency;


    @Positive(message = "Amount must be greater than 0")
    @NotNull(message = "Amount is required")
    private Double amount;
}

