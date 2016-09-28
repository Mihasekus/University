package com.springapp.mvc.web.controllers.user;

import com.springapp.mvc.model.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TableController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/StudentTable.html")
    public ModelAndView printTable(ModelMap model) {
        ModelAndView showTable = new ModelAndView("user/StudentTable");
        showTable.addObject("Student", studentService.getStudentsByStatus("active"));
        return showTable;
    }

}
