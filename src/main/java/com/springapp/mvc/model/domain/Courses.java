package com.springapp.mvc.model.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "courses")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "status")
    private String status;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "courses_students",
            joinColumns = {@JoinColumn(name = "course_id")},
            inverseJoinColumns = {@JoinColumn(name = "student_id")})
    private Set<Courses> coursesStud = new HashSet<Courses>();
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "courses_lectors",
            joinColumns = {@JoinColumn(name = "course_id")},
            inverseJoinColumns = {@JoinColumn(name = "lector_id")})
    private Set<Courses> coursesLect = new HashSet<Courses>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Courses> getCoursesStud() {
        return coursesStud;
    }

    public void setCoursesStud(Set<Courses> coursesStud) {
        this.coursesStud = coursesStud;
    }

    public Set<Courses> getCoursesLect() {
        return coursesLect;
    }

    public void setCoursesLect(Set<Courses> coursesLect) {
        this.coursesLect = coursesLect;
    }
}
