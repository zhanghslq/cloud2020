package com.zhs.cloudproviderhystrixpayment8001.service.impl;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zhs.cloudproviderhystrixpayment8001.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * @author: zhs
 * @date: 2020/4/4 22:52
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "线程池" + Thread.currentThread().getName()+"payment_ok,id"+id+"\t haah";
    }

    @HystrixCommand(fallbackMethod = "timeoutHandler",
            commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    @Override
    public String paymentInfo_Timeout(Integer id) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池" + Thread.currentThread().getName()+"payment_ok,id"+id+"\t haah,睡眠一段使劲按";
    }

    public String timeoutHandler(Integer id) {

        return "线程池" + Thread.currentThread().getName()+"payment_handler,id"+id+"\t haah,睡眠一段使劲按";
    }


    @HystrixCommand(fallbackMethod = "paymentCircuitBreakerFallBack",
            commandProperties = {
                @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000"),
                @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//是否开启断路器
                @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//请求次数
                @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "1000"),//时间窗口期
                @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")//失败率达到多少跳闸

            })
    @Override
    public String paymentCircuitBreaker(Integer id) {
        if(id<0){
            throw new RuntimeException("id不能为负数");
        }
        return "id单号" + IdUtil.simpleUUID();
    }
    private String paymentCircuitBreakerFallBack(Integer id){
        return "id不能附属的呀";
    }

}
