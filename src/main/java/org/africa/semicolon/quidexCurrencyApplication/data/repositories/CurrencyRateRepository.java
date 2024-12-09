package org.africa.semicolon.quidexCurrencyApplication.data.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.africa.semicolon.quidexCurrencyApplication.data.models.CurrencyRate;

import java.util.Optional;

public interface CurrencyRateRepository extends MongoRepository<CurrencyRate, String> {
    Optional<CurrencyRate> findByFromCurrencyCodeAndToCurrencyCode(String fromCurrencyCode, String toCurrencyCode);
}




