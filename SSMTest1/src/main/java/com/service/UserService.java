package com.service;

import com.model.User;

import java.util.List;

public interface UserService {
    String addInfo(User addInfo);
    List<User> getAll();
    String delete(int id);
    User findById(int id);
    String update(User addInfo);
    User login(User user);

}
