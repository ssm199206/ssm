package com.jiyun.sys.service.user;

import com.jiyun.sys.pojo.user.User;

/**
 * Created by lishan on 2018/6/13.
 */
public interface UserService {


    int deleteByPrimaryKey(Integer userId);


    int insert(User record);


    int insertSelective(User record);


    User selectByPrimaryKey(Integer userId);


    int updateByPrimaryKeySelective(User record);


    int updateByPrimaryKey(User record);
}
