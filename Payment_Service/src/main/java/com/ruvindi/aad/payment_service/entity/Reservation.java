package com.ruvindi.aad.payment_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reservation_details")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int reservationId;
    private String packageId;
    private String hotelId;
    private String vehicleRegNumber;
    private String userId;
    private String status;
    private double totalAmount;
    private String driverId;
    private String guideId;
    private Date reservedDate;

}
