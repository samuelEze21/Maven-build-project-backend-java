package africa.semicolon.quidexCurrencyApplication.services;

import org.africa.semicolon.quidexCurrencyApplication.data.models.User;
import org.africa.semicolon.quidexCurrencyApplication.dtos.requests.UserLoginRequestDTO;
import org.africa.semicolon.quidexCurrencyApplication.dtos.requests.UserRegistrationRequestDTO;
import org.africa.semicolon.quidexCurrencyApplication.dtos.responses.UserResponseDTO;
import org.africa.semicolon.quidexCurrencyApplication.repositories.UserRepository;
import org.africa.semicolon.quidexCurrencyApplication.services.UserService;
import org.africa.semicolon.quidexCurrencyApplication.services.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@SpringBootConfiguration
class UserServiceImplTest {

    @Autowired
    private UserService userService;
    private UserRepository userRepository;

//    @BeforeEach
//    void setUp() {
//        userRepository.deleteAll(); // Clear the database before each test
//    }

    @Test
    void testCreateUser() {
        UserRegistrationRequestDTO request = new UserRegistrationRequestDTO();
        request.setUserName("Esther Johnson");
        request.setEmail("Nkechiesther@gmail.com");
        request.setPassword("password123");

        UserResponseDTO response = userService.registerUser(request);

        assertNotNull(response);
        assertNotNull(response.getId());
        assertEquals("User registered successfully", response.getMessage());

        // Validate the user is saved in the repository
        User savedUser = userRepository.findByEmail("Nkechiesther@gmail.com").orElse(null);
        assertNotNull(savedUser);
        assertEquals("Esther Johnson", savedUser.getUserName());
    }

    @Test
    void testLoginUser_success() {
        // First, register a user
        User user = new User();
        user.setUserName("Esther Johnson");
        user.setEmail("Nkechiesther@gmail.com");
        user.setPassword("password123");
        userRepository.save(user);

        // Now test login
        UserLoginRequestDTO request = new UserLoginRequestDTO();
        request.setEmail("Nkechiesther@gmail.com");
        request.setPassword("password123");

        UserResponseDTO response = userService.loginUser(request);

        assertNotNull(response);
        assertEquals(user.getId(), response.getId());
        assertEquals("Login successful", response.getMessage());
    }

    @Test
    void testLoginUser_failure() {
        UserLoginRequestDTO request = new UserLoginRequestDTO();
        request.setEmail("non.existent@example.com");
        request.setPassword("wrongpassword");

        Exception exception = assertThrows(RuntimeException.class, () -> {
            userService.loginUser(request);
        });

        assertEquals("Invalid login credentials", exception.getMessage());
    }
}
