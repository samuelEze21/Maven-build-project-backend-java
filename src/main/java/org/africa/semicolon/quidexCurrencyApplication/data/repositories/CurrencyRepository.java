package org.africa.semicolon.quidexCurrencyApplication.data.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.africa.semicolon.quidexCurrencyApplication.data.models.Currency;

import java.util.Optional;


public interface CurrencyRepository extends MongoRepository<Currency, String>  {
    Optional<Currency> findByCurrencyCode(String currencyCode); // Find a currency by its code
}
