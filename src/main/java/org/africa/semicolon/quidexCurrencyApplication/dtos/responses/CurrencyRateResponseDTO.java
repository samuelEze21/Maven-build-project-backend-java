package org.africa.semicolon.quidexCurrencyApplication.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class CurrencyRateResponseDTO {

//    private String currencyCode;
//    private String baseCurrencyCode;
    private String targetCurrency;
    private String sourceCurrency;
    private Double rate;


}









//    public CurrencyRateResponseDTO(String currencyCode, String baseCurrencyCode, Double rate) {
//        this.currencyCode = currencyCode;
//        this.baseCurrencyCode = baseCurrencyCode;
//        this.rate = rate;
//
//        private String sourceCurrency;
//        private String targetCurrency;
//        private double amount;
//        private double convertedAmount;

