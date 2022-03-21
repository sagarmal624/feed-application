package com.example.feedreader.repository;

import com.example.feedreader.model.Market;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MarketRepository extends MongoRepository<Market, String> {
    public Optional<Market> findByMarketId(String marketId);

}
