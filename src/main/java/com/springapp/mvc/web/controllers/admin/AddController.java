package com.springapp.mvc.web.controllers.admin;


import com.springapp.mvc.model.domain.*;
import com.springapp.mvc.model.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
public class AddController {
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

    @RequestMapping(value = "/showAddStudent.html")
    public ModelAndView showAddStudent(ModelMap modelMap, HttpServletRequest request) {
        ModelAndView addStudent = new ModelAndView("admin/addStudent");
        addStudent.addObject("roles",fillRoles());
        addStudent.addObject("menuIndex",request.getParameter("point"));
        return addStudent;
    }

    @RequestMapping(value = "/addStudent.html")
    public ModelAndView addStudent(ModelMap modelMap, HttpServletRequest request) {
        ModelAndView addStudent = new ModelAndView("admin/addStudent");
        Student student = new Student();
        User user = new User();
        student.setBirthdate(request.getParameter("studentBirthdate"));
        student.setName(request.getParameter("studentName"));
        student.setSurname(request.getParameter("studentSurname"));
        user.setLogin(request.getParameter("UserLogin"));
        user.setPassword(request.getParameter("UserPassword"));
        user.setRole(request.getParameter("Role"));
        userService.setUser(user);
        student.setUser(userService.getUser(request.getParameter("UserLogin"), request.getParameter("UserPassword")));
        studentService.setStudent(student);
        addStudent.addObject("menuIndex",request.getParameter("point"));
        return addStudent;
    }

    @RequestMapping(value = "/showAddLector.html")
    public ModelAndView showAddLector(ModelMap modelMap, HttpServletRequest request) {
        ModelAndView addLector = new ModelAndView("admin/addLector");
        addLector.addObject("roles",fillRoles());
        addLector.addObject("menuIndex",request.getParameter("point"));
        return addLector;
    }

    @RequestMapping(value = "/addLector.html")
    public ModelAndView AddLector(ModelMap modelMap, HttpServletRequest request) {
        ModelAndView addLector = new ModelAndView("admin/addLector");
        Lectors lectors = new Lectors();
        User user = new User();
        lectors.setName(request.getParameter("lectorName"));
        lectors.setSurname(request.getParameter("lectorSurname"));
        user.setLogin(request.getParameter("UserLogin"));
        user.setPassword(request.getParameter("UserPassword"));
        user.setRole(request.getParameter("Role"));
        userService.setUser(user);
        lectors.setUser(userService.getUser(request.getParameter("UserLogin"), request.getParameter("UserPassword")));
        lectorsService.setLectors(lectors);
        addLector.addObject("menuIndex",request.getParameter("point"));
        return addLector;
    }

    @RequestMapping(value = "/showAddCourse.html")
    public ModelAndView showAddCourse(ModelMap modelMap, HttpServletRequest request) {
        ModelAndView addCourse = new ModelAndView("admin/addCourse");
        return addCourse;
    }

    @RequestMapping(value = "/addCourse.html")
    public ModelAndView addCourse(ModelMap modelMap, HttpServletRequest request) {
        ModelAndView addCourse = new ModelAndView("admin/addCourse");
        Courses courses = new Courses();
        courses.setName(request.getParameter("courseName"));
        coursesService.setCourses(courses);
        addCourse.addObject("menuIndex",request.getParameter("point"));
        return addCourse;
    }

    @RequestMapping(value = "/showAddMark.html")
    public ModelAndView showAddMark(ModelMap modelMap, HttpServletRequest request) {
        ModelAndView addMark = new ModelAndView("admin/addMark");
        addMark.addObject("students",studentService.getStudents());
        addMark.addObject("courses", coursesService.getCourses());
        addMark.addObject("lectors",lectorsService.getLectors());
        addMark.addObject("menuIndex",request.getParameter("point"));
        return addMark;
    }

    @RequestMapping(value = "/addMark.html")
    public ModelAndView addMark(ModelMap modelMap, HttpServletRequest request) {
        ModelAndView addMark = new ModelAndView("admin/addMark");
        Archive archive = new Archive();
        archive.setCourse(coursesService.getCourse(Integer.valueOf(request.getParameter("courseId")).intValue()));
        archive.setLector(lectorsService.getLector(Integer.valueOf(request.getParameter("lectorId")).intValue()));
        archive.setStudent(studentService.getStudent(Integer.valueOf(request.getParameter("studentId")).intValue()));
        archive.setMark(Integer.valueOf(request.getParameter("mark")));
        archiveService.setMark(archive);
        addMark.addObject("menuIndex",request.getParameter("point"));
        return addMark;
    }
    private ArrayList fillRoles(){
        ArrayList roles=new ArrayList();
        roles.add("user");
        roles.add("admin");
        return roles;
    }
}
