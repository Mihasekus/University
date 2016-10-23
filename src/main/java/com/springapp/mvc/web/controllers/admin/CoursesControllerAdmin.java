package com.springapp.mvc.web.controllers.admin;


import com.springapp.mvc.model.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CoursesControllerAdmin {
    @Autowired
    private CoursesService coursesService;

    @RequestMapping(value = "/coursesTableAdmin.html")
    public ModelAndView CoursesTable(ModelMap modelMap, HttpServletRequest request) {
        ModelAndView coursesTable = new ModelAndView("admin/coursesTableAdmin");
        coursesTable.addObject("CoursesTable", coursesService.getCoursesByStatus("active"));
        coursesTable.addObject("menuIndex",request.getParameter("point"));
        return coursesTable;
    }

    @RequestMapping(value = "/courseAdmin.html")
    public ModelAndView course(ModelMap model, HttpServletRequest request) {
        ModelAndView showCourse = new ModelAndView("admin/courseAdmin");
        showCourse.addObject("id", Integer.valueOf(request.getParameter("id")).intValue());
        showCourse.addObject("Course", coursesService.getCourses());
        showCourse.addObject("menuIndex",request.getParameter("point"));
        return showCourse;

    }
    @RequestMapping("/CoursesAdminTableSearch")
    public ModelAndView searchTable(ModelMap modelMap, HttpServletRequest request){
        ModelAndView searchTable=new ModelAndView("user/CoursesAdminTable");
        searchTable.addObject("CoursesTable",coursesService.searchCourses(request.getParameter("search")));
        searchTable.addObject("menuIndex",request.getParameter("point"));
        return searchTable;
    }
}

