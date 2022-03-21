package com.example.feedreader.camel.routes;

import com.example.feedreader.pojo.Feed;
import com.example.feedreader.util.FeedFactory;

public class FeedTransformer {
    public Feed convert(String body) throws Exception {
        return FeedFactory.getFeed(body);
    }
}
