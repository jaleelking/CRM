package com.Project.CRM.Controller;

import com.Project.CRM.Entities.Users;
import com.Project.CRM.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/registeruser")
    public Users registerUser(@RequestBody Users user){
        return userService.registerUser(user);
    }
}
