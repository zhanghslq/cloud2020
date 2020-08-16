package com.zhs.nacosconfigclient3377;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.security.auth.login.Configuration;

/**
 * @author: zhs
 * @date: 2020/4/6 13:08
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigNacosClient3377 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigNacosClient3377.class);
    }
}
