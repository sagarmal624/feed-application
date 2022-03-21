package com.example.feedreader.camel.routes;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Netty4TcpRoute extends RouteBuilder {

    private static final Logger log = LoggerFactory.getLogger(Netty4TcpRoute.class);
    @Value("${tcp.url}")
    private String url;

    @Override
    public void configure() throws Exception {
        this.from(url)
                .process(new Processor() {
                    @Override
                    public void process(final Exchange exchange) throws Exception {
                        log.info("[Processor] - Incoming Message -> {}", exchange.getIn().getBody(String.class));
                    }
                }).transform().method(FeedTransformer.class, "convert")
                .to("bean:rabbitMQProducer");
    }
}
