package com.example.feedreader.listener;

import java.io.UnsupportedEncodingException;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {FeedListner.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class FeedListnerTest {
    @Autowired
    private FeedListner feedListner;

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testOnMessage() throws UnsupportedEncodingException {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.example.feedreader.listener.FeedListner.onMessage(FeedListner.java:17)
        //   In order to prevent onMessage(Message)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   onMessage(Message).
        //   See https://diff.blue/R013 to resolve this issue.

        byte[] body = "AAAAAAAA".getBytes("UTF-8");
        this.feedListner.onMessage(new Message(body, new MessageProperties()));
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testOnMessage2() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.example.feedreader.listener.FeedListner.onMessage(FeedListner.java:17)
        //   In order to prevent onMessage(Message)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   onMessage(Message).
        //   See https://diff.blue/R013 to resolve this issue.

        this.feedListner.onMessage(new Message(new byte[]{}, new MessageProperties()));
    }

    @Test
    @Ignore("TODO: This test is incomplete")
    public void testOnMessage3() {
        // TODO: This test is incomplete.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.example.feedreader.listener.FeedListner.onMessage(FeedListner.java:17)
        //   In order to prevent onMessage(Message)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   onMessage(Message).
        //   See https://diff.blue/R013 to resolve this issue.

        this.feedListner.onMessage(null);
    }
}

