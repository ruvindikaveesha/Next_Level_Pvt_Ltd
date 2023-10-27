package com.ruvindi.aad.guide_service.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Document("Cluster0")
public class Guide {
    @Id
    private String id= UUID.randomUUID().toString();
    private String name;
    private String address;
    private String gender;
    private Integer age;
    private String contactNumber;
    private String status;
    private double manDayPrice;



}
