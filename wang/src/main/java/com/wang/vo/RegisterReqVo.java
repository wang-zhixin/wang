package com.wang.vo;

import lombok.Data;
import lombok.NonNull;

/**
 * \* @Author: wangzhixin
 * \* @Date: 2023/8/1115:39
 * \* @Description: //TODO
 * \
 */
@Data
public class RegisterReqVo {
    @NonNull
    private String username;

    @NonNull
    private String password;
}
