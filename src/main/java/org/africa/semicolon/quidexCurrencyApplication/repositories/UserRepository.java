package org.africa.semicolon.quidexCurrencyApplication.repositories;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.africa.semicolon.quidexCurrencyApplication.data.models.User;

import org.springframework.stereotype.Repository;
import java.util.Optional;



@Repository
public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username); // Example of a custom query method

    Optional<User> findByEmail(@Email(message = "Invalid email format") @NotBlank(message = "Email is required") String email);
//    Optional<User> findByEmail(String email);
}





