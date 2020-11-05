package com.thoughtworks.capability.gtb.restfulapidesign.domain;


import lombok.NonNull;

public class Team {

    @NonNull
    private Integer id;

    @NonNull
    private String name;

    private String note;
}
