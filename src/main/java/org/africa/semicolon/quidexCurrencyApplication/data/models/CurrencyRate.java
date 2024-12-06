package org.africa.semicolon.quidexCurrencyApplication.data.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Document(collection = "currency_rates") // Marks this class as a MongoDB collection
public class CurrencyRate {

    @Id
    private String id;

    @NotNull
    private String fromCurrencyCode;  // e.g., USD
    @NotNull
    private String toCurrencyCode;    // e.g., EUR
    @NotNull
    private Double exchangeRate;      // e.g., 0.85 (USD to EUR)

    private LocalDateTime lastUpdated; // Timestamp when the rate was last updated

}
