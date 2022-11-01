package com.example.feedreader.listener;
import com.example.feedreader.enums.OperationType;
import com.example.feedreader.model.Feed;
import com.example.feedreader.service.FeedService;
import com.example.feedreader.util.ApplicationContextProvider;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
@Component
public class CustomBlockingQueue {
    private Queue<Feed> queue = new LinkedList<Feed>();
    private int capacity;
    private Lock lock = new ReentrantLock();
    private Condition notFull = lock.newCondition();
    private Condition notEmpty = lock.newCondition();

    public CustomBlockingQueue() {
        this.capacity = 15;
    }

    public void put(Feed element) throws InterruptedException {
        lock.lock();
        try {
            while (queue.size() == capacity) {
                notFull.await();
            }
            queue.add(element);
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public Feed take() throws InterruptedException {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                notEmpty.await();
            }
            Thread.sleep(3000);
            Feed feed = queue.remove();
            System.out.println("started execution...."+feed.toString());
            FeedService feedService = ApplicationContextProvider.getApplicationContext().getBean(feed.getType() + "Service", FeedService.class);
            if (feed.getOperation().toUpperCase().equals(OperationType.CREATE.name())) {
                feedService.create(feed);
            } else if (feed.getOperation().toUpperCase().equals(OperationType.UPDATE.name())) {
                feedService.update(feed);
            } else {
                throw new RuntimeException("operation type deos not match.");
            }

            System.out.println("end execution...."+feed.toString());
            notFull.signal();

            return feed;
        } finally {
            lock.unlock();
        }
    }
}
