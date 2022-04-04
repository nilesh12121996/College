package com.example.demo.repository;

import com.example.demo.Module.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher, String> {
}
