package com.congge.mapper;

import com.congge.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoMapper {
    void saveData (UserInfo userInfo) ;
    UserInfo selectById (@Param("id") Integer id) ;
    List<UserInfo> selectList () ;
}