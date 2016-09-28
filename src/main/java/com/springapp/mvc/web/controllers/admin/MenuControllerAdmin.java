package com.springapp.mvc.web.controllers.admin;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuControllerAdmin {

    @RequestMapping(value = "/menuAdmin.html")
    public String getInto(ModelMap model) {
        return "admin/menuAdmin";

    }
}
