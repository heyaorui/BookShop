package com.hyr.bookshop.dao;

import com.hyr.bookshop.dao.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(User record);

    User getUserByCond(User record);
}