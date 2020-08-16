package com.zhs.springcloud.alibaba.controller;

import com.zhs.springcloud.alibaba.domin.CommonResult;
import com.zhs.springcloud.alibaba.domin.Order;
import com.zhs.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: zhs
 * @date: 2020/4/12 12:12
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
