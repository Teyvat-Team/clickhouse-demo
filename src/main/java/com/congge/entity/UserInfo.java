package com.congge.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel("用户类")
@Data
public class UserInfo {
    private int id;
    private String userName;
    private String passWord;
    private String phone;
    private String createDay;
}
