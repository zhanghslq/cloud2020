package com.zhs.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: zhs
 * @date: 2020/4/4 21:01
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){

        //定义为随机
        return new RandomRule();
    }

}
