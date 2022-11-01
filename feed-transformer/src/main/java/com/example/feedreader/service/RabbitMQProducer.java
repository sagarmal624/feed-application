package com.example.feedreader.service;

import com.example.feedreader.pojo.Feed;
import org.apache.camel.Handler;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class RabbitMQProducer {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    @Autowired
    private RabbitAdmin rabbitAdmin;

    @Value("${feed.rabbitmq.exchange}")
    private String exchange;


    public void bindToKey(Feed feed,String key) {
        rabbitAdmin.declareBinding(new Binding(feed.getType(), Binding.DestinationType.QUEUE, exchange,
                key, null)); // re-declare binding if mask changed
    }

    @Handler
    public void send(Feed feed) {
        String key=getRandomNumber();

        bindToKey(feed,key);

        rabbitTemplate.convertAndSend(exchange, getRandomNumber(), feed);
        System.out.println("Send msg = " + feed);
    }
    public String getRandomNumber() {
        int min=0;
        int max=4;
        return String.valueOf((int)(Math.random() * (max - min)) + min);
    }
}
