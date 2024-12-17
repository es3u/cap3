package com.example.markting_test.Service;
import com.example.markting_test.ApiResponse.ApiException;
import com.example.markting_test.Model.Influencer;
import com.example.markting_test.Model.Platform;
import com.example.markting_test.Repository.InfluencerRepository;
import com.example.markting_test.Repository.PlatformRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlatformService {
    private final PlatformRepository platformRepository;
    private final InfluencerRepository influencerRepository;

    public List<Platform> getAllPlatform(){
        return platformRepository.findAll();
    }

    public void addPlatform(Integer id ,Platform platform){
        Influencer influencer = influencerRepository.findInfluencerById(id);
        if (influencer == null){
            throw new ApiException("influencer not found");
        }
        platform.setInfluencer(influencer);
        influencerRepository.save(influencer);
        platformRepository.save(platform);
    }

    public void updatePlatform(Integer id ,Platform platform){
        Platform platform1 = platformRepository.findPlatformById(id);
        if(platform1 == null){
            throw new ApiException("platform not found");
        }
        platform1.setPlatform_name(platform.getPlatform_name());
        platform1.setPlatform_followers(platform.getPlatform_followers());
        platformRepository.save(platform1);
    }

    public void deletePlatform(Integer id){
        Platform platform = platformRepository.findPlatformById(id);
        if(platform == null){
            throw new ApiException("platform not found");
        }
        platformRepository.delete(platform);
    }
}
