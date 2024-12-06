package org.africa.semicolon.quidexCurrencyApplication.dtos.requests;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class CurrencyRateRequestDTO {

    @NotBlank(message = "Source currency is required")
    private String sourceCurrency;

    @NotBlank(message = "Target currency is required")
    private String targetCurrency;

    private Double rate;

}
