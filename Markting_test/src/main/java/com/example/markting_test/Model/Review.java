package com.example.markting_test.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String review_description;

    @Column(nullable = false)
    private Integer review_rating;

//     Relationships
    @ManyToOne
//    @JoinColumn(name = "Company_company_id", nullable = false)
    @JsonIgnore
    private Company company;

    @ManyToOne
//    @JoinColumn(name = "Booking_booking_id", nullable = false)
    @JsonIgnore
    private Booking_OneTime bookingOneTime;
}
