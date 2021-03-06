package com.dao;

import com.model.User;

import java.util.List;

public interface UserDao {
    int insert(User user);
    int insertSelective(User user);
    int deleteByPrimaryKey(int id);
    int updateByPrimaryKeySelective(User user);
    int updateByPrimaryKey(User user);
    User selectByPrimaryKey(int id);
    List<User> getAll();
    User selectByUsernameAndPassword(User user);
}
