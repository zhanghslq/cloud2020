package com.zhs.cloudconsumerorder80.controller;


import com.zhs.entity.CommonResult;
import com.zhs.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: zhs
 * @date: 2020/3/28 23:05
 */
@RestController
@Slf4j
public class OrderController {
    @Resource
    private RestTemplate restTemplate;

    private String PAYMENT_URL = "http://cloud-payment-service/";

    @GetMapping("/get/{id}")
    public CommonResult<Payment> get(@PathVariable Integer id){
        return restTemplate.getForObject(PAYMENT_URL+"/query",CommonResult.class);
    }

    @GetMapping("/getEntity/{id}")
    public CommonResult<Payment> getEntity(@PathVariable Integer id){
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL + "/query", CommonResult.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            return entity.getBody();
        }else {
            return new CommonResult<>(400,"",null);
        }

    }
    @RequestMapping("/order/zipkin")
    public String zipkin(){
        return restTemplate.getForObject(PAYMENT_URL+"/zipkin",String.class);
    }
}
