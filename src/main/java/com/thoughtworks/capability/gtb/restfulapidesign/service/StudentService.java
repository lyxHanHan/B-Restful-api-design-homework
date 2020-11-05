package com.thoughtworks.capability.gtb.restfulapidesign.service;

import com.thoughtworks.capability.gtb.restfulapidesign.domain.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {
    private Map<Integer, Student> studentMap = new HashMap<>();

    public StudentService(){
        studentMap.put(1,new Student(1,"小王","男","1"));
        studentMap.put(2,new Student(2,"小李","男","1"));
        studentMap.put(3,new Student(3,"小明","男","1"));
        studentMap.put(4,new Student(4,"小赵","男","1"));
        studentMap.put(5,new Student(5,"小周","男","1"));
    }

    public List<Student> getAllStudent(){
        return new ArrayList<>(studentMap.values());
    }
}

