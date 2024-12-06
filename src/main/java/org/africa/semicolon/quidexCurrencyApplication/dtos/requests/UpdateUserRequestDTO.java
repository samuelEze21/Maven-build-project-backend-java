package org.africa.semicolon.quidexCurrencyApplication.dtos.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import lombok.Data;



@Data
public class UpdateUserRequestDTO {

    @NotBlank(message = "User ID is required")
    private String id;

    private String username;

    private String password;

    @Email(message = "Invalid email format")
    private String email;

}


