package com.zhs.hystrixDashboard9001;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

/**
 * @author: zhs
 * @date: 2020/4/5 10:18
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoardMain {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashBoardMain.class);
    }


}
