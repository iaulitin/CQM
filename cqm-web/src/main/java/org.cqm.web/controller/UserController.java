package org.cqm.web.controller;

import org.cqm.data.entity.User;
import org.cqm.data.repositories.UserRepository;
import org.cqm.data.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Dmitriy on 28.11.2016.
 */
@Controller
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(value = "/users")
    public String listUsers(Model model) {
        List<User> users = userService.getUserRepository().findAllByOrderByUserIdAsc();
        model.addAttribute("users", users);
        return "user";
    }
}
