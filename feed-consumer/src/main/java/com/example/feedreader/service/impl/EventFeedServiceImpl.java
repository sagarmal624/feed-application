package com.example.feedreader.service.impl;

import com.example.feedreader.model.Event;
import com.example.feedreader.model.Feed;
import com.example.feedreader.repository.EventRepository;
import com.example.feedreader.service.FeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("eventService")
public class EventFeedServiceImpl implements FeedService {
    @Autowired
    private EventRepository eventRepository;

    @Override
    public void create(Feed feed) {
        eventRepository.save((Event) feed);
    }

    @Override
    public void update(Feed feed) {
        Event event = (Event) feed;
        Optional<Event> eventOptional = eventRepository.findByEventId(event.getEventId());
        Event dbEvent = eventOptional.orElseThrow(() -> new RuntimeException("Event not found in db for update operation"));
        event.setId(dbEvent.getId());
        eventRepository.save(event);
    }
}
