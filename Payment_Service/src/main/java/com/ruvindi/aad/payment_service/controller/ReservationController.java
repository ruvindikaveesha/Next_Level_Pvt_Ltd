package com.ruvindi.aad.payment_service.controller;

import com.ruvindi.aad.payment_service.entity.Reservation;
import com.ruvindi.aad.payment_service.service.ReservationService;
import com.ruvindi.aad.payment_service.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value = "/reservation")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @PostMapping(value = "/make")
    public Response makeReservation(@RequestBody Reservation reservation) {
        return new Response(HttpStatus.OK,"Reserved",reservationService.makeReservation(reservation));
    }

    @PutMapping(value = "/edit")
    public Response editReservation(@RequestBody Reservation reservation) {
        if (findDateDifference(String.valueOf(reservation.getReservationId()))){
            return new Response(HttpStatus.OK,"Edited",reservationService.editReservation(reservation));
        }
        return new Response(HttpStatus.SERVICE_UNAVAILABLE,"Can't Edit",null);
    }

    @PutMapping(value = "/cancel")
    public Reservation cancelReservation(@RequestParam String reservationId) {
        if (findDateDifference(reservationId)){
            return reservationService.cancelReservation(reservationId);
        }
        return null;
    }

    private Boolean findDateDifference(String reservationId) {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date start_date = reservationService.getReservedDate(reservationId);
        Date end_date = new Date();
        long difference_In_Time = end_date.getTime() - start_date.getTime();
        long difference_In_Days = (difference_In_Time / (1000 * 60 * 60 * 24)) % 365;

        if (difference_In_Days < 2){
            return true;
        }
        return false;
    }

    @GetMapping(value = "/getAll")
    public Response getAll(String id){
        return new Response(HttpStatus.OK,"Done",reservationService.getAll(id));
    }
}
