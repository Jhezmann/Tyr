package org.tyr.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tyr.entity.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class UserController {
    @GetMapping("/createUser")
    @ResponseBody
    public String createUser(@RequestParam("amount") int amount) {
        // Logic to create users with the specified amount
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            User user = new User();
            user.setId((long) i);
            user.setName("User" + i);
            user.setEmail("user" + i + "@example.com");
            user.setPassword("password" + i);
            user.setRole("1");
            user.setStatus("active");
            userList.add(user);
        }
        return "Created " + amount + " users.";
    }
}
