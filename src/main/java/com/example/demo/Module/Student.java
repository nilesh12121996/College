package com.example.demo.Module;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "Student")
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String studentid;

    @Column(name= "Stname")
    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    private List<StudentTeacher> studentTeachers= new ArrayList<>();

    public List<StudentTeacher> getStudentTeachers()
    {
        return studentTeachers;
    }

    public void setStudentTeachers(List<StudentTeacher> st)
    {
        this.studentTeachers = st;
    }

    public void addStudentTeachers(StudentTeacher st)
    {
        this.studentTeachers.add(st);
    }

    public String getStudentid() {
        return studentid;
    }

    public String getName() {
        return name;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid='" + studentid + '\'' +
                ", name='" + name + '\'' +
                ", studentTeachers=" + studentTeachers +
                '}';
    }
}
