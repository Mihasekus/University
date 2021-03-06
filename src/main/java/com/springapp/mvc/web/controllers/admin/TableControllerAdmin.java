package com.springapp.mvc.web.controllers.admin;

import com.springapp.mvc.model.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TableControllerAdmin {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/studentTableAdmin.html")
    public ModelAndView printTable(ModelMap model, HttpServletRequest request) {
        ModelAndView showTable = new ModelAndView("admin/studentTableAdmin");
        showTable.addObject("Student", studentService.getStudentsByStatus("active"));
        showTable.addObject("menuIndex", request.getParameter("point"));
        return showTable;
    }

}
