package org.africa.semicolon.quidexCurrencyApplication.services;

import org.africa.semicolon.quidexCurrencyApplication.dtos.requests.UserLoginRequestDTO;
import org.africa.semicolon.quidexCurrencyApplication.dtos.requests.UserRegistrationRequestDTO;
import org.africa.semicolon.quidexCurrencyApplication.dtos.responses.UserResponseDTO;



public interface UserService {
    UserResponseDTO registerUser(UserRegistrationRequestDTO userRegistrationRequestDTO);
    UserResponseDTO loginUser(UserLoginRequestDTO userLoginRequestDTO);

}
