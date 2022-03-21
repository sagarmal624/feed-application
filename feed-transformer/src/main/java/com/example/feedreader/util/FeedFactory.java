package com.example.feedreader.util;

import com.example.feedreader.enums.FeedType;
import com.example.feedreader.pojo.Feed;
import com.example.feedreader.util.FeedUtils;

import java.util.List;
import java.util.Objects;

public class FeedFactory {

    public static Feed getFeed(String payloadMessage) {
        List<String> payload = FeedUtils.getPayload(payloadMessage);
        FeedType feedType = FeedType.getType(payload.get(2));
        switch (Objects.requireNonNull(feedType)) {
            case EVENT:
                return FeedUtils.getEvent(payload);
            case MARKET:
                return FeedUtils.getMarket(payload);
            case OUTCOME:
                return FeedUtils.getOutCome(payload);
            default:
                throw new RuntimeException("Feed Type is not exist");
        }
    }


}
