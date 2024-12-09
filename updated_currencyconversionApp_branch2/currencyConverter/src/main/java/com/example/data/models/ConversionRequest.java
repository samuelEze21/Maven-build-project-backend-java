package com.example.data.models;


import jdk.jfr.Timestamp;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "conversion_requests")

public class ConversionRequest {

    @Id
    private String id;
    private Currency fromCurrency;
    private Currency toCurrency;
    private double amount;
    private double convertedAmount;
    private Timestamp timestamp;

}
