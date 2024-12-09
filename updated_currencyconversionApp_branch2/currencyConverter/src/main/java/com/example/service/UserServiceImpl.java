package com.example.service;


import com.example.data.models.User;
import com.example.data.repositories.UserRepository;
import com.example.dto.requests.UserRegistrationRequestDTO;
import com.example.dto.responses.UserRegistrationResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

        @Override
        public UserRegistrationResponseDTO registerUser(UserRegistrationRequestDTO requestDTO) {

            // Create a new User object from the request DTO
            User newUser = new User();
            newUser.setFirstName(requestDTO.getFirstName());
            newUser.setLastName(requestDTO.getLastName());
            newUser.setEmail(requestDTO.getEmail());
            newUser.setUserName(requestDTO.getUsername());
            newUser.setPassword(requestDTO.getPassword());

            // Save the user to the repository
            User savedUser = userRepository.save(newUser);

            // Create and return the response DTO
            UserRegistrationResponseDTO responseDTO = new UserRegistrationResponseDTO();
            responseDTO.setId(savedUser.getId());
            responseDTO.setFirstName(savedUser.getFirstName());
            responseDTO.setLastName(savedUser.getLastName());
            responseDTO.setEmail(savedUser.getEmail());
            responseDTO.setUsername(savedUser.getUserName());
            responseDTO.setMessage("User registration successful");


            return responseDTO;
        }
    }



