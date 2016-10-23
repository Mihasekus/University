package com.springapp.mvc.web.controllers.admin;

import com.springapp.mvc.model.service.LectorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LectorsControllerAdmin {
    @Autowired
    private LectorsService lectorsService;

    @RequestMapping(value = "/lectorsTableAdmin.html", method = RequestMethod.GET)
    public ModelAndView CoursesTable(ModelMap modelMap, HttpServletRequest request) {
        ModelAndView lectorsTable = new ModelAndView("admin/lectorsTableAdmin");
        lectorsTable.addObject("LectorsTable", lectorsService.getLectorsByStatus("active"));
        lectorsTable.addObject("menuIndex",request.getParameter("point"));
        return lectorsTable;
    }

    @RequestMapping(value = "/lectorAdmin.html")
    public ModelAndView lector(ModelMap model, HttpServletRequest request) {
        ModelAndView showPerson = new ModelAndView("admin/lectorAdmin");
        showPerson.addObject("id", request.getParameter("id"));
        showPerson.addObject("Lector", lectorsService.getLectors());
        System.out.println(request.getParameter("id"));
        showPerson.addObject("menuIndex",request.getParameter("point"));
        return showPerson;

    }

    @RequestMapping("/LectorAdminTableSearch")
    public ModelAndView searchTable(ModelMap modelMap, HttpServletRequest request){
        ModelAndView searchTable=new ModelAndView("user/LectorTable");
        searchTable.addObject("LectorsTable",lectorsService.searchLector(request.getParameter("search")));
        return searchTable;
    }

}

