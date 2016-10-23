package com.springapp.mvc.web.controllers.admin;

import com.springapp.mvc.model.domain.Lectors;
import com.springapp.mvc.model.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DeleteController {
    @Autowired
    private ArchiveService archiveService;
    @Autowired
    private LectorsService lectorsService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private CoursesService coursesService;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/delStudent.html")
    public ModelAndView delStudent(ModelMap modelMap, HttpServletRequest request) {
        ModelAndView delStudent = new ModelAndView("admin/studentTableAdmin");
        studentService.changeStatus(Integer.valueOf(request.getParameter("id")).intValue(), "inactive");
        delStudent.addObject("menuIndex",request.getParameter("point"));
        return delStudent;
    }

    @RequestMapping(value = "/delLector.html")
    public ModelAndView delLector(ModelMap modelMap, HttpServletRequest request) {
        ModelAndView delLector = new ModelAndView("admin/lectorsTableAdmin");
        Lectors lectors = new Lectors();
        lectorsService.changeStatus(Integer.valueOf(request.getParameter("id")).intValue(), "inactive");
        delLector.addObject("menuIndex",request.getParameter("point"));
        return delLector;
    }

    @RequestMapping(value = "/delCourse.html")
    public ModelAndView delCourse(ModelMap modelMap, HttpServletRequest request) {
        ModelAndView delCourse = new ModelAndView("admin/coursesTableAdmin");
        coursesService.changeStatus(Integer.valueOf(request.getParameter("id")).intValue(), "inactive");
        return delCourse;
    }

    @RequestMapping(value = "/delMark.html")
    public ModelAndView delMark(ModelMap modelMap, HttpServletRequest request) {
        ModelAndView delMark = new ModelAndView("admin/archiveAdmin");
        archiveService.changeStatus(Integer.valueOf(request.getParameter("id")).intValue(), "inactive");
        return delMark;
    }

}


