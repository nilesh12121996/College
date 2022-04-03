package com.example.demo.controller;

import com.example.demo.Module.Student;
import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

        private final StudentService studentService;

        @Autowired
        public StudentController(StudentService studentService)
        {
            this.studentService= studentService;
        }

        @GetMapping("/student")
        public ResponseEntity<List<Student>> getAllStudents()
        {
            return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
        }

        @GetMapping("/student/{id}")
        public ResponseEntity<Student> getStudentById(@PathVariable String id)
        {
                return new ResponseEntity<>(studentService.getStudentById(id), HttpStatus.OK);
        }

        @GetMapping("/student/create")
        public  ResponseEntity<Student> createStudent(@RequestParam)

}