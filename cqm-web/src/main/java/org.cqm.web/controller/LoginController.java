package org.cqm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Dmitriy on 06.12.2016.
 */

@Controller
public class LoginController {

    @RequestMapping(value = "login")
    public String loginPage(Model model) {
        return "login";
    }
}
