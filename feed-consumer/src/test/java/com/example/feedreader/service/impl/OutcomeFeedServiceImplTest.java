package com.example.feedreader.service.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.feedreader.model.Outcome;
import com.example.feedreader.repository.OutcomeRepository;

import java.util.Optional;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {OutcomeFeedServiceImpl.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class OutcomeFeedServiceImplTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Autowired
    private OutcomeFeedServiceImpl outcomeFeedServiceImpl;

    @MockBean
    private OutcomeRepository outcomeRepository;

    @Test
    public void testCreate() {
        Outcome outcome = new Outcome();
        outcome.setDisplayed(true);
        outcome.setId("42");
        outcome.setMarketId("42");
        outcome.setMsgId(123);
        outcome.setName("Name");
        outcome.setOperation("Operation");
        outcome.setOutcomeId("42");
        outcome.setPrice("Price");
        outcome.setSuspended(true);
        outcome.setTimestamp(10L);
        outcome.setType("Type");
        when(this.outcomeRepository.save((Outcome) any())).thenReturn(outcome);

        Outcome outcome1 = new Outcome();
        outcome1.setDisplayed(true);
        outcome1.setId("42");
        outcome1.setMarketId("42");
        outcome1.setMsgId(123);
        outcome1.setName("Name");
        outcome1.setOperation("Operation");
        outcome1.setOutcomeId("42");
        outcome1.setPrice("Price");
        outcome1.setSuspended(true);
        outcome1.setTimestamp(10L);
        outcome1.setType("Type");
        outcome1.setDisplayed(true);
        outcome1.setId("42");
        outcome1.setMsgId(123);
        outcome1.setName("Name");
        outcome1.setOperation("Operation");
        outcome1.setSuspended(true);
        outcome1.setTimestamp(10L);
        outcome1.setType("Type");
        this.outcomeFeedServiceImpl.create(outcome1);
        verify(this.outcomeRepository).save((Outcome) any());
    }

    @Test
    public void testCreate2() {
        when(this.outcomeRepository.save((Outcome) any())).thenThrow(new RuntimeException("foo"));

        Outcome outcome = new Outcome();
        outcome.setDisplayed(true);
        outcome.setId("42");
        outcome.setMarketId("42");
        outcome.setMsgId(123);
        outcome.setName("Name");
        outcome.setOperation("Operation");
        outcome.setOutcomeId("42");
        outcome.setPrice("Price");
        outcome.setSuspended(true);
        outcome.setTimestamp(10L);
        outcome.setType("Type");
        outcome.setDisplayed(true);
        outcome.setId("42");
        outcome.setMsgId(123);
        outcome.setName("Name");
        outcome.setOperation("Operation");
        outcome.setSuspended(true);
        outcome.setTimestamp(10L);
        outcome.setType("Type");
        thrown.expect(RuntimeException.class);
        this.outcomeFeedServiceImpl.create(outcome);
        verify(this.outcomeRepository).save((Outcome) any());
    }

    @Test
    public void testUpdate() {
        Outcome outcome = new Outcome();
        outcome.setDisplayed(true);
        outcome.setId("42");
        outcome.setMarketId("42");
        outcome.setMsgId(123);
        outcome.setName("Name");
        outcome.setOperation("Operation");
        outcome.setOutcomeId("42");
        outcome.setPrice("Price");
        outcome.setSuspended(true);
        outcome.setTimestamp(10L);
        outcome.setType("Type");
        Optional<Outcome> ofResult = Optional.of(outcome);

        Outcome outcome1 = new Outcome();
        outcome1.setDisplayed(true);
        outcome1.setId("42");
        outcome1.setMarketId("42");
        outcome1.setMsgId(123);
        outcome1.setName("Name");
        outcome1.setOperation("Operation");
        outcome1.setOutcomeId("42");
        outcome1.setPrice("Price");
        outcome1.setSuspended(true);
        outcome1.setTimestamp(10L);
        outcome1.setType("Type");
        when(this.outcomeRepository.save((Outcome) any())).thenReturn(outcome1);
        when(this.outcomeRepository.findByOutcomeId((String) any())).thenReturn(ofResult);

        Outcome outcome2 = new Outcome();
        outcome2.setDisplayed(true);
        outcome2.setId("42");
        outcome2.setMarketId("42");
        outcome2.setMsgId(123);
        outcome2.setName("Name");
        outcome2.setOperation("Operation");
        outcome2.setOutcomeId("42");
        outcome2.setPrice("Price");
        outcome2.setSuspended(true);
        outcome2.setTimestamp(10L);
        outcome2.setType("Type");
        outcome2.setDisplayed(true);
        outcome2.setId("42");
        outcome2.setMsgId(123);
        outcome2.setName("Name");
        outcome2.setOperation("Operation");
        outcome2.setSuspended(true);
        outcome2.setTimestamp(10L);
        outcome2.setType("Type");
        this.outcomeFeedServiceImpl.update(outcome2);
        verify(this.outcomeRepository).save((Outcome) any());
        verify(this.outcomeRepository).findByOutcomeId((String) any());
        assertEquals("42", outcome2.getId());
    }

    @Test
    public void testUpdate2() {
        Outcome outcome = new Outcome();
        outcome.setDisplayed(true);
        outcome.setId("42");
        outcome.setMarketId("42");
        outcome.setMsgId(123);
        outcome.setName("Name");
        outcome.setOperation("Operation");
        outcome.setOutcomeId("42");
        outcome.setPrice("Price");
        outcome.setSuspended(true);
        outcome.setTimestamp(10L);
        outcome.setType("Type");
        Optional<Outcome> ofResult = Optional.of(outcome);
        when(this.outcomeRepository.save((Outcome) any())).thenThrow(new RuntimeException("foo"));
        when(this.outcomeRepository.findByOutcomeId((String) any())).thenReturn(ofResult);

        Outcome outcome1 = new Outcome();
        outcome1.setDisplayed(true);
        outcome1.setId("42");
        outcome1.setMarketId("42");
        outcome1.setMsgId(123);
        outcome1.setName("Name");
        outcome1.setOperation("Operation");
        outcome1.setOutcomeId("42");
        outcome1.setPrice("Price");
        outcome1.setSuspended(true);
        outcome1.setTimestamp(10L);
        outcome1.setType("Type");
        outcome1.setDisplayed(true);
        outcome1.setId("42");
        outcome1.setMsgId(123);
        outcome1.setName("Name");
        outcome1.setOperation("Operation");
        outcome1.setSuspended(true);
        outcome1.setTimestamp(10L);
        outcome1.setType("Type");
        thrown.expect(RuntimeException.class);
        this.outcomeFeedServiceImpl.update(outcome1);
        verify(this.outcomeRepository).save((Outcome) any());
        verify(this.outcomeRepository).findByOutcomeId((String) any());
    }

    @Test
    public void testUpdate3() {
        Outcome outcome = new Outcome();
        outcome.setDisplayed(true);
        outcome.setId("42");
        outcome.setMarketId("42");
        outcome.setMsgId(123);
        outcome.setName("Name");
        outcome.setOperation("Operation");
        outcome.setOutcomeId("42");
        outcome.setPrice("Price");
        outcome.setSuspended(true);
        outcome.setTimestamp(10L);
        outcome.setType("Type");
        when(this.outcomeRepository.save((Outcome) any())).thenReturn(outcome);
        when(this.outcomeRepository.findByOutcomeId((String) any())).thenReturn(Optional.empty());

        Outcome outcome1 = new Outcome();
        outcome1.setDisplayed(true);
        outcome1.setId("42");
        outcome1.setMarketId("42");
        outcome1.setMsgId(123);
        outcome1.setName("Name");
        outcome1.setOperation("Operation");
        outcome1.setOutcomeId("42");
        outcome1.setPrice("Price");
        outcome1.setSuspended(true);
        outcome1.setTimestamp(10L);
        outcome1.setType("Type");
        outcome1.setDisplayed(true);
        outcome1.setId("42");
        outcome1.setMsgId(123);
        outcome1.setName("Name");
        outcome1.setOperation("Operation");
        outcome1.setSuspended(true);
        outcome1.setTimestamp(10L);
        outcome1.setType("Type");
        thrown.expect(RuntimeException.class);
        this.outcomeFeedServiceImpl.update(outcome1);
        verify(this.outcomeRepository).findByOutcomeId((String) any());
    }
}

