package com.congge.service;

import com.congge.entity.UserInfo;
import com.congge.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoService {
 
    @Resource
    private UserInfoMapper userInfoMapper ;
 
    public void saveData(UserInfo userInfo) {
        userInfoMapper.saveData(userInfo);
    }
 
    public UserInfo selectById(Integer id) {
        return userInfoMapper.selectById(id);
    }
 
    public List<UserInfo> selectList() {
        return userInfoMapper.selectList();
    }
 
}
