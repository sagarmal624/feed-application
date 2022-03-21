package com.example.feedreader.model;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "event")
public class Event extends Feed {
   @Indexed
    private String eventId;
    private String category;
    private String subCategory;
    private Long startTime;
}

