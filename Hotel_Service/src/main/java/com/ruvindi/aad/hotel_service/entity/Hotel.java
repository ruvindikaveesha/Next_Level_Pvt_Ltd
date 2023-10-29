package com.ruvindi.aad.hotel_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "hotel_details")

public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;
    private String contact;
    private Integer starRate;
    private String location;
    private String hotelCategory;
    private String googleMapCoordinates;
    private boolean petAreAllowed;
    private double hotelFee;
    private String cancellation_criteria;

}
