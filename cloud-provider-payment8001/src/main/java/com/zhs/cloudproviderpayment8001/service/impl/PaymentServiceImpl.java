package com.zhs.cloudproviderpayment8001.service.impl;

import com.zhs.cloudproviderpayment8001.dao.PaymentDao;
import com.zhs.cloudproviderpayment8001.service.PaymentService;
import com.zhs.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: zhs
 * @date: 2020/3/28 21:38
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;
    @Override
    public int insert(Payment payment) {
        return paymentDao.insert(payment);
    }

    @Override
    public Payment query(Integer id) {
        return paymentDao.query(id);
    }
}
