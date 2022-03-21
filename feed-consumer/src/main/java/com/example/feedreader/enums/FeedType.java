package com.example.feedreader.enums;

public enum FeedType {
    EVENT("event"), MARKET("market"), OUTCOME("outcome");
    private final String type;

    FeedType(String type) {
        this.type = type;
    }

    public static FeedType getType(String type) {
        for (FeedType feedType : FeedType.values()) {
            if (feedType.type.equals(type))
                return feedType;
        }
        return null;
    }
}
