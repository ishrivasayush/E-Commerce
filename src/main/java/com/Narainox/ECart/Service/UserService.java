package com.Narainox.ECart.Service;

import com.Narainox.ECart.Entity.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getByUserName(String userName);
    List<User> deleteUser(String userName);
    List<User> updateUser(String userName,User user);
    User createUser(User user);
}
