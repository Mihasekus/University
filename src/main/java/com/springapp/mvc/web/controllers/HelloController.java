package com.springapp.mvc.web.controllers;

import com.springapp.mvc.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
    @Autowired
    public UserService userService;

    @RequestMapping(value = "/login.html", method = RequestMethod.POST)
    public ModelAndView modelAndView(ModelMap modelMap, HttpServletRequest request) {
        String status=new String("active");
        String role = new String(userService.getUserByStatus(request.getParameter("login"), request.getParameter("password"),status).getRole());

        if (role != null) {
            if (role.equals("admin"))
                return new ModelAndView("redirect:menuAdmin.html");
            else
                return new ModelAndView("redirect:menu.html");
        } else
            return new ModelAndView("redirect:error.html");
    }

    @RequestMapping(value = "/login.html", method = RequestMethod.GET)
    public String getInto(ModelMap model) {
        return "login";

    }
}