package com.zhs.cloudproviderhystrixpayment8001.service;

/**
 * @author: zhs
 * @date: 2020/4/4 22:52
 */
public interface PaymentService {
    String paymentInfo_OK(Integer id);


    String paymentInfo_Timeout(Integer id);

    /**
     * 服务熔断
     * @param id
     * @return
     */
    String paymentCircuitBreaker(Integer id);
}
