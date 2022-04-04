package com.example.demo.Module;

import javax.persistence.*;

@Entity
@Table(name = "Student_Teacher")
public class StudentTeacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    private Teacher teacher;

    public StudentTeacher(){}

    public StudentTeacher(Student student, Teacher teacher) {
        this.student = student;
        this.teacher = teacher;
    }

    public Integer getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudentTeacher{" +
                "id=" + id +
                ", student=" + student +
                ", teacher=" + teacher +
                '}';
    }
}
