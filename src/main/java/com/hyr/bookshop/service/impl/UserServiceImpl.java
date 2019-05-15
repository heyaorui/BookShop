package com.hyr.bookshop.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hyr.bookshop.dao.entity.User;
import com.hyr.bookshop.dao.UserMapper;
import com.hyr.bookshop.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public User getUserByCond(User record) {
        return userMapper.getUserByCond(record);
    }

}

