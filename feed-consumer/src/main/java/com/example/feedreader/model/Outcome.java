package com.example.feedreader.model;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "outcome")
public class Outcome extends Feed {
    @Indexed
    private String marketId;
    @Indexed
    private String outcomeId;
    private String price;
}
