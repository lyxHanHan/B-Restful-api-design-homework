package com.thoughtworks.capability.gtb.restfulapidesign.service;

import com.thoughtworks.capability.gtb.restfulapidesign.domain.Team;
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
        return new ArrayList<>(teamMap.values());
    }
}
