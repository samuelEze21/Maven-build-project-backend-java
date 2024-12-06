package org.africa.semicolon.quidexCurrencyApplication.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class CurrencyConversionResponseDTO {
    private String sourceCurrency;
    private String targetCurrency;
    private Double convertedAmount;
    private Double exchangeRate;

}


















//    public CurrencyConversionResponseDTO(String sourceCurrency, String targetCurrency, Double convertedAmount, Double exchangeRate) {
//        this.sourceCurrency = sourceCurrency;
//        this.targetCurrency = targetCurrency;
//        this.convertedAmount = convertedAmount;
//        this.exchangeRate = exchangeRate;
//    }

