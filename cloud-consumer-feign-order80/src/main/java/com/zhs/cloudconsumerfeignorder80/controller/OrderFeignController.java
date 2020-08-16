package com.zhs.cloudconsumerfeignorder80.controller;

import com.zhs.cloudconsumerfeignorder80.service.PaymentFeignService;
import com.zhs.entity.CommonResult;
import com.zhs.entity.Payment;
import io.micrometer.core.instrument.Meter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: zhs
 * @date: 2020/4/4 21:55
 */
@RestController
@Slf4j
public class OrderFeignController {


    @Resource
    private PaymentFeignService paymentFeignService;


    @GetMapping("feign")
    public Object openFeign(Integer id){
        log.info("接收到请求id:{}",id);
        return paymentFeignService.query(id);
    }
    @RequestMapping("/time")
    public Object getTimeout(){
        return paymentFeignService.paymentTimeout();
    }
}
