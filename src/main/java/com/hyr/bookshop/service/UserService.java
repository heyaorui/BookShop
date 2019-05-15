package com.hyr.bookshop.service;

import com.hyr.bookshop.dao.entity.User;

public interface UserService {


    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(User record);

    User getUserByCond(User record);

}

