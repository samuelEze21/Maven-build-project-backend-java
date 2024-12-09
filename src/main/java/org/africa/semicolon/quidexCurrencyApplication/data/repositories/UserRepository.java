package org.africa.semicolon.quidexCurrencyApplication.data.repositories;

import org.africa.semicolon.quidexCurrencyApplication.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}