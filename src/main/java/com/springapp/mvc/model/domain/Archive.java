package com.springapp.mvc.model.domain;


import javax.persistence.*;


@Entity
@Table(name = "marks")
public class Archive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "lector_id")
    private Lectors lector;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Courses course;
    @Column(name = "status")
    private String status;
    @Column(name = "mark")
    private int mark;

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

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Lectors getLector() {
        return lector;
    }

    public void setLector(Lectors lector) {
        this.lector = lector;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }
}
