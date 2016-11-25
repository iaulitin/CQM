package org.cqm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @RequestMapping("/")
    public String home(@RequestParam(value = "name") String name, Model model) {
        model.addAttribute("home", name);
        return "home";
    }

    @RequestMapping(value = "/user")
    public String user(@RequestParam(value = "name") String name, Model model) {
        model.addAttribute("user", name);
        return "user";
    }
}