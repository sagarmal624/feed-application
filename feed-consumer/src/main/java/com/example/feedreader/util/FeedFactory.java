package com.example.feedreader.util;

import com.example.feedreader.enums.FeedType;
import com.example.feedreader.model.Event;
import com.example.feedreader.model.Feed;
import com.example.feedreader.model.Market;
import com.example.feedreader.model.Outcome;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.core.Message;

import java.util.Map;
import java.util.Objects;

public class FeedFactory {

    public static Feed getFeed(Message message) {
        try {
            ObjectMapper objectMapper=new ObjectMapper();
            Map map = objectMapper.readValue(message.getBody(), Map.class);
            String type = map.get("type").toString();
            switch (Objects.requireNonNull(FeedType.getType(type))) {
                case EVENT:
                    return objectMapper.convertValue(map, Event.class);
                case MARKET:
                    return objectMapper.convertValue(map, Market.class);
                case OUTCOME:
                    return objectMapper.convertValue(map, Outcome.class);
                default:
                    throw new RuntimeException("Feed Type does not match so provide valid Feed Type");
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return null;
    }
}



