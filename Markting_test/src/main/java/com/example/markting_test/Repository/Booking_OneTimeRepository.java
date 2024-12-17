package com.example.markting_test.Repository;

import com.example.markting_test.Model.Booking_OneTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Booking_OneTimeRepository extends JpaRepository<Booking_OneTime , Integer> {

    Booking_OneTime findBooking_OneTimeById(Integer booking_id);
}
