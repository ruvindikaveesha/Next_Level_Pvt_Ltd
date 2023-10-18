package com.ruvindi.aad.driver_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "driver_details")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    private String name;
    private String address;
    private String contactNum;
    private String drivingLicenseFrontImg;
    private String drivingLicenseRearImg;
}
