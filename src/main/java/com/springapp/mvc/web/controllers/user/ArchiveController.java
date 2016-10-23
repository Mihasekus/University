package com.springapp.mvc.web.controllers.user;


import com.springapp.mvc.model.service.ArchiveService;
import com.springapp.mvc.model.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ArchiveController {
    @Autowired
    private ArchiveService archiveService;
    @Autowired
    private CoursesService coursesService;
    @RequestMapping(value = "/Archive.html", method = RequestMethod.GET)
    public ModelAndView archiveTable(ModelMap modelMap, HttpServletRequest request) {
        ModelAndView showArchive = new ModelAndView("user/Archive");
        showArchive.addObject("Archive", archiveService.getArchiveByStatus("active"));
        showArchive.addObject("courses",fillCoursesDropdown());
        showArchive.addObject("marks", fillMarks());
        showArchive.addObject("menuIndex",request.getParameter("point"));
        return showArchive;
    }

    @RequestMapping("/ArchiveTableSearch.html")
     public ModelAndView searchTable(ModelMap modelMap, HttpServletRequest request){
        ModelAndView searchTable=new ModelAndView("user/Archive");
        searchTable.addObject("Archive",archiveService.searchArchive(request.getParameter("searchStud"),request.getParameter("searchLector"),request.getParameter("course"),request.getParameter("mark")));
        searchTable.addObject("courses",fillCoursesDropdown());
        searchTable.addObject("marks", fillMarks());
        searchTable.addObject("menuIndex",request.getParameter("point"));
        return searchTable;

    }

    public List fillCoursesDropdown(){
        List courses=new ArrayList(coursesService.getCoursesByStatus("active"));
     return  courses;
    }

    public List fillMarks(){
        ArrayList marks=new ArrayList();
        marks.add('1');
        marks.add('2');
        marks.add('3');
        marks.add('4');
        marks.add('5');
        return  marks;
    }
}