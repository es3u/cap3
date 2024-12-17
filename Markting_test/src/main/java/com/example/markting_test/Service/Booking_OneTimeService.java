package com.example.markting_test.Service;

import com.example.markting_test.ApiResponse.ApiException;
import com.example.markting_test.Model.Booking_OneTime;
import com.example.markting_test.Repository.Booking_OneTimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Booking_OneTimeService {
    private final Booking_OneTimeRepository bookingOneTimeRepository;

    public List getAll(){
        return bookingOneTimeRepository.findAll();
    }

    public void addBookingOneTime(Booking_OneTime booking_OneTime){
        bookingOneTimeRepository.save(booking_OneTime);
    }

    public void updateBookingOneTime(Integer id , Booking_OneTime booking_OneTime){
        Booking_OneTime b = bookingOneTimeRepository.findBooking_OneTimeById(id);
        if (b == null){
            throw new ApiException("booking OneTime not found");
        }
        b.setBooking_date(booking_OneTime.getBooking_date());
        b.setBooking_status(booking_OneTime.getBooking_status());
        b.setBooking_totalPrice(booking_OneTime.getBooking_totalPrice());
        bookingOneTimeRepository.save(b);
    }

    public void deleteBookingOneTime(Integer id){
        Booking_OneTime b = bookingOneTimeRepository.findBooking_OneTimeById(id);
        if (b == null){
            throw new ApiException("booking OneTime not found");
        }
        bookingOneTimeRepository.delete(b);
    }
}
