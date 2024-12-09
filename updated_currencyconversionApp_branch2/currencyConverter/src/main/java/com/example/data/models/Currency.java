package com.example.data.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@Document
public class Currency {
    @Id
    private String identifier;

    private String currency_code;
    private String currency_name;
    private String currency_symbol;

}

