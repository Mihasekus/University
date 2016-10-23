package com.springapp.mvc.web.controllers.user;


import com.springapp.mvc.model.service.LectorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LectorsController {
    @Autowired
    private LectorsService lectorsService;

    @RequestMapping(value = "/LectorsTable.html", method = RequestMethod.GET)
    public ModelAndView CoursesTable(ModelMap modelMap, HttpServletRequest request) {
        ModelAndView lectorsTable = new ModelAndView("user/LectorsTable");
        lectorsTable.addObject("LectorsTable", lectorsService.getLectorsByStatus("active"));
        lectorsTable.addObject("menuIndex",request.getParameter("point"));
        return lectorsTable;
    }

    @RequestMapping(value = "/lector.html")
    public ModelAndView lector(ModelMap model, HttpServletRequest request) {
        ModelAndView showPerson = new ModelAndView("user/lector");
        showPerson.addObject("id", request.getParameter("id"));
        showPerson.addObject("Lector", lectorsService.getLectors());
        showPerson.addObject("menuIndex",request.getParameter("point"));
        System.out.println(request.getParameter("id"));
        return showPerson;

    }
    @RequestMapping("/LectorTableSearch")
    public ModelAndView searchTable(ModelMap modelMap, HttpServletRequest request){
        ModelAndView searchTable=new ModelAndView("user/LectorsTable");
        searchTable.addObject("LectorsTable",lectorsService.searchLector(request.getParameter("search")));
        searchTable.addObject("menuIndex",request.getParameter("point"));
        return searchTable;
    }

}

