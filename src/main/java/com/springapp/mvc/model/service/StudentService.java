package com.springapp.mvc.model.service;

import com.springapp.mvc.model.dao.StudentDAO;
import com.springapp.mvc.model.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Struct;
import java.util.List;

@Service("studentService")
@Transactional
public class StudentService {
    @Autowired
    private StudentDAO studentDAO;

    public List<Student> getStudents() {
        return studentDAO.getStudents();
    }
    public List<Student> getStudentsByStatus(String status) {
        return studentDAO.getStudentsByStatus(status);
    }
    public Student getStudent(int id) {
        return studentDAO.getStudent(id);
    }

    public void setStudent(Student student) {
        studentDAO.addNew(student);
    }

    public void changeStatus(int id, String status) {
        studentDAO.changeStatus(id, status);
    }
    public List<Student> searchStudents(String search){return studentDAO.searchStudents(search);}
}
