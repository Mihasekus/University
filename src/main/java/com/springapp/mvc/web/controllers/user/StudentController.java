package com.springapp.mvc.web.controllers.user;


import com.springapp.mvc.model.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/student.html")
    public ModelAndView showTable(ModelMap model, HttpServletRequest request) {
        ModelAndView showPerson = new ModelAndView("user/student");
        showPerson.addObject("id", request.getParameter("id"));
        showPerson.addObject("Student", studentService.getStudentsByStatus("active"));
        System.out.println(request.getParameter("id"));
        showPerson.addObject("menuIndex",request.getParameter("point"));
        return showPerson;

    }
    @RequestMapping("/StudentTableSearch")
    public ModelAndView searchTable(ModelMap modelMap, HttpServletRequest request){
        ModelAndView searchTable=new ModelAndView("user/StudentTable");
        searchTable.addObject("Student", studentService.searchStudents(request.getParameter("search")));
        searchTable.addObject("menuIndex",request.getParameter("point"));
        return searchTable;
    }
}

