package com.jerry.fashion.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jerry.Wu
 * @description:
 * @date 2019/3/20 11:16
 */

@RestController
@RequestMapping("index")
public class IndexController {

    @GetMapping("hello")
    public Object sayHello() {
        return "Hello!!";
    }

    @GetMapping("home")
    public Object home() {
        return "这里返回首页数据";
    }

}
