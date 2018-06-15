package com.jiyun.sys.service.user;

import com.jiyun.sys.dao.user.UserMapper;
import com.jiyun.sys.pojo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by lishan on 2018/6/13.
 */
@Service
public class UserServiceImpl implements  UserService {

    @Autowired
    private UserMapper userMapper;

    public int deleteByPrimaryKey(Integer userId) {
        return 0;
    }

    public int insert(User record) {
        return 0;
    }

    @Transactional
    public int insertSelective(User record) {

        return 0;
    }

    public User selectByPrimaryKey(Integer userId) {
        return null;
    }

    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    public int updateByPrimaryKey(User record) {
        return 0;
    }
}
