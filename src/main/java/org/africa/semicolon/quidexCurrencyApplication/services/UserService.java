package org.africa.semicolon.quidexCurrencyApplication.services;

import org.africa.semicolon.quidexCurrencyApplication.dtos.requests.UserLoginRequestDTO;
import org.africa.semicolon.quidexCurrencyApplication.dtos.requests.UserRegistrationRequestDTO;
import org.africa.semicolon.quidexCurrencyApplication.dtos.responses.UserRegistrationResponseDTO;
import org.springframework.stereotype.Service;


public interface UserService {
    UserRegistrationResponseDTO registerUser(UserRegistrationRequestDTO userRegistrationRequestDTO);
    //UserRegistrationResponseDTO loginUser(UserLoginRequestDTO userLoginRequestDTO);

}
