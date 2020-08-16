package cm.zhs.cloudalibabsentinel8401.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhs
 * @date: 2020/4/6 16:55
 */
@RestController
public class SentinelController {

    @GetMapping("/testA")
    public String testA(){
        return "======testA";
    }

    @GetMapping("/testB")
    public String testB(){
        return "======testB";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "dealHotKey")
    public String testHotKey(@RequestParam String p1){
        return "testHotKey";
    }

    public String dealHotKey(@RequestParam String p1, BlockException exception){
        return "dealHotKey---------------";
    }
}
