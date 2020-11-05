package com.thoughtworks.capability.gtb.restfulapidesign.controller;

import com.thoughtworks.capability.gtb.restfulapidesign.domain.Student;
import com.thoughtworks.capability.gtb.restfulapidesign.domain.Team;
import com.thoughtworks.capability.gtb.restfulapidesign.service.TeamService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamController {
    private TeamService teamService;

    public TeamController (TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/teams")
    public List<Team> getAllTeams (Team team) {
        return teamService.getAllTeams();
    }

    @PatchMapping("teams/{id}")
    public Team updateTeamNameById(@PathVariable Integer id, @RequestBody Team team){
        return  teamService.updateTeamNameById(id,team);
    }
}
//    public Student updateStudentById (@PathVariable Integer id , @RequestBody Student student) {
//        studentService.updateStudentById(id,student);
//        return studentService.getStudentById(id);