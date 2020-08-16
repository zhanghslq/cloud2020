package com.zhs.cloudconsumerfeignhystrixorder80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: zhs
 * @date: 2020/4/4 23:14
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class CloudHystrixOrder80 {

    public static void main(String[] args) {
        SpringApplication.run(CloudHystrixOrder80.class);
    }
}
