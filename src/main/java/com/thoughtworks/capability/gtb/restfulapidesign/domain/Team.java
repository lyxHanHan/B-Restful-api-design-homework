package com.thoughtworks.capability.gtb.restfulapidesign.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Team {
    @NonNull
    private Integer id;

    @NonNull
    private String name;

    private String note;

    private List<Student> students;
}
