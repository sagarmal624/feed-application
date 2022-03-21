package com.example.feedreader.service;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.feedreader.pojo.Feed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {RabbitMQProducer.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class RabbitMQProducerTest {
    @MockBean
    private AmqpTemplate amqpTemplate;

    @Autowired
    private RabbitMQProducer rabbitMQProducer;

    @Test
    public void testSend() throws AmqpException {
        doNothing().when(this.amqpTemplate).convertAndSend((String) any(), (String) any(), (Object) any());
        Feed feed = mock(Feed.class);
        when(feed.isDisplayed()).thenReturn(true);
        when(feed.isSuspended()).thenReturn(true);
        when(feed.getMsgId()).thenReturn(123);
        when(feed.getTimestamp()).thenReturn(10L);
        when(feed.getName()).thenReturn("Name");
        when(feed.getOperation()).thenReturn("Operation");
        when(feed.getType()).thenReturn("Type");
        this.rabbitMQProducer.send(feed);
        verify(this.amqpTemplate).convertAndSend((String) any(), (String) any(), (Object) any());

    }
}

