package com.thoughtworks.capability.gtb.restfulapidesign.domain;


import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    @NotNull
    private Integer id;
    @NotNull
    private  String name;
    private String gender;
    private String note;
}
