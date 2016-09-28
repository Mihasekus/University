package com.springapp.mvc.model.service;


import com.springapp.mvc.model.dao.CoursesDAO;
import com.springapp.mvc.model.domain.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("coursesService")
@Transactional
public class CoursesService {
    @Autowired
    private CoursesDAO coursesDAO;

    public List<Courses> getCourses() {
        return coursesDAO.getCourses();
    }
    public List<Courses> getCoursesByStatus(String status) {
        return coursesDAO.getCoursesByStatus(status);
    }
    public List<Courses> searchCourses(String search) {
        return coursesDAO.searchCourses(search);
    }
    public Courses getCourse(int id) {
        return coursesDAO.getCourse(id);
    }

    public void setCourses(Courses courses) {
        coursesDAO.addNew(courses);
    }

    public void changeStatus(int id, String status) {
        coursesDAO.changeStatus(id, status);
    }
}
