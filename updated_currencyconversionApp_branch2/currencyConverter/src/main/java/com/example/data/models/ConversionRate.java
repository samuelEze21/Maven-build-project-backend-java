package com.example.data.models;


import jdk.jfr.Timestamp;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "conversion_rates")
public class ConversionRate {

    @Id
    private String id;
    private String fromCurrencyCode;
    private String toCurrencyCode;
    private double rate;
    private Timestamp timestamp;
}
