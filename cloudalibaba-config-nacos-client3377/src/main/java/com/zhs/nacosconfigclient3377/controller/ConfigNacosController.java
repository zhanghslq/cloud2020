package com.zhs.nacosconfigclient3377.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhs
 * @date: 2020/4/6 13:11
 */
@RestController
@RefreshScope
public class ConfigNacosController {
    @Value("${config.info}")
    private String configInfo;
    @GetMapping("/config/info")
    public String getConfigInfo(){
        return configInfo;
    }
}
