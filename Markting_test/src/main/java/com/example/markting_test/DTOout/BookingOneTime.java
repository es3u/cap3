package com.example.markting_test.DTOout;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class BookingOneTime {

    private LocalDateTime booking_date = LocalDateTime.now();

    private String booking_status ;

    private Double booking_totalPrice;
}
