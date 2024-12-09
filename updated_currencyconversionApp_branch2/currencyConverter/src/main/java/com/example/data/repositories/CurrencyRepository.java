package com.example.data.repositories;

import com.example.data.models.Currency;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CurrencyRepository extends MongoRepository<Currency, String> {
    Optional<Currency> findByCode(String code);

}

