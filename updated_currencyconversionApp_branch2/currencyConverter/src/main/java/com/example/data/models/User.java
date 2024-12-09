package com.example.data.models;


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


