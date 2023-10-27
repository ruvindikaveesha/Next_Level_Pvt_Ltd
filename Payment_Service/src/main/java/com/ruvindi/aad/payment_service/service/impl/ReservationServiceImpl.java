package com.ruvindi.aad.payment_service.service.impl;

import com.ruvindi.aad.payment_service.entity.Reservation;
import com.ruvindi.aad.payment_service.service.ReservationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {

    @Override
    public Reservation makeReservation(Reservation reservation) {
        return null;
    }

    @Override
    public Reservation editReservation(Reservation reservation) {
        return null;
    }

    @Override
    public Reservation cancelReservation(String reservationId) {
        return null;
    }

    @Override
    public Date getReservedDate(String reservationId) {
        return null;
    }

//    @Override
//    public Date getReservedDate(String reservationId) {
//        return reservationRepo.getReservedDateByReservationId(reservationId);
//    }
}
