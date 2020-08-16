package com.zhs.cloudproviderpayment8002.dao;

import com.zhs.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: zhs
 * @date: 2020/3/28 21:20
 */
@Mapper
public interface PaymentDao {
    int insert(@Param("payment") Payment payment);

    Payment query(@Param("id") Integer id);
}
