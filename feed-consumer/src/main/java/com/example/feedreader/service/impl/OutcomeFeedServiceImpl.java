package com.example.feedreader.service.impl;

import com.example.feedreader.model.Feed;
import com.example.feedreader.model.Outcome;
import com.example.feedreader.repository.OutcomeRepository;
import com.example.feedreader.service.FeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("outcomeService")
public class OutcomeFeedServiceImpl implements FeedService {
    @Autowired
    private OutcomeRepository outcomeRepository;

    @Override
    public void create(Feed feed) {
        outcomeRepository.save((Outcome) feed);
    }

    @Override
    public void update(Feed feed) {
        Outcome outcome = (Outcome) feed;
        Optional<Outcome> outcomeOptional = outcomeRepository.findByOutcomeId(outcome.getOutcomeId());
        Outcome dbOutcome = outcomeOptional.orElseThrow(() -> new RuntimeException("Outcome not found in db for update operation"));
        outcome.setId(dbOutcome.getId());
        outcomeRepository.save(outcome);
    }


}
