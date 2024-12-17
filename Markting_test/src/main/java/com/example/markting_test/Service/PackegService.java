package com.example.markting_test.Service;

import com.example.markting_test.Model.Influencer;
import com.example.markting_test.Model.Package;
import com.example.markting_test.Repository.InfluencerRepository;
import com.example.markting_test.Repository.PackegeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PackegService {

    private final  PackegeRepo packegeRepo;
    private final InfluencerRepository influencerRepo;

    public void dd(Package pack){
        Influencer influencer = influencerRepo.findInfluencerById(pack.getId());
    }
}
