
package org.africa.semicolon.quidexCurrencyApplication.services;

import lombok.AllArgsConstructor;
import org.africa.semicolon.quidexCurrencyApplication.data.models.User;
import org.africa.semicolon.quidexCurrencyApplication.dtos.requests.UserLoginRequestDTO;
import org.africa.semicolon.quidexCurrencyApplication.dtos.requests.UserRegistrationRequestDTO;
import org.africa.semicolon.quidexCurrencyApplication.dtos.responses.UserResponseDTO;
import org.africa.semicolon.quidexCurrencyApplication.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    @Override
    public UserResponseDTO registerUser(UserRegistrationRequestDTO userRegistrationRequestDTO) {
        User user = new User();
        user.setUserName(userRegistrationRequestDTO.getUserName());
        user.setEmail(userRegistrationRequestDTO.getEmail());
        user.setPassword(userRegistrationRequestDTO.getPassword());

        User savedUser = userRepository.save(user);
        UserResponseDTO response = new UserResponseDTO();
        response.setId(savedUser.getId());
        response.setMessage("User registered successfully");
        return response;
    }


    @Override
    public UserResponseDTO loginUser(UserLoginRequestDTO userLoginRequestDTO) {
        Optional<User> user = userRepository.findByEmail(userLoginRequestDTO.getEmail());
        if (user.isPresent() && user.get().getPassword().equals(userLoginRequestDTO.getPassword())) {
            UserResponseDTO response = new UserResponseDTO();
            response.setId(user.get().getId());
            response.setMessage("Login successful");
            return response;
        }
        throw new RuntimeException("Invalid login credentials");
    }
}

