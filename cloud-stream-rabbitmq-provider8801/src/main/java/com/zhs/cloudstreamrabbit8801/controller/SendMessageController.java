package com.zhs.cloudstreamrabbit8801.controller;

import com.zhs.cloudstreamrabbit8801.service.IMessageProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: zhs
 * @date: 2020/4/6 10:03
 */
@RestController
public class SendMessageController {
    @Resource
    private IMessageProvider messageProvider;

    @RequestMapping("send")
    public String setMessageProvider(){
        messageProvider.send();
        return "success";
    }
}
