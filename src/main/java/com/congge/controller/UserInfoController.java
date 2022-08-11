package com.congge.controller;

import com.congge.entity.UserInfo;
import com.congge.service.UserInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

@ApiOperation("测试接口")
@RestController
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    //postman测试 localhost:8081/saveData
    @ApiOperation("插入数据")
    @PutMapping("/saveData")
    public String saveData() {
        UserInfo userInfo = new UserInfo();
        int i = new Random().nextInt(2000);
        userInfo.setId(i);
        userInfo.setUserName("xiaolin_" + i);
        userInfo.setPassWord("54321");
        userInfo.setPhone("18500909876");
        userInfo.setCreateDay("2022-02-06");
        userInfoService.saveData(userInfo);
        return "success";
    }

    //http://localhost:8081/get/3
    @ApiOperation("Id查训")
    @GetMapping("/get/{id}")
    public UserInfo getById(@PathVariable("id") int id) {
        return userInfoService.selectById(id);
    }

    @ApiOperation("查询所有")
    @GetMapping("/getList")
    public List<UserInfo> getList() {
        return userInfoService.selectList();
    }

}
