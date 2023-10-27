package com.ruvindi.aad.travel_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "travel_package_details")

public class TravelPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Integer headCount;
    private String packageCategory;
    private String packageName;
    private int starRate;
    private String description;


}
