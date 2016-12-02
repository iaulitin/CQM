package org.cqm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @RequestMapping(value = "index")
    public String printIndex(ModelMap model) {
        //ModelAndView
        model.addAttribute("message", "123");
        return "index";
    }
}
