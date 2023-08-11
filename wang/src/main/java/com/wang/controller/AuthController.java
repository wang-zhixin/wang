package com.wang.controller;

import com.wang.common.ApiResponse;
import com.wang.service.AuthService;
import com.wang.vo.LoginReqVo;
import com.wang.vo.RegisterReqVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * \* @Author: wangzhixin
 * \* @Date: 2023/8/1110:57
 * \* @Description: //TODO
 * \
 */
@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ApiResponse login(@RequestBody LoginReqVo loginReqVo) {
        return authService.login(loginReqVo);
    }

    @PostMapping("/logout")
    public ApiResponse logout() {
        return authService.logout();
    }

    @PostMapping("/register")
    public ApiResponse register(@RequestBody RegisterReqVo registerReqVo) {
        return authService.register(registerReqVo);
    }
}
