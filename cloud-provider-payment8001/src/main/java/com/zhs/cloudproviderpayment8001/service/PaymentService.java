package com.zhs.cloudproviderpayment8001.service;

import com.zhs.entity.Payment;

/**
 * @author: zhs
 * @date: 2020/3/28 21:37
 */
public interface PaymentService {
    int insert(Payment payment);
    Payment query(Integer id);
}
