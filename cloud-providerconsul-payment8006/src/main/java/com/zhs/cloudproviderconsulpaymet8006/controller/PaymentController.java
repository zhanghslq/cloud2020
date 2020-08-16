package com.zhs.cloudproviderconsulpaymet8006.controller;


import com.zhs.cloudproviderconsulpaymet8006.service.PaymentService;
import com.zhs.entity.CommonResult;
import com.zhs.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: zhs
 * @date: 2020/3/28 21:40
 */
@Slf4j
@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @PostMapping("/add")
    public CommonResult<Integer> add(Payment payment){

        int insert = paymentService.insert(payment);
        return new CommonResult<>(200,"sdas",insert);
    }

    @GetMapping("/query")
    public CommonResult<Payment> query(@RequestParam(required = false,defaultValue = "1") Integer id){
        log.info("查询{}",id);
        Payment query = paymentService.query(id);
        return new CommonResult<>(200,"成功,端口："+port,query);
    }

}
