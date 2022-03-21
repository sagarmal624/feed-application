package com.example.feedreader.util;

import static org.junit.Assert.assertNull;

import java.io.UnsupportedEncodingException;

import org.junit.Test;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;

public class FeedFactoryTest {
    @Test
    public void testGetFeed() throws UnsupportedEncodingException {
        byte[] body = "AAAAAAAA".getBytes("UTF-8");
        assertNull(FeedFactory.getFeed(new Message(body, new MessageProperties())));
    }

    @Test
    public void testGetFeed2() throws UnsupportedEncodingException {
        byte[] body = "XAAAAAAA".getBytes("UTF-8");
        assertNull(FeedFactory.getFeed(new Message(body, new MessageProperties())));
    }

    @Test
    public void testGetFeed3() {
        assertNull(FeedFactory.getFeed(new Message(new byte[]{}, new MessageProperties())));
    }

    @Test
    public void testGetFeed4() {
        assertNull(FeedFactory.getFeed(null));
    }
}

