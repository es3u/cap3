package com.example.markting_test.Controller;

import com.example.markting_test.Model.Booking_OneTime;
import com.example.markting_test.Service.Booking_OneTimeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/booking-one-time")
@RequiredArgsConstructor
public class Booking_OneTimeController {
    private final Booking_OneTimeService booking_OneTimeService;

    @GetMapping("/getAll")
    public ResponseEntity getAllBookings(){
        return ResponseEntity.ok().body(booking_OneTimeService.getAll());
    }
    @PostMapping("/add")
    public ResponseEntity addBooking(@RequestBody@Valid Booking_OneTime booking_OneTime){
        booking_OneTimeService.addBookingOneTime(booking_OneTime);
        return ResponseEntity.ok().body("add booking success");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateBooking(@PathVariable Integer id ,@RequestBody@Valid Booking_OneTime booking_OneTime){
        booking_OneTimeService.updateBookingOneTime(id,booking_OneTime);
        return ResponseEntity.ok().body("update booking success");
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteBooking(@PathVariable Integer id ){
        booking_OneTimeService.deleteBookingOneTime(id);
        return ResponseEntity.ok().body("delete booking success");
    }
}
