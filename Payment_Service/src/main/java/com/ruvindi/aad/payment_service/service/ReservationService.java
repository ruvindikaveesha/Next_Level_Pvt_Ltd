package com.ruvindi.aad.payment_service.service;

import com.ruvindi.aad.payment_service.entity.Reservation;

import java.util.Date;

public interface ReservationService {
    Reservation makeReservation(Reservation reservation);
    Reservation editReservation(Reservation reservation);
    Reservation cancelReservation(String reservationId);
    Date getReservedDate(String reservationId);
}

