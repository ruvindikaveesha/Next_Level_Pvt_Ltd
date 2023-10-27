package com.ruvindi.aad.payment_service.repo;


import com.ruvindi.aad.payment_service.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface ReservationRepo extends JpaRepository<Reservation,Integer> {
    @Query("SELECT rr.reservedDate FROM Reservation rr WHERE rr.reservationId=:reservationId")
    Date getReservedDateByReservationId(@Param("reservationId") String reservationId);
}
