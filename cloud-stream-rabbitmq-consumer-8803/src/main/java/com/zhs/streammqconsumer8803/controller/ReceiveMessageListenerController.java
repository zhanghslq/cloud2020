package com.zhs.streammqconsumer8803.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author: zhs
 * @date: 2020/4/6 10:16
 */
@Component
@EnableBinding(Sink.class)
@Slf4j
public class ReceiveMessageListenerController {

    @Value("${server.port}")
    private String port;


    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        log.info("收到的{},serverport{}",message.getPayload(),port);
    }
}
