package com.example.markting_test.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;



@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Package {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer package_id;

    @Min(value = 1, message = "Package times must be at least 1")
    @Column(nullable = false)
    private Integer package_times;

    @Min(value = 0, message = "Package price must be greater than or equal to 0")
    @Column(nullable = false)
    private Double package_price;

    @NotBlank(message = "Platform name cannot be blank")
    @Size(min = 3, max = 50, message = "Platform name must be between 3 and 50 characters")
    @Column(nullable = false)
    private String platform_name;

    @Column(nullable = false)
    private Boolean isAvailable = false;

    @ManyToOne
    @JoinColumn(name = "Influencer_Influencer_id", nullable = false)
    private Influencer influencer;
}