package com.deqode.backend2.springpractice.controller;

import com.deqode.backend2.springpractice.entity.Student;
import com.deqode.backend2.springpractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping("/getById/{id}")
    public Student getStudentById(@PathVariable String id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/allStudents")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
