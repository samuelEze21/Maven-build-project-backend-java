package org.africa.semicolon.quidexCurrencyApplication.controllers;

import lombok.AllArgsConstructor;
import org.africa.semicolon.quidexCurrencyApplication.Exception.CurrencyConverterException;
import org.africa.semicolon.quidexCurrencyApplication.dtos.requests.UserRegistrationRequestDTO;
import org.africa.semicolon.quidexCurrencyApplication.dtos.responses.ApiResponse;
import org.africa.semicolon.quidexCurrencyApplication.dtos.responses.UserRegistrationResponseDTO;
import org.africa.semicolon.quidexCurrencyApplication.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.BAD_REQUEST;

@AllArgsConstructor
@RestController
@RequestMapping("/api/users") // Base endpoint for user-related operations
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<ApiResponse> registerUser(@RequestBody UserRegistrationRequestDTO userRegistrationRequestDTO) {
        try {
            UserRegistrationResponseDTO result = userService.registerUser(userRegistrationRequestDTO);
            return ResponseEntity.status(CREATED).body(new ApiResponse(true, result));
        } catch (CurrencyConverterException exception) {
            return ResponseEntity.status(BAD_REQUEST).body(new ApiResponse(false, exception.getMessage()));
        }
    }
}


//
//
//    @PostMapping("/registerUser")
//    public ResponseEntity<?> registerUser(@RequestBody UserRegistrationRequestDTO userregistrationRequestDTO) {
//        try {
//            UserRegistrationResponseDTO result = userService.registerUser(userregistrationRequestDTO);
//            return new ResponseEntity<>(new ApiResponse(true,result),CREATED);
//        } catch (CurrencyConverterException exception) {
//            return new ResponseEntity<>(new ApiResponse(false, exception.getMessage(), BAD_REQUEST))
//        }
//    }
//}







//
//
//
//package org.africa.semicolon.quidexCurrencyApplication.controllers;
//import lombok.AllArgsConstructor;
//import org.africa.semicolon.quidexCurrencyApplication.Exception.CurrencyConverterException;
//import org.africa.semicolon.quidexCurrencyApplication.dtos.requests.UserRegistrationRequestDTO;
//import org.africa.semicolon.quidexCurrencyApplication.dtos.responses.ApiResponse;
//import org.africa.semicolon.quidexCurrencyApplication.dtos.responses.UserRegistrationResponseDTO;
//import org.africa.semicolon.quidexCurrencyApplication.data.models.User;
//import org.africa.semicolon.quidexCurrencyApplication.services.UserService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import static org.springframework.data.mongodb.core.messaging.Task.State.CREATED;
//import static sun.security.timestamp.TSResponse.BAD_REQUEST;
//
//




//
//    @PostMapping("/login")
//    public ResponseEntity<User> loginUser(@RequestBody User user) {
//        User savedUser = userRepository.save(user);
//        return ResponseEntity.ok(savedUser);
//    }
//
//}
