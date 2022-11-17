package com.example.feedreader.listener;

import com.example.feedreader.enums.OperationType;
import com.example.feedreader.model.Feed;
import com.example.feedreader.service.FeedService;
import com.example.feedreader.util.ApplicationContextProvider;
import com.example.feedreader.util.FeedFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FeedListner implements MessageListener{
    @RabbitListener(id = "feedExchange-1", queues = "feed-1")
    public void onMessage(Message message) {
        System.out.println("Recieved Messaged from queue="+message.getMessageProperties().getConsumerQueue()+", Exchange="+message.getMessageProperties().getReceivedExchange());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // Feed feed = FeedFactory.getFeed(message);
//        System.out.println("Recieved Messaged and Puting in quque" + feed.toString());
//        FeedService feedService = ApplicationContextProvider.getApplicationContext().getBean(feed.getType() + "Service", FeedService.class);
//        if (feed.getOperation().toUpperCase().equals(OperationType.CREATE.name())) {
//            feedService.create(feed);
//        } else if (feed.getOperation().toUpperCase().equals(OperationType.UPDATE.name())) {
//            feedService.update(feed);
//        } else {
//            throw new RuntimeException("operation type deos not match.");
//        }

    }

}