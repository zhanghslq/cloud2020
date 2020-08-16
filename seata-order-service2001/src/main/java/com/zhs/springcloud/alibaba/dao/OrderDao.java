package com.zhs.springcloud.alibaba.dao;

import com.zhs.springcloud.alibaba.domin.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: zhs
 * @date: 2020/4/12 11:30
 */
@Mapper
public interface OrderDao {
    void create(Order order);

    void update(@Param("id") Long id, @Param("status") Integer status);
}
