package com.HRMS.hrms.api.userControllers;

import com.HRMS.hrms.bussiness.userBussiness.abstracts.UserService;
import com.HRMS.hrms.entities.userEntities.abstracts.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getall")
    public List<User> getAll(){
        return this.userService.getAll();
    }
}
