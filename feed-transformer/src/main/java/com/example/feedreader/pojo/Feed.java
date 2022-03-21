package com.example.feedreader.pojo;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@ToString
public class Feed {
    private Integer msgId;
    private String operation;
    private String type;
    private Long timestamp;
    private boolean displayed;
    private boolean suspended;
    private String name;
}
