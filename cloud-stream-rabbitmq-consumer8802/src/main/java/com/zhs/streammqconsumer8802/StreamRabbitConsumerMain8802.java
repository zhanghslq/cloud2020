package com.zhs.streammqconsumer8802;

import com.netflix.discovery.EurekaNamespace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: zhs
 * @date: 2020/4/6 10:14
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamRabbitConsumerMain8802 {
    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitConsumerMain8802.class);
    }
}
