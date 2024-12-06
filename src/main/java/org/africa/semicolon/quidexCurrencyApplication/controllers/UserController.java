package org.africa.semicolon.quidexCurrencyApplication.controllers;
import org.africa.semicolon.quidexCurrencyApplication.repositories.UserRepository;
import org.africa.semicolon.quidexCurrencyApplication.data.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/users") // Base endpoint for user-related operations
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @PostMapping
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }
}
