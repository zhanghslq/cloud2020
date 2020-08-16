package com.zhs.nacosorder83.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: zhs
 * @date: 2020/4/6 12:40
 */
@RestController
@Slf4j
public class OrderNacosController {
    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverUrl;

    @RequestMapping("/order/nacos")
    public String orderGet(){
        return restTemplate.getForObject(serverUrl+"/nacos",String.class);
    }
}
