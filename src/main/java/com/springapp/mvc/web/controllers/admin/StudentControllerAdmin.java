package com.springapp.mvc.web.controllers.admin;


import com.springapp.mvc.model.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class StudentControllerAdmin {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/studentAdmin.html")
    public ModelAndView showStudent(ModelMap model, HttpServletRequest request) {
        ModelAndView showPerson = new ModelAndView("admin/studentAdmin");
        showPerson.addObject("id", request.getParameter("id"));
        showPerson.addObject("Student", studentService.getStudents());
        System.out.println(request.getParameter("id"));
        showPerson.addObject("menuIndex",request.getParameter("point"));
        return showPerson;

    }
    @RequestMapping("/StudentAdminTableSearch.html")
    public ModelAndView searchTable(ModelMap modelMap, HttpServletRequest request){
            ModelAndView searchTable=new ModelAndView("user/StudentTable");
            searchTable.addObject("Student", studentService.searchStudents(request.getParameter("search")));
            searchTable.addObject("menuIndex", request.getParameter("point"));
            return searchTable;
        }

}

