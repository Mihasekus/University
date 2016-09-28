package com.springapp.mvc.model.dao;

import com.springapp.mvc.model.domain.Student;

import org.hibernate.Criteria;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository("studentDAO")
public class StudentDAO extends GenericDAO {
    public StudentDAO() {
    }

    public List<Student> getStudents() {
        Criteria criteria = getSession().createCriteria(Student.class);
        return (List<Student>) criteria.list();
    }
    public List<Student> getStudentsByStatus(String status) {
        Criteria criteria = getSession().createCriteria(Student.class);
        criteria.add(Restrictions.eq("status", status));
        return (List<Student>) criteria.list();
    }

    public Student getStudent(int id) {
        Criteria criteria = getSession().createCriteria(Student.class);
        criteria.add(Restrictions.eq("id", id));
        List<Student> students = criteria.list();
        return students.size() > 0 ? students.get(0) : null;
    }
    public List<Student> searchStudents(String search){
        Criteria criteria=getSession().createCriteria(Student.class);
        criteria.add(Restrictions.or(Restrictions.like("name", search, MatchMode.ANYWHERE), Restrictions.like("surname", search, MatchMode.ANYWHERE)));
        List < Student > students = criteria.list();
        return students.size()>0 ? students:null;
    }

    @Transactional
    public void addNew(Student student) {
        getSession().save(student);
    }

    @Transactional
    public void changeStatus(int id, String status) {
        Student student = getStudent(id);
        student.setStatus(status);
        getSession().update(student);
    }

    @Transactional
    public void UpOne(Student student) {
        getSession().update(student);
    }
}
