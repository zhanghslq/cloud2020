package com.zhs.nacosorder83;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: zhs
 * @date: 2020/4/6 12:40
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosOrderMain83 {
    public static void main(String[] args) {
        SpringApplication.run(NacosOrderMain83.class);
    }
}
