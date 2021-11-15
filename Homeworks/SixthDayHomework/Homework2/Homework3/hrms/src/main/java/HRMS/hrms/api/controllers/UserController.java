package HRMS.hrms.api.controllers;

import HRMS.hrms.bussiness.abstracts.UserService;
import HRMS.hrms.entities.concretes.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("users")
    public List<Users> getAll(){
        return this.userService.getAll();
    }
}
