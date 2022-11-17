package com.example.feedreader.controller;

import com.example.feedreader.model.QueueRequest;
import com.example.feedreader.service.RabbitQueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QueueController {
    @Autowired
    private RabbitQueueService rabbitQueueService;

    @PostMapping("queue/add")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void add(@RequestBody QueueRequest queueRequest) {
        rabbitQueueService.addNewQueue(queueRequest.getName(), queueRequest.getExchangeName(), null);

    }

    @PostMapping("exchange/add")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void addExchange(@RequestBody QueueRequest queueRequest) {
        rabbitQueueService.addExchange(queueRequest.getName(), queueRequest.getExchangeName());

    }
}
