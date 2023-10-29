package com.ruvindi.aad.driver_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name ="driver_details")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    private String name;
    private String address;
    private String email;
    private String nic;
    private String status;
    private String contactNum;
    private String drivingLicenseImg;

}
