package com.zhs.cloudproviderhystrixpayment8001.controller;

import com.zhs.cloudproviderhystrixpayment8001.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: zhs
 * @date: 2020/4/4 22:56
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String port;

    @Resource
    private PaymentService paymentService;

    @GetMapping("/hystrix/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id")Integer id){
        String result = paymentService.paymentInfo_OK(id);
        log.info("result ===={}",result);
        return result;

    }

    @GetMapping("/hystrix/timeout/{id}")
    public String paymentInfo_timeout(@PathVariable("id")Integer id){
        String result = paymentService.paymentInfo_Timeout(id);
        log.info("result ===={}",result);
        return result;
    }

    @GetMapping("/circuit/{id}")
    public String paymentInfo_circuit(@PathVariable("id")Integer id){
        String result = paymentService.paymentCircuitBreaker(id);
        log.info("result ===={}",result);
        return result;
    }
}
