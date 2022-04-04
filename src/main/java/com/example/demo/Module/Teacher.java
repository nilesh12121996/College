package com.example.demo.Module;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  String Id;

    @Column
    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    @JsonIgnore
    private List<StudentTeacher> studentTeachers = new ArrayList<>();

    public String getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public List<StudentTeacher> getStudentTeachers() {
        return studentTeachers;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentTeachers(List<StudentTeacher> studentTeachers) {
        this.studentTeachers = studentTeachers;
    }

    public  void addStudentTeachers(StudentTeacher st)
    {
        this.studentTeachers.add(st);
    }
}
