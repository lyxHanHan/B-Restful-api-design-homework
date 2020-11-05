package com.thoughtworks.capability.gtb.restfulapidesign.service;

import com.thoughtworks.capability.gtb.restfulapidesign.domain.Student;
import com.thoughtworks.capability.gtb.restfulapidesign.exception.StudentAlreadyExistException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {
    private Map<String, Student> studentMap = new HashMap<>();

    public StudentService(){
        studentMap.put("小王",new Student(1,"小王","男","1"));
        studentMap.put("小李",new Student(2,"小李","男","1"));
        studentMap.put("小明",new Student(3,"小明","男","1"));
        studentMap.put("小赵",new Student(4,"小赵","男","1"));
        studentMap.put("小周",new Student(5,"小周","男","1"));
    }

    public List<Student> getAllStudent(){
        return new ArrayList<>(studentMap.values());
    }

    public Student getStudentById(Integer id) {
        return studentMap.get(id);
    }

    public void addStudent(Student student) {
        if (studentMap.containsKey(student.getName())) {
            throw new StudentAlreadyExistException("该学生已经存在");
        }
        student.setId(studentMap.size());
        studentMap.put(student.getName(), student);
    }
}

