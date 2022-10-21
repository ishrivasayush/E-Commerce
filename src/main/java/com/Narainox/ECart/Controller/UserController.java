package com.Narainox.ECart.Controller;

import com.Narainox.ECart.Entity.User;
import com.Narainox.ECart.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<User> getAllUser()
    {
        return userService.getAll();
    }

    @GetMapping("/username/{userName}")
    public User getUser(@PathVariable String userName)
    {
        return userService.getByUserName(userName);
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user)
    {
        return userService.createUser(user);
    }

    @PutMapping("/user/{userName}")
    public List<User> updateUser(@RequestBody User user,@PathVariable String userName)
    {
        return userService.updateUser(userName,user);
    }

    @DeleteMapping("/user/{userName}")
    public List<User> deleteUser(@PathVariable String userName)
    {
        return userService.deleteUser(userName);
    }
}
