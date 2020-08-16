package com.zhs.cloudconsumerfeignhystrixorder80.service.impl;

import com.zhs.cloudconsumerfeignhystrixorder80.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @author: zhs
 * @date: 2020/4/4 23:58
 */
@Component
public class PaymentServiceFallback implements PaymentService {
    @Override
    public String paymentInfo_ok(Integer id) {
        return "服务降级处理okpaymentInfo_ok";
    }

    @Override
    public String paymentInfo_timeout(Integer id) {
        return "服务降级处理paymentInfo_timeout";
    }
}
