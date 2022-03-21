package com.example.feedreader.pojo;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Event extends Feed {
    private String eventId;
    private String category;
    private String subCategory;
    private Long startTime;
}

