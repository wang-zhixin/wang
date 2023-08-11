package com.wang.service;

import com.wang.common.ApiResponse;
import com.wang.vo.LoginReqVo;
import com.wang.vo.RegisterReqVo;
import org.springframework.stereotype.Service;

/**
 * \* @Author: wangzhixin
 * \* @Date: 2023/8/1115:46
 * \* @Description: //TODO
 * \
 */
@Service
public class AuthService {

    /**
     * 用户登录
     */
    public ApiResponse login(LoginReqVo loginReqVo) {
        return ApiResponse.ofSuccess();
    }

    /**
     * 用户退出
     */
    public ApiResponse logout() {
        return ApiResponse.ofSuccess();
    }

    /**
     * 注册用户
     */
    public ApiResponse register(RegisterReqVo registerReqVo) {

        return ApiResponse.ofSuccess();
    }
}
