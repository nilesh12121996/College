package com.example.demo.repository;

import com.example.demo.Module.StudentTeacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentTeacherRepo extends JpaRepository<StudentTeacher, Integer> {
}
