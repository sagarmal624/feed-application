package com.example.feedreader.service.impl;

import com.example.feedreader.model.Feed;
import com.example.feedreader.model.Market;
import com.example.feedreader.repository.MarketRepository;
import com.example.feedreader.service.FeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("marketService")
public class MarketFeedServiceImpl implements FeedService {
    @Autowired
    private MarketRepository marketRepository;

    @Override
    public void create(Feed feed) {
        marketRepository.save((Market) feed);
    }

    @Override
    public void update(Feed feed) {
        Market Market = (Market) feed;
        Optional<Market> marketOptional = marketRepository.findByMarketId(Market.getMarketId());
        Market dbMarket = marketOptional.orElseThrow(() -> new RuntimeException("Market not found in db for update operation"));
        Market.setId(dbMarket.getId());
        marketRepository.save(Market);
    }
}
