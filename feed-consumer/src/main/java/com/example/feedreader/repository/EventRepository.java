package com.example.feedreader.repository;

import com.example.feedreader.model.Event;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EventRepository extends MongoRepository<Event,String> {
    public Optional<Event> findByEventId(String eventId);

}
