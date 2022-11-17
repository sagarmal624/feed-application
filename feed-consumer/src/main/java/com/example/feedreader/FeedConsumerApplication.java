package com.example.feedreader;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class FeedConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeedConsumerApplication.class, args);
    }

    @Bean
    @Primary
    public RabbitListenerEndpointRegistry rabbitListenerEndpointRegistry() {
        return  new RabbitListenerEndpointRegistry();
    }
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
