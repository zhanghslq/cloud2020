package com.zhs.springcloud.alibaba.service;

import java.math.BigDecimal;

/**
 * @author: zhs
 * @date: 2020/4/12 13:32
 */
public interface AccountService {
    void decrease(Long userId, BigDecimal money);
}
