package com.example.feedreader.service.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.feedreader.model.Market;
import com.example.feedreader.repository.MarketRepository;

import java.util.Optional;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {MarketFeedServiceImpl.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class MarketFeedServiceImplTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Autowired
    private MarketFeedServiceImpl marketFeedServiceImpl;

    @MockBean
    private MarketRepository marketRepository;

    @Test
    public void testCreate() {
        Market market = new Market();
        market.setDisplayed(true);
        market.setEventId("42");
        market.setId("42");
        market.setMarketId("42");
        market.setMsgId(123);
        market.setName("Name");
        market.setOperation("Operation");
        market.setSuspended(true);
        market.setTimestamp(10L);
        market.setType("Type");
        when(this.marketRepository.save((Market) any())).thenReturn(market);

        Market market1 = new Market();
        market1.setDisplayed(true);
        market1.setEventId("42");
        market1.setId("42");
        market1.setMarketId("42");
        market1.setMsgId(123);
        market1.setName("Name");
        market1.setOperation("Operation");
        market1.setSuspended(true);
        market1.setTimestamp(10L);
        market1.setType("Type");
        market1.setDisplayed(true);
        market1.setId("42");
        market1.setMsgId(123);
        market1.setName("Name");
        market1.setOperation("Operation");
        market1.setSuspended(true);
        market1.setTimestamp(10L);
        market1.setType("Type");
        this.marketFeedServiceImpl.create(market1);
        verify(this.marketRepository).save((Market) any());
    }

    @Test
    public void testCreate2() {
        when(this.marketRepository.save((Market) any())).thenThrow(new RuntimeException("foo"));

        Market market = new Market();
        market.setDisplayed(true);
        market.setEventId("42");
        market.setId("42");
        market.setMarketId("42");
        market.setMsgId(123);
        market.setName("Name");
        market.setOperation("Operation");
        market.setSuspended(true);
        market.setTimestamp(10L);
        market.setType("Type");
        market.setDisplayed(true);
        market.setId("42");
        market.setMsgId(123);
        market.setName("Name");
        market.setOperation("Operation");
        market.setSuspended(true);
        market.setTimestamp(10L);
        market.setType("Type");
        thrown.expect(RuntimeException.class);
        this.marketFeedServiceImpl.create(market);
        verify(this.marketRepository).save((Market) any());
    }

    @Test
    public void testUpdate() {
        Market market = new Market();
        market.setDisplayed(true);
        market.setEventId("42");
        market.setId("42");
        market.setMarketId("42");
        market.setMsgId(123);
        market.setName("Name");
        market.setOperation("Operation");
        market.setSuspended(true);
        market.setTimestamp(10L);
        market.setType("Type");
        Optional<Market> ofResult = Optional.of(market);

        Market market1 = new Market();
        market1.setDisplayed(true);
        market1.setEventId("42");
        market1.setId("42");
        market1.setMarketId("42");
        market1.setMsgId(123);
        market1.setName("Name");
        market1.setOperation("Operation");
        market1.setSuspended(true);
        market1.setTimestamp(10L);
        market1.setType("Type");
        when(this.marketRepository.save((Market) any())).thenReturn(market1);
        when(this.marketRepository.findByMarketId((String) any())).thenReturn(ofResult);

        Market market2 = new Market();
        market2.setDisplayed(true);
        market2.setEventId("42");
        market2.setId("42");
        market2.setMarketId("42");
        market2.setMsgId(123);
        market2.setName("Name");
        market2.setOperation("Operation");
        market2.setSuspended(true);
        market2.setTimestamp(10L);
        market2.setType("Type");
        market2.setDisplayed(true);
        market2.setId("42");
        market2.setMsgId(123);
        market2.setName("Name");
        market2.setOperation("Operation");
        market2.setSuspended(true);
        market2.setTimestamp(10L);
        market2.setType("Type");
        this.marketFeedServiceImpl.update(market2);
        verify(this.marketRepository).save((Market) any());
        verify(this.marketRepository).findByMarketId((String) any());
        assertEquals("42", market2.getId());
    }

    @Test
    public void testUpdate2() {
        Market market = new Market();
        market.setDisplayed(true);
        market.setEventId("42");
        market.setId("42");
        market.setMarketId("42");
        market.setMsgId(123);
        market.setName("Name");
        market.setOperation("Operation");
        market.setSuspended(true);
        market.setTimestamp(10L);
        market.setType("Type");
        Optional<Market> ofResult = Optional.of(market);
        when(this.marketRepository.save((Market) any())).thenThrow(new RuntimeException("foo"));
        when(this.marketRepository.findByMarketId((String) any())).thenReturn(ofResult);

        Market market1 = new Market();
        market1.setDisplayed(true);
        market1.setEventId("42");
        market1.setId("42");
        market1.setMarketId("42");
        market1.setMsgId(123);
        market1.setName("Name");
        market1.setOperation("Operation");
        market1.setSuspended(true);
        market1.setTimestamp(10L);
        market1.setType("Type");
        market1.setDisplayed(true);
        market1.setId("42");
        market1.setMsgId(123);
        market1.setName("Name");
        market1.setOperation("Operation");
        market1.setSuspended(true);
        market1.setTimestamp(10L);
        market1.setType("Type");
        thrown.expect(RuntimeException.class);
        this.marketFeedServiceImpl.update(market1);
        verify(this.marketRepository).save((Market) any());
        verify(this.marketRepository).findByMarketId((String) any());
    }

    @Test
    public void testUpdate3() {
        Market market = new Market();
        market.setDisplayed(true);
        market.setEventId("42");
        market.setId("42");
        market.setMarketId("42");
        market.setMsgId(123);
        market.setName("Name");
        market.setOperation("Operation");
        market.setSuspended(true);
        market.setTimestamp(10L);
        market.setType("Type");
        when(this.marketRepository.save((Market) any())).thenReturn(market);
        when(this.marketRepository.findByMarketId((String) any())).thenReturn(Optional.empty());

        Market market1 = new Market();
        market1.setDisplayed(true);
        market1.setEventId("42");
        market1.setId("42");
        market1.setMarketId("42");
        market1.setMsgId(123);
        market1.setName("Name");
        market1.setOperation("Operation");
        market1.setSuspended(true);
        market1.setTimestamp(10L);
        market1.setType("Type");
        market1.setDisplayed(true);
        market1.setId("42");
        market1.setMsgId(123);
        market1.setName("Name");
        market1.setOperation("Operation");
        market1.setSuspended(true);
        market1.setTimestamp(10L);
        market1.setType("Type");
        thrown.expect(RuntimeException.class);
        this.marketFeedServiceImpl.update(market1);
        verify(this.marketRepository).findByMarketId((String) any());
    }
}

