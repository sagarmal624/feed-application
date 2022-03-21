package com.example.feedreader.service;

import com.example.feedreader.pojo.Feed;
import org.apache.camel.Handler;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQProducer {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${feed.rabbitmq.exchange}")
    private String exchange;

    @Value("${feed.rabbitmq.routingkey}")
    private String routingkey;

    @Handler
    public void send(Feed feed) {
        rabbitTemplate.convertAndSend(exchange, routingkey, feed);
        System.out.println("Send msg = " + feed);
    }
}
