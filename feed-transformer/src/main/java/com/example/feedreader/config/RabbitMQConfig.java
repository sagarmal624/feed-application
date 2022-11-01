package com.example.feedreader.config;


import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Value("${feed.rabbitmq.queue}")
    String queueName;

    @Value("${feed.rabbitmq.exchange}")
    String exchange;

    @Value("${feed.rabbitmq.routingkey}")
    private String routingkey;

    @Bean
    Queue eventQueue() {
        return new Queue("event", false);
    }
    @Bean
    Queue outcomeQueue() {
        return new Queue("outcome", false);
    }
    @Bean
    Queue marketQueue() {
        return new Queue("market", false);
    }
    @Bean
    DirectExchange exchange() {
        return new DirectExchange(exchange);
    }


    @Bean
    public MessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public RabbitAdmin rabbitAdmin(ConnectionFactory connectionFactory) {
       return new RabbitAdmin(connectionFactory);
    }

    @Bean
    public AmqpTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(jsonMessageConverter());
        return rabbitTemplate;
    }
}