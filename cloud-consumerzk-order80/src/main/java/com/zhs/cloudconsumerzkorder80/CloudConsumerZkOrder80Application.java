package com.zhs.cloudconsumerzkorder80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsumerZkOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerZkOrder80Application.class, args);
    }

}
