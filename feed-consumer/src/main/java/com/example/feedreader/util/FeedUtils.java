package com.example.feedreader.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FeedUtils {
    public static List<String> getPayload(String message) {
         message=message.replaceAll("\\\\","#").replaceAll("#\\|","");
        return Arrays.stream(message.split("\\|")).skip(1).collect(Collectors.toList());
    }
}
