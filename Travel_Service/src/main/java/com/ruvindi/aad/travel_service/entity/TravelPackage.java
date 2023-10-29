package com.ruvindi.aad.travel_service.entity;

import jakarta.persistence.*;
import lombok.*;

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
    private Integer starRate;
    private String description;


}
