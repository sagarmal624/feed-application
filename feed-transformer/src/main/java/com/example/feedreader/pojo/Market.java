package com.example.feedreader.pojo;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Market extends Feed {
    private String eventId;
    private String marketId;
}
