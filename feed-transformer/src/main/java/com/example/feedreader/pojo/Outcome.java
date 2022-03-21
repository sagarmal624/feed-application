package com.example.feedreader.pojo;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Outcome extends Feed {
    private String marketId;
    private String outcomeId;
    private String price;
}
