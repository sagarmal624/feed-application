package com.example.feedreader.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

@Data
@ToString
public class Feed {
    @Id
    private String id;
    @Transient
    private Integer msgId;
    @Transient
    private String operation;
    @Transient
    private String type;
    private Long timestamp;
    private boolean displayed;
    private boolean suspended;
    private String name;
}
