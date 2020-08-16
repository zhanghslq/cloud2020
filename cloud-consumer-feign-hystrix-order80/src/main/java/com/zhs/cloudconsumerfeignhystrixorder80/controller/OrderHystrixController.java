package com.zhs.cloudconsumerfeignhystrixorder80.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zhs.cloudconsumerfeignhystrixorder80.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: zhs
 * @date: 2020/4/4 23:17
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "global_fallback")
public class OrderHystrixController {
    @Resource
    private PaymentService paymentService;

    @GetMapping("/order/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id")Integer id){
        String s = paymentService.paymentInfo_ok(id);
        return s;
    }

    @HystrixCommand(fallbackMethod = "timeoutHandler",
            commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")
            })
    @GetMapping("/order/timeout/{id}")
    public String paymentInfo_timeout(@PathVariable("id")Integer id){
        String s = paymentService.paymentInfo_timeout(id);
        return s;
    }

    public String timeoutHandler(@PathVariable("id")Integer id){
        return "服务超时降级";
    }

    public String global_fallback(){
        return "全局服务超时降级";
    }
}
