package org.africa.semicolon.quidexCurrencyApplication.data.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "currencies") // Marks this class as a MongoDB collection
public class Currency {

    @Id // Primary key for MongoDB
    private String id;

    private String currencyCode;
    private String currencyName;
    private String symbol;
}









