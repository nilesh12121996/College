package com.example.demo.services;

import com.example.demo.Module.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    Student getStudentById(String Id);

    List<Student> getAllStudents();

    Student createStudent(Student st);

    Student updateStudent(String id, String name);

    void deleteStudentById(String id);

}
