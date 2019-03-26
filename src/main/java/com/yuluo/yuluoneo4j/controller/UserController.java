package com.yuluo.yuluoneo4j.controller;


import com.yuluo.yuluoneo4j.domain.User;
import com.yuluo.yuluoneo4j.services.UserService;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/getall")
    public Collection<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping(path = "/add", method = RequestMethod.GET)
    public User addUser() {
        //int i = 0;
        //do {
            User user = new User();
            user.setAge(RandomUtils.nextInt(15, 40));
            user.setName("Fredia" + RandomUtils.nextInt(1, 1000));
        return userService.addUser(user);
         //   i += 1;
       // } while (i < 400);

    }
}
