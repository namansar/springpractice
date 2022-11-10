package com.deqode.backend2.springpractice.service;

import com.deqode.backend2.springpractice.entity.Student;
import com.deqode.backend2.springpractice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public Student createStudent(Student student) {
       return studentRepository.save(student);
    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id).get();
    }

    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }
}
