package com.springapp.mvc.model.dao;


import com.springapp.mvc.model.domain.Courses;
import org.hibernate.Criteria;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.Struct;
import java.util.List;

@Repository("coursesDAO")
public class CoursesDAO extends GenericDAO {
    public CoursesDAO() {
    }

    public List<Courses> getCourses() {
        Criteria criteria = getSession().createCriteria(Courses.class);
        return (List<Courses>) criteria.list();
    }

    public List<Courses> searchCourses(String search){
        Criteria criteria=getSession().createCriteria(Courses.class);
        criteria.add((Restrictions.like("name", search, MatchMode.ANYWHERE)));
        List <Courses> courses = criteria.list();
        return courses.size()>0 ? courses:null;
    }
    public Courses getCourse(int id) {
        Criteria criteria = getSession().createCriteria(Courses.class);
        criteria.add(Restrictions.eq("id", id));
        List<Courses> courses = criteria.list();
        return courses.size() > 0 ? courses.get(0) : null;
    }

    public List<Courses> getCoursesByStatus(String status) {
        Criteria criteria = getSession().createCriteria(Courses.class);
        criteria.add(Restrictions.eq("status", status));
        List<Courses> courses = criteria.list();
        return (List<Courses>) criteria.list();
    }

    public Courses getCourseByStatus(String id, String status) {
        Criteria criteria = getSession().createCriteria(Courses.class);
        criteria.add(Restrictions.eq("id", id));
        criteria.add(Restrictions.eq("status", status));
        List<Courses> courses = criteria.list();
        return courses.size() > 0 ? courses.get(0) : null;
    }

    @Transactional
    public void addNew(Courses courses) {
        getSession().save(courses);
    }

    @Transactional
    public void changeStatus(int id, String status) {
        Courses courses = getCourse(id);
        courses.setStatus(status);
        getSession().update(courses);
    }

    @Transactional
    public void UpOne(Courses courses) {
        getSession().update(courses);
    }
}

