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
public class AllUsersController {

//    @Autowired
//    UserRepository repository;
//
//    @RequestMapping(value = "/list")
//    public String listUsers(ModelMap modelMap) {
//        List<String> users = repository.findAllByOrderByIdAsc();
//        modelMap.addAttribute("users", users);
//        return "allUsers";

//    UserRepository userRepository;
//
//    @Autowired(required = true)
//    @Qualifier(value = "userRepository")
//    public void setUserRepository(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @RequestMapping(value = "/user")
//    public String listUsers(Model model) {
//        model.addAttribute("user", new User());
//        model.addAttribute("listUsers", this.userRepository.findAllByOrderByIdAsc());
//        return "user";
//    }

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(value = "/users")
    public String listUsers(Model model) {
        List<User> users = (List<User>) userService.getUserRepository();
        model.addAttribute("users", users);
        return "user";
    }
}
