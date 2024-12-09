package org.africa.semicolon.quidexCurrencyApplication.data.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "currency")

public class Currency {

    @Id
    private String id;
    private String currencyCode;
    private String currencyName;
    private String symbol;
}









