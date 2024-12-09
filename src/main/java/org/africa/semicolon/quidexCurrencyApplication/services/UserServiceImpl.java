
package org.africa.semicolon.quidexCurrencyApplication.services;

import lombok.AllArgsConstructor;
import org.africa.semicolon.quidexCurrencyApplication.Exception.InvalidLoginException;
import org.africa.semicolon.quidexCurrencyApplication.data.models.User;
import org.africa.semicolon.quidexCurrencyApplication.dtos.requests.UserLoginRequestDTO;
import org.africa.semicolon.quidexCurrencyApplication.dtos.requests.UserRegistrationRequestDTO;
import org.africa.semicolon.quidexCurrencyApplication.dtos.responses.UserRegistrationResponseDTO;
import org.africa.semicolon.quidexCurrencyApplication.data.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@AllArgsConstructor
public class   UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    @Override
    public UserRegistrationResponseDTO registerUser(UserRegistrationRequestDTO userRegistrationRequestDTO) {
        User user = new User();
        user.setUserName(userRegistrationRequestDTO.getUserName());
        user.setEmail(userRegistrationRequestDTO.getEmail());
        user.setPassword(userRegistrationRequestDTO.getPassword());

        User savedUser = userRepository.save(user);
        UserRegistrationResponseDTO response = new UserRegistrationResponseDTO();


//        response.setId(savedUser.getId());
        response.setMessage("User registered successfully");
        return response;
    }


//    @Override
//    public UserRegistrationResponseDTO loginUser(UserLoginRequestDTO userLoginRequestDTO) {
//        Optional<User> user = userRepository.findByEmail(userLoginRequestDTO.getEmail());
//        if (user.isPresent() && user.get().getPassword().equals(userLoginRequestDTO.getPassword())) {
//            throw new InvalidLoginException("Invalid login credentials");
//        }
//
//        UserRegistrationResponseDTO response = new UserRegistrationResponseDTO();
//        response.setId("");
//        response.setMessage("Login successful");
//        return response;
//
//
//    }
}

