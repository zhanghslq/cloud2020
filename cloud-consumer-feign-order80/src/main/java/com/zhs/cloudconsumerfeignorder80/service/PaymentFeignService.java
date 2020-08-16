package com.zhs.cloudconsumerfeignorder80.service;

import com.zhs.entity.CommonResult;
import com.zhs.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: zhs
 * @date: 2020/4/4 21:47
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping("/query")
    CommonResult<Payment> query(Integer id);

    @GetMapping("/feign/timeout")
    String paymentTimeout();
}
