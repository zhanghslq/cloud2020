package com.zhs.springcloud.alibaba.controller;

import com.zhs.springcloud.alibaba.domin.CommonResult;
import com.zhs.springcloud.alibaba.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author: zhs
 * @date: 2020/4/12 13:35
 */
@RestController
public class AccountController {
    @Resource
    private AccountService accountService;

    @RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money){
        accountService.decrease(userId,money);

        return new CommonResult(200,"扣钱成功");
    }
}
