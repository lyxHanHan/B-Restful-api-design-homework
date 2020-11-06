package com.thoughtworks.capability.gtb.restfulapidesign.service;

import com.thoughtworks.capability.gtb.restfulapidesign.domain.Student;
import com.thoughtworks.capability.gtb.restfulapidesign.domain.Team;
import com.thoughtworks.capability.gtb.restfulapidesign.exception.StudentNotExistException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeamService {
    private Map<Integer, Team> teamMap = new HashMap<>();

    public TeamService(){
        teamMap.put(1,new Team(1,"Team1","1",null));
        teamMap.put(2,new Team(2,"Team2","2",null));
        teamMap.put(3,new Team(3,"Team3","3",null));
        teamMap.put(4,new Team(4,"Team4","4",null));
        teamMap.put(5,new Team(5,"Team5","5",null));
        teamMap.put(6,new Team(6,"Team6","6",null));
    }
    public List<Team> getAllTeams(){
        List<Student> students = StudentService.getAllStudent();
        teamMap.forEach((id,team) -> {
            ArrayList teamStudents = new ArrayList<>();
            for (int i = 0; i<students.size();i++) {
                if((i%6+1) == id) {
                    teamStudents.add(students.get(i));
                }
            }
        team.setStudents(teamStudents);
        });
        return new ArrayList<>(teamMap.values());
    }

    public Team updateTeamNameById(Integer id, Team team){
        if(teamMap.get(id)==null){
            throw new StudentNotExistException("该小组不存在");
        }
        else {
            Team group = teamMap.get(id);
            group.setName(team.getName());
            teamMap.put(id,group);
            return group;
        }
    }

//    public void updateStudentById(Integer id, Student student) {
//        if (studentMap.get(id) == null) {
//            throw new StudentNotExistException("id不存在");
//        }
//        else {
//            Student stu = studentMap.get(id);
//            stu.setName(student.getName());
//            stu.setGender(student.getGender());
//            stu.setNote(student.getNote());
//            studentMap.put(id,stu);
//        }
//    }
}
