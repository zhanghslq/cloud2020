package com.zhs.cloudconsumerfeignhystrixorder80.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zhs.cloudconsumerfeignhystrixorder80.service.impl.PaymentServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: zhs
 * @date: 2020/4/4 23:15
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE",fallback = PaymentServiceFallback.class)
public interface PaymentService {
    @GetMapping("/hystrix/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id")Integer id);


    @GetMapping("/hystrix/timeout/{id}")
    public String paymentInfo_timeout(@PathVariable("id")Integer id);



}
