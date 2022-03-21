package com.example.feedreader.model;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "market")
public class Market extends Feed {
    @Indexed
    private String eventId;
    @Indexed
    private String marketId;
}
