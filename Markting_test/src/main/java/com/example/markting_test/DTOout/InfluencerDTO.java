package com.example.markting_test.DTOout;

import com.example.markting_test.Model.Influencer;
import com.example.markting_test.Model.Platform;
import com.example.markting_test.Model.Type;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
public class InfluencerDTO {

    private String Influencer_name;

    private String Influencer_phone;

    private String Influencer_email;

    private List<Platform> platforms;
}
