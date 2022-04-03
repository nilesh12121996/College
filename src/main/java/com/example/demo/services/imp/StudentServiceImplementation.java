package com.example.demo.services.imp;

import com.example.demo.Module.Student;
import com.example.demo.repository.StudentRepo;
import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentServiceImplementation implements StudentService {

    @Autowired
    private StudentRepo studentRepo;


    @Override
    public Student getStudentById(String Id) {

        return studentRepo.getById(Id);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student createStudent(Student st) {
        return studentRepo.save(st);
    }

    @Override
    public Student updateStudent(String id, String name) {

        Student student = studentRepo.getById(id);
        studentRepo.deleteById(id);
        student.setName(name);
        return studentRepo.save(student);
    }

    public void deleteStudentById(String id)
    {
        studentRepo.deleteById(id);
    }
}
