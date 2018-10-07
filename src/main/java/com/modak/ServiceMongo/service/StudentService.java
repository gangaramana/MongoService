package com.modak.ServiceMongo.service;


import com.modak.ServiceMongo.model.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllData();
    public boolean insertDocument(Student student);
}
