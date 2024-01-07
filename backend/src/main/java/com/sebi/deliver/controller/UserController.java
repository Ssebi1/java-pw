package com.sebi.deliver.controller;

import com.sebi.deliver.model.User;
import com.sebi.deliver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("register")
    public User registerUser(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("login")
    public User loginUser(@RequestBody User user) {
        return userService.login(user);
    }

    @DeleteMapping("{id}")
    public User deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }

    @GetMapping("{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PutMapping("{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }
}
