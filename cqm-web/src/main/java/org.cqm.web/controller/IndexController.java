package org.cqm.web.controller;

import org.cqm.data.entity.User;
import org.cqm.data.services.UserService;
import org.cqm.web.config.details.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class IndexController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(value = "/") //that's the link at the website
    public String printIndex(ModelMap model) {
        return "index";     //that's the name of jsp to return
    }
}
