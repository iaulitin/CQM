package org.cqm.web.controller;

import org.cqm.data.entity.User;
import org.cqm.data.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(value = "/users")
    public String listUsers(Model model) {
        List<User> users = userService.getUserRepository().findAllUsersOrderByRatingDesc();
        model.addAttribute("users", users);
        return "user";
    }
}
