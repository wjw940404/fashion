package com.jerry.fashion.admin.controller;

import com.jerry.fashion.admin.model.CoolUser;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("get")
    public Object getUser(@RequestParam Integer id) {
        System.out.println("id= " + id);
        CoolUser coolUser = new CoolUser();
        coolUser.setUsername("靓仔聪");
        coolUser.setAge(25);
        coolUser.setPassword("123456");
        coolUser.setId(id);
        coolUser.setSex(1);
        return coolUser;
    }

    @PostMapping("save")
    public Object save(@RequestParam String username, @RequestParam String password) {
        CoolUser coolUser = new CoolUser();
        coolUser.setUsername(username);
        coolUser.setPassword(password);
        System.out.println(coolUser.toString());
        return coolUser;
    }

    @PostMapping("saveObj")
    public Object saveObj(@RequestBody CoolUser coolUser) {
        System.out.println(coolUser.toString());
        return coolUser;
    }

}
