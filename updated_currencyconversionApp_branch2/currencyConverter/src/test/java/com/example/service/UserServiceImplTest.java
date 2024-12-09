package com.example.service;


import com.example.data.models.User;
import com.example.data.repositories.UserRepository;
import com.example.dto.requests.UserRegistrationRequestDTO;
import com.example.dto.responses.UserRegistrationResponseDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;



@SpringBootTest
@ActiveProfiles("test")
@Transactional
class UserServiceIntegrationTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;


    @Test
    void testRegisterUser_Success() {

        UserRegistrationRequestDTO requestDTO = new UserRegistrationRequestDTO();

        requestDTO.setFirstName("John");
        requestDTO.setLastName("Doe");
        requestDTO.setEmail("john.doe@example.com");
        requestDTO.setUsername("johndoe");
        requestDTO.setPassword("password123");

        UserRegistrationResponseDTO responseDTO = userService.registerUser(requestDTO);

        assertNotNull(responseDTO);
        assertNotNull(responseDTO.getId());
        assertEquals("John", responseDTO.getFirstName());
        assertEquals("Doe", responseDTO.getLastName());
        assertEquals("john.doe@example.com", responseDTO.getEmail());
        assertEquals("johndoe", responseDTO.getUsername());
        assertEquals("User registration successful", responseDTO.getMessage());

        User savedUser = userRepository.findById(responseDTO.getId()).orElseThrow();
        assertNotNull(savedUser);
        assertEquals("John", savedUser.getFirstName());
        assertEquals("john.doe@example.com", savedUser.getEmail());
    }
}









