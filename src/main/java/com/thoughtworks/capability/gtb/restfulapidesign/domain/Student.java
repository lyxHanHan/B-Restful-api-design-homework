package com.thoughtworks.capability.gtb.restfulapidesign.domain;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    @NonNull
    private Integer id;
    @NonNull
    private  String name;
    private String gender;
    private String note;
}
