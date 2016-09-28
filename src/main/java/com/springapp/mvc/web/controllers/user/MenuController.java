package com.springapp.mvc.web.controllers.user;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {

    @RequestMapping(value = "/menu.html")
    public String getInto(ModelMap model) {
        return "user/menu";

    }
}
