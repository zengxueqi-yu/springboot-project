package com.july.swagger.controller;

import com.july.swagger.entity.Userinfo;
import com.july.swagger.entity.Userinfo1;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
@Api(tags = "0.0.1",description = "测试控制器")
public class TestController {

    @PostMapping("/save")
    @ApiOperation(value = "保存用户信息",notes = "传递用户信息，然后解析list里面的用户进行保存")
    public String save(@RequestBody List<String> msgs){
        msgs.forEach(s -> System.out.println(s));
        return "保存成功";
    }

    @GetMapping("/get")
    @ApiOperation(value = "查询用户信息",notes = "传递用户信息，然后查询用户详细信息")
    public String get(String msg){
        return msg;
    }

    @PostMapping("/saveUser")
    @ApiOperation(value = "保存用户信息",notes = "传递用户信息，然后解析list里面的用户进行保存")
    public String saveUser(@RequestBody List<Userinfo> userinfos){
        userinfos.forEach(s -> System.out.println(s.getUsername()));
        return "保存成功";
    }

    @PostMapping("/saveUser1")
    @ApiOperation(value = "保存用户信息",notes = "传递用户信息，然后解析list里面的用户进行保存")
    public String saveUser1(@RequestBody List<Userinfo1> userinfos){
        userinfos.forEach(s -> System.out.println(s.getUsername()));
        return "保存成功";
    }

}
