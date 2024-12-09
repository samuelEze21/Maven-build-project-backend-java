package com.example.dto.requests;


import lombok.Data;

@Data
public class UserRegistrationRequestDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;



}

