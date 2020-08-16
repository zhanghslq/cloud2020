package com.zhs.cloudstreamrabbit8801.service.impl;

import cn.hutool.core.util.IdUtil;
import com.zhs.cloudstreamrabbit8801.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;

/**
 * @author: zhs
 * @date: 2020/4/6 9:57
 */
//定义消息的推送管道
@Slf4j
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output;
    @Override
    public String send() {
        String uuid = IdUtil.simpleUUID();
        output.send(MessageBuilder.withPayload(uuid).build());
        log.info("**********serial{}",uuid);
        return null;
    }
}
