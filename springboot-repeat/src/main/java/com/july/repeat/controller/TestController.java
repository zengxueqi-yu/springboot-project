package com.july.repeat.controller;

import com.july.repeat.annotation.LocalLock;
import org.springframework.web.bind.annotation.*;

/**
 * 测试接口防重复提交
 * @author zqk
 * @since 2019/12/26
 */
@RestController
public class TestController {

    @PostMapping("/test")
    @LocalLock(key = "LocalLock:arg[0]")
    public String test(@RequestBody String name){
        return "接口响应成功 ===> " + name;
    }

}
