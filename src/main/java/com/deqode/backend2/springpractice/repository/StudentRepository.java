package com.deqode.backend2.springpractice.repository;

import com.deqode.backend2.springpractice.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentRepository extends MongoRepository<Student,String> {

    List<Student> findByName(String name);

    List<Student> findByNameAndEmail(String name, String email);


}
