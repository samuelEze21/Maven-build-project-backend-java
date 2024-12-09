package org.africa.semicolon.quidexCurrencyApplication.data.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Document(collection = "currency_rates")
public class CurrencyRate {

    @Id
    private String id;

    @NotNull
    private String fromCurrencyCode;
    @NotNull
    private String toCurrencyCode;

    private LocalDateTime lastUpdated;

}
