package com.zhs.springcloud.alibaba.service.impl;

import com.zhs.springcloud.alibaba.dao.AccountDao;
import com.zhs.springcloud.alibaba.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author: zhs
 * @date: 2020/4/12 13:33
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public void decrease(Long userId, BigDecimal money) {
        log.info("扣减钱开始");
        accountDao.decrease(userId,money);
        log.info("扣钱结束");
    }
}
