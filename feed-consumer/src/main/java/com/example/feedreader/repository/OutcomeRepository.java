package com.example.feedreader.repository;

import com.example.feedreader.model.Outcome;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OutcomeRepository extends MongoRepository<Outcome, String> {
    public Optional<Outcome> findByOutcomeId(String outcomeId);
}
