package com.example.feedreader.listener;

import com.example.feedreader.enums.OperationType;
import com.example.feedreader.model.Feed;
import com.example.feedreader.service.FeedService;
import com.example.feedreader.util.ApplicationContextProvider;
import com.example.feedreader.util.FeedFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FeedListner implements MessageListener {
    @Autowired
    private CustomBlockingQueue customBlockingQueue;
    @Autowired
    Consumer consumer;

    public void onMessage(Message message) {
        Feed feed = FeedFactory.getFeed(message);
        System.out.println("Recieved Messaged and Puting in quque" + feed.toString());
        try {
            customBlockingQueue.put(feed);
            new Thread(consumer).start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}