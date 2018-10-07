package com.modak.ServiceMongo.repository;


import com.modak.ServiceMongo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface StudentDAO extends MongoRepository<Student,String>{
    public Student findById();
    public List<Student> findAll();

}
