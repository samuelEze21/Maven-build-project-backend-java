package org.africa.semicolon.quidexCurrencyApplication.data.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@Document
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String userName;


}

