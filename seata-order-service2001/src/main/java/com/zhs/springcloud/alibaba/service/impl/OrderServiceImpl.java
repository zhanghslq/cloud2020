package com.zhs.springcloud.alibaba.service.impl;

import com.zhs.springcloud.alibaba.dao.OrderDao;
import com.zhs.springcloud.alibaba.domin.Order;
import com.zhs.springcloud.alibaba.service.AccountService;
import com.zhs.springcloud.alibaba.service.OrderService;
import com.zhs.springcloud.alibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: zhs
 * @date: 2020/4/12 12:01
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;
    @GlobalTransactional(name = "create-order",rollbackFor = Exception.class)
    @Override
    public void create(Order order) {
        log.info("开始创建订单");

        orderDao.create(order);
        log.info("开始调用库存扣减");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("账户扣减money");
        accountService.decrease(order.getUserId(),order.getMoney());

        log.info("修改订单状态,订单id{}",order.getId());
        orderDao.update(order.getId(),0);
        log.info("修改订单结束");
    }
}
