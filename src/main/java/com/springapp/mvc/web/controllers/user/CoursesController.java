package com.springapp.mvc.web.controllers.user;


import com.springapp.mvc.model.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CoursesController {
    @Autowired
    private CoursesService coursesService;

    @RequestMapping(value = "/CoursesTable.html", method = RequestMethod.GET)
    public ModelAndView CoursesTable(ModelMap modelMap,HttpServletRequest request) {
        ModelAndView coursesTable = new ModelAndView("user/CoursesTable");
        coursesTable.addObject("CoursesTable", coursesService.getCoursesByStatus("active"));
        coursesTable.addObject("menuIndex",request.getParameter("point"));
        return coursesTable;
    }

    @RequestMapping(value = "/course.html")
    public ModelAndView course(ModelMap model, HttpServletRequest request) {
        ModelAndView showCourse = new ModelAndView("user/course");
        showCourse.addObject("id", request.getParameter("id"));
        showCourse.addObject("Course", coursesService.getCourses());
        showCourse.addObject("menuIndex",request.getParameter("point"));
        return showCourse;

    }
    @RequestMapping("/CoursesTableSearch")
    public ModelAndView searchTable(ModelMap modelMap, HttpServletRequest request){
        ModelAndView searchTable=new ModelAndView("user/CoursesTable");
        searchTable.addObject("CoursesTable",coursesService.searchCourses(request.getParameter("search")));
        searchTable.addObject("menuIndex",request.getParameter("point"));
        return searchTable;
    }
}

