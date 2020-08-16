package com.zhs.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: zhs
 * @date: 2020/4/12 12:16
 */
@Configuration
@MapperScan({"com.zhs.springcloud.alibaba.dao"})
public class MybatisConfig {
}
