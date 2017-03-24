package org.cqm.web.controller;

import org.cqm.data.entity.User;
import org.cqm.data.repositories.UserRepository;
import org.cqm.data.services.UserService;
import org.cqm.web.config.Validator.UserValidator;
import org.jboss.security.jacc.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@Controller
public class SignupController {

    @Autowired
    private UserValidator userValidator;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "signup";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signup(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        userValidator.validate(userForm, bindingResult);
        if (bindingResult.hasErrors()) {
            return "signup";
        }
        userService.save(userForm);
        return "login";
    }
}
