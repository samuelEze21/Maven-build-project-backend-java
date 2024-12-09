package com.example.dto.responses;


import lombok.Data;

@Data
public class UserRegistrationResponseDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String message;

}


