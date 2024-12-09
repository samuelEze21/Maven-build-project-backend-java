package com.example.service;

import com.example.dto.requests.UserRegistrationRequestDTO;
import com.example.dto.responses.UserRegistrationResponseDTO;

public interface UserService {
    UserRegistrationResponseDTO registerUser(UserRegistrationRequestDTO requestDTO);
}

//    //UserRegistrationResponseDTO loginUser(UserLoginRequestDTO userLoginRequestDTO);


