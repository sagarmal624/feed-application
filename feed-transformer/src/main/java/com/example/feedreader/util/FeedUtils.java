package com.example.feedreader.util;

import com.example.feedreader.pojo.Event;
import com.example.feedreader.pojo.Market;
import com.example.feedreader.pojo.Outcome;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FeedUtils {
    public static List<String> getPayload(String message) {
         message=message.replaceAll("\\\\","#").replaceAll("#\\|","");
        return Arrays.stream(message.split("\\|")).skip(1).collect(Collectors.toList());
    }

    private static boolean getBoolean(String num) {
        return num.equals("1");
    }

    public static Event getEvent(List<String> payload) {
        return Event.builder()
                .msgId(Integer.parseInt(payload.get(0)))
                .operation(payload.get(1))
                .type(payload.get(2))
                .timestamp(Long.parseLong(payload.get(3)))
                .eventId(payload.get(4))
                .category(payload.get(5))
                .subCategory(payload.get(6))
                .name(payload.get(7))
                .startTime(Long.parseLong(payload.get(8)))
                .displayed(getBoolean(payload.get(9)))
                .suspended(getBoolean(payload.get(10)))
                .build();
    }

    public static Market getMarket(List<String> payload) {
        return Market.builder()
                .msgId(Integer.parseInt(payload.get(0)))
                .operation(payload.get(1))
                .type(payload.get(2))
                .timestamp(Long.parseLong(payload.get(3)))
                .eventId(payload.get(4))
                .marketId(payload.get(5))
                .name(payload.get(6))
                .displayed(getBoolean(payload.get(7)))
                .suspended(getBoolean(payload.get(8)))
                .build();
    }

    public static Outcome getOutCome(List<String> payload) {
        return Outcome.builder()
                .msgId(Integer.parseInt(payload.get(0)))
                .operation(payload.get(1))
                .type(payload.get(2))
                .timestamp(Long.parseLong(payload.get(3)))
                .marketId(payload.get(5))
                .outcomeId(payload.get(4))
                .name(payload.get(6))
                .price(payload.get(7))
                .displayed(getBoolean(payload.get(8)))
                .suspended(getBoolean(payload.get(9)))
                .build();
    }

}
