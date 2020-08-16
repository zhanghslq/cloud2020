package com.zhs.cloudconsumerfeignorder80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: zhs
 * @date: 2020/4/4 21:44
 */
@SpringBootApplication
@EnableFeignClients
public class CloudConsumerFeignOrder {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignOrder.class);
    }
}
