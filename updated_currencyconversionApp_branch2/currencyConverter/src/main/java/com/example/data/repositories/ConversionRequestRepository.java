package com.example.data.repositories;

import com.example.data.models.ConversionRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConversionRequestRepository extends MongoRepository<ConversionRequest, String> {
    Optional<ConversionRequest>findById(String id);
}