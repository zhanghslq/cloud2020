package com.zhs.cloudalibabapayment9001.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhs
 * @date: 2020/4/6 12:22
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/nacos")
    public String getPayment(){
        return serverPort;
    }
}
