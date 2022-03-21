package com.example.feedreader.service.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.feedreader.model.Event;
import com.example.feedreader.repository.EventRepository;

import java.util.Optional;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {EventFeedServiceImpl.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class EventFeedServiceImplTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Autowired
    private EventFeedServiceImpl eventFeedServiceImpl;

    @MockBean
    private EventRepository eventRepository;

    @Test
    public void testCreate() {
        Event event = new Event();
        event.setCategory("Category");
        event.setDisplayed(true);
        event.setEventId("42");
        event.setId("42");
        event.setMsgId(123);
        event.setName("Name");
        event.setOperation("Operation");
        event.setStartTime(1L);
        event.setSubCategory("Sub Category");
        event.setSuspended(true);
        event.setTimestamp(10L);
        event.setType("Type");
        when(this.eventRepository.save((Event) any())).thenReturn(event);

        Event event1 = new Event();
        event1.setCategory("Category");
        event1.setDisplayed(true);
        event1.setEventId("42");
        event1.setId("42");
        event1.setMsgId(123);
        event1.setName("Name");
        event1.setOperation("Operation");
        event1.setStartTime(1L);
        event1.setSubCategory("Sub Category");
        event1.setSuspended(true);
        event1.setTimestamp(10L);
        event1.setType("Type");
        event1.setDisplayed(true);
        event1.setId("42");
        event1.setMsgId(123);
        event1.setName("Name");
        event1.setOperation("Operation");
        event1.setSuspended(true);
        event1.setTimestamp(10L);
        event1.setType("Type");
        this.eventFeedServiceImpl.create(event1);
        verify(this.eventRepository).save((Event) any());
    }

    @Test
    public void testCreate2() {
        when(this.eventRepository.save((Event) any())).thenThrow(new RuntimeException("foo"));

        Event event = new Event();
        event.setCategory("Category");
        event.setDisplayed(true);
        event.setEventId("42");
        event.setId("42");
        event.setMsgId(123);
        event.setName("Name");
        event.setOperation("Operation");
        event.setStartTime(1L);
        event.setSubCategory("Sub Category");
        event.setSuspended(true);
        event.setTimestamp(10L);
        event.setType("Type");
        event.setDisplayed(true);
        event.setId("42");
        event.setMsgId(123);
        event.setName("Name");
        event.setOperation("Operation");
        event.setSuspended(true);
        event.setTimestamp(10L);
        event.setType("Type");
        thrown.expect(RuntimeException.class);
        this.eventFeedServiceImpl.create(event);
        verify(this.eventRepository).save((Event) any());
    }

    @Test
    public void testUpdate() {
        Event event = new Event();
        event.setCategory("Category");
        event.setDisplayed(true);
        event.setEventId("42");
        event.setId("42");
        event.setMsgId(123);
        event.setName("Name");
        event.setOperation("Operation");
        event.setStartTime(1L);
        event.setSubCategory("Sub Category");
        event.setSuspended(true);
        event.setTimestamp(10L);
        event.setType("Type");
        Optional<Event> ofResult = Optional.of(event);

        Event event1 = new Event();
        event1.setCategory("Category");
        event1.setDisplayed(true);
        event1.setEventId("42");
        event1.setId("42");
        event1.setMsgId(123);
        event1.setName("Name");
        event1.setOperation("Operation");
        event1.setStartTime(1L);
        event1.setSubCategory("Sub Category");
        event1.setSuspended(true);
        event1.setTimestamp(10L);
        event1.setType("Type");
        when(this.eventRepository.save((Event) any())).thenReturn(event1);
        when(this.eventRepository.findByEventId(anyString())).thenReturn(ofResult);

        Event event2 = new Event();
        event2.setCategory("Category");
        event2.setDisplayed(true);
        event2.setEventId("42");
        event2.setId("42");
        event2.setMsgId(123);
        event2.setName("Name");
        event2.setOperation("Operation");
        event2.setStartTime(1L);
        event2.setSubCategory("Sub Category");
        event2.setSuspended(true);
        event2.setTimestamp(10L);
        event2.setType("Type");
        event2.setDisplayed(true);
        event2.setId("42");
        event2.setMsgId(123);
        event2.setName("Name");
        event2.setOperation("Operation");
        event2.setSuspended(true);
        event2.setTimestamp(10L);
        event2.setType("Type");
        this.eventFeedServiceImpl.update(event2);
        verify(this.eventRepository).save((Event) any());
        verify(this.eventRepository).findByEventId((String) any());
        assertEquals("42", event2.getId());
    }

    @Test
    public void testUpdate2() {
        Event event = new Event();
        event.setCategory("Category");
        event.setDisplayed(true);
        event.setEventId("42");
        event.setId("42");
        event.setMsgId(123);
        event.setName("Name");
        event.setOperation("Operation");
        event.setStartTime(1L);
        event.setSubCategory("Sub Category");
        event.setSuspended(true);
        event.setTimestamp(10L);
        event.setType("Type");
        Optional<Event> ofResult = Optional.of(event);
        when(this.eventRepository.save((Event) any())).thenThrow(new RuntimeException("foo"));
        when(this.eventRepository.findByEventId((String) any())).thenReturn(ofResult);

        Event event1 = new Event();
        event1.setCategory("Category");
        event1.setDisplayed(true);
        event1.setEventId("42");
        event1.setId("42");
        event1.setMsgId(123);
        event1.setName("Name");
        event1.setOperation("Operation");
        event1.setStartTime(1L);
        event1.setSubCategory("Sub Category");
        event1.setSuspended(true);
        event1.setTimestamp(10L);
        event1.setType("Type");
        event1.setDisplayed(true);
        event1.setId("42");
        event1.setMsgId(123);
        event1.setName("Name");
        event1.setOperation("Operation");
        event1.setSuspended(true);
        event1.setTimestamp(10L);
        event1.setType("Type");
        thrown.expect(RuntimeException.class);
        this.eventFeedServiceImpl.update(event1);
        verify(this.eventRepository).save((Event) any());
        verify(this.eventRepository).findByEventId((String) any());
    }

    @Test
    public void testUpdate3() {
        Event event = new Event();
        event.setCategory("Category");
        event.setDisplayed(true);
        event.setEventId("42");
        event.setId("42");
        event.setMsgId(123);
        event.setName("Name");
        event.setOperation("Operation");
        event.setStartTime(1L);
        event.setSubCategory("Sub Category");
        event.setSuspended(true);
        event.setTimestamp(10L);
        event.setType("Type");
        when(this.eventRepository.save((Event) any())).thenReturn(event);
        when(this.eventRepository.findByEventId((String) any())).thenReturn(Optional.empty());

        Event event1 = new Event();
        event1.setCategory("Category");
        event1.setDisplayed(true);
        event1.setEventId("42");
        event1.setId("42");
        event1.setMsgId(123);
        event1.setName("Name");
        event1.setOperation("Operation");
        event1.setStartTime(1L);
        event1.setSubCategory("Sub Category");
        event1.setSuspended(true);
        event1.setTimestamp(10L);
        event1.setType("Type");
        event1.setDisplayed(true);
        event1.setId("42");
        event1.setMsgId(123);
        event1.setName("Name");
        event1.setOperation("Operation");
        event1.setSuspended(true);
        event1.setTimestamp(10L);
        event1.setType("Type");
        thrown.expect(RuntimeException.class);
        this.eventFeedServiceImpl.update(event1);
        verify(this.eventRepository).findByEventId((String) any());
    }
}

