package com.Narainox.ECart.Service.ServiceImpl;

import com.Narainox.ECart.Entity.User;
import com.Narainox.ECart.Repository.UserRepo;
import com.Narainox.ECart.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }

    @Override
    public User getByUserName(String userName) {
        return userRepo.findById(userName).get();
    }

    @Override
    public List<User> deleteUser(String userName) {
        userRepo.deleteById(userName);
        return userRepo.findAll();
    }

    @Override
    public List<User> updateUser(String userName, User user) {
        if (userRepo.existsById(userName))
        {
            userRepo.deleteById(userName);
            userRepo.save(user);
        }
        return userRepo.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }
}
