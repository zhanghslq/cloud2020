package com.zhs.cloudalibabapayment9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: zhs
 * @date: 2020/4/6 11:37
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentAlibabaMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentAlibabaMain9001.class);
    }
}
