package com.example.feedreader.listener;

import com.example.feedreader.enums.OperationType;
import com.example.feedreader.model.Feed;
import com.example.feedreader.service.FeedService;
import com.example.feedreader.util.ApplicationContextProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Consumer implements Runnable {

    private  CustomBlockingQueue customBlockingQueue;

    public Consumer(CustomBlockingQueue customBlockingQueue) {
        this.customBlockingQueue = customBlockingQueue;
    }

    @Override
    public void run() {

        try {
            Feed feed=customBlockingQueue.take();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
