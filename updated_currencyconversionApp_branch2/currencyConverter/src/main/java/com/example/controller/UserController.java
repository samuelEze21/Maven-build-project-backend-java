package com.example.controller;


import com.example.dto.requests.UserRegistrationRequestDTO;
import com.example.dto.responses.UserRegistrationResponseDTO;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public UserRegistrationResponseDTO registerUser(@RequestBody UserRegistrationRequestDTO requestDTO) {
        return userService.registerUser(requestDTO);
    }
}



//
//
//
//import lombok.AllArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.dto.requests.UserRegistrationRequestDTO;
//import com.example.dto.responses.UserRegistrationResponseDTO;
//import com.example.service.UserService;
//import static org.springframework.http.HttpStatus.BAD_REQUEST;
//import static org.springframework.http.HttpStatus.CREATED;
//import org.springframework.http.ResponseEntity;
////import com.example.Exception.CurrencyConverterException;
//
//
//
//@AllArgsConstructor
//@RestController
//@RequestMapping("/api/users") // Base endpoint for user-related operations
//public class UserController {
//
//    private final UserService userService;
//
//    @PostMapping("/register")
//    public ResponseEntity<ApiResponse> registerUser(@RequestBody UserRegistrationRequestDTO userRegistrationRequestDTO) {
//        try {
//            UserRegistrationResponseDTO result = userService.registerUser(userRegistrationRequestDTO);
//            return ResponseEntity.status(CREATED).body(new ApiResponse(true, result));
//        } catch (CurrencyConverterException exception) {
//            return ResponseEntity.status(BAD_REQUEST).body(new ApiResponse(false, exception.getMessage()));
//        }
//    }
//}
