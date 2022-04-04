package com.example.demo.controller;

import com.example.demo.Module.Student;
import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

        @PostMapping("/student")
        public  ResponseEntity<Student> createStudent(@RequestParam String name, @RequestParam String id)
        {
                return new ResponseEntity<>(studentService.createStudent(new Student(id, name)), HttpStatus.OK);
        }

        @DeleteMapping("/student")
        public  ResponseEntity<String> deleteStudentById(@RequestParam String id)
        {
                studentService.deleteStudentById(id);
                return new ResponseEntity<>("Sucessfully Deleted", HttpStatus.OK);
        }

        @PutMapping("/student")
        public  ResponseEntity<Student> updateStudentById(@RequestParam String id, @RequestParam String name)
        {
                return new ResponseEntity<>(studentService.updateStudent(id, name), HttpStatus.OK);
        }

}
