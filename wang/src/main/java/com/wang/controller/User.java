package com.wang.controller;

import com.wang.common.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * \* @Author: wangzhixin
 * \* @Date: 2023/8/1110:57
 * \* @Description: //TODO
 * \
 */
@Controller
@RequestMapping("/user")
public class User {


    @RequestMapping("/login")
    public String login() {
         System.out.print("hello");
         System.out.print("world!");
        return "hello!";
    }
}
