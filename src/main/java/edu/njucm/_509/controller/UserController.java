package edu.njucm._509.controller;

import edu.njucm._509.pojo.User;
import edu.njucm._509.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("SelectUserAll")
    public List<User> SelectUserAll() {

        System.out.println("访问了SelectUserAll");
        return userService.selectUserAll();
    }
}
