package com.deqode.backend2.springpractice.repository;

import com.deqode.backend2.springpractice.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,String> {


}
