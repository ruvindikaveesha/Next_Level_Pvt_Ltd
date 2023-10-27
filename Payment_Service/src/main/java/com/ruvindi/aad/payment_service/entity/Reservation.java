package com.ruvindi.aad.payment_service.entity;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name = "reservation_details")
public class Reservation {
    @Id
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
