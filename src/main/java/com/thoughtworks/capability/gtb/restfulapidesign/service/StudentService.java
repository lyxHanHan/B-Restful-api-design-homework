package com.thoughtworks.capability.gtb.restfulapidesign.service;

import com.thoughtworks.capability.gtb.restfulapidesign.domain.Student;
import com.thoughtworks.capability.gtb.restfulapidesign.exception.StudentAlreadyExistException;
import com.thoughtworks.capability.gtb.restfulapidesign.exception.StudentNotExistException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StudentService {
    private Map<Integer, Student> studentMap = new HashMap<>();

    public StudentService(){
        studentMap.put(1,new Student(1,"小王","male","1"));
        studentMap.put(2,new Student(2,"小李","male","1"));
        studentMap.put(3,new Student(3,"小明","male","1"));
        studentMap.put(4,new Student(4,"小赵","male","1"));
        studentMap.put(5,new Student(5,"小周","male","1"));
    }

    public List<Student> getAllStudent(){
        return new ArrayList<>(studentMap.values());
    }

    public Student getStudentById(Integer id) {
        return studentMap.get(id);
    }

    public void addStudent(Student student) {
        if (studentMap.containsKey(student.getId())) {
            throw new StudentAlreadyExistException("该学生已经存在");
        }else{
            student.setId(studentMap.size());
            studentMap.put(student.getId(), student);
        }

    }

    public void deleteStudentById (Integer id){
        if (studentMap.get(id) == null) {
            throw new StudentNotExistException("id不存在");
        }
        else studentMap.remove(id);
    }

    public void updateStudentById(Integer id, Student student) {
        if (studentMap.get(id) == null) {
            throw new StudentNotExistException("id不存在");
        }
        else {
            Student stu = studentMap.get(id);
            stu.setName(student.getName());
            stu.setGender(student.getGender());
            stu.setNote(student.getNote());
            studentMap.put(id,stu);
        }
    }

    public List<Student> getStudentByGender(String gender) {

        List<Student> students = studentMap.values().stream()
                  .filter(Student -> Student.getGender().equals(gender))
                  .collect(Collectors.toList());
        return students;
    }
}

