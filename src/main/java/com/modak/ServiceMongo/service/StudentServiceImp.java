package com.modak.ServiceMongo.service;


import com.modak.ServiceMongo.model.Student;
import com.modak.ServiceMongo.repository.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    StudentDAO studentDAO;

    @Override
    @RequestMapping(name="/get",method =RequestMethod.GET)
    public List<Student> getAllData() {
        List<Student> studentList=studentDAO.findAll();
//        for(Student s:studentList){
//            System.out.println(s.toString());
//            return s;
//        }
        return  studentList;
    }

    @Override
    @RequestMapping(name="/insert",method = RequestMethod.POST)
    public boolean insertDocument(@RequestBody Student student) {
        try {
            studentDAO.save(student);
            return true;
        }
        catch (Exception e){
            return false;
        }

    }
}
