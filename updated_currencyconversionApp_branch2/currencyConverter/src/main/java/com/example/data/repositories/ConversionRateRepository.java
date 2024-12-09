package com.example.data.repositories;

import com.example.data.models.ConversionRate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConversionRateRepository extends MongoRepository <ConversionRate, String> {
    Optional<ConversionRate> findById(String id);
}
