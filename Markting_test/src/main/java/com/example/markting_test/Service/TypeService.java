package com.example.markting_test.Service;

import com.example.markting_test.ApiResponse.ApiException;
import com.example.markting_test.Model.Platform;
import com.example.markting_test.Model.Type;
import com.example.markting_test.Repository.PlatformRepository;
import com.example.markting_test.Repository.TypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TypeService {
    private final TypeRepository typeRepository;
    private final PlatformRepository platformRepository;

    public List<Type> getAllTypes() {
        return typeRepository.findAll();
    }

    public void addType(Integer id ,Type type) {
        Platform platform = platformRepository.findPlatformById(id);
        if(platform==null) {
            throw new ApiException("platform not found");
        }
        type.setPlatform(platform);
        platformRepository.save(platform);
        typeRepository.save(type);
    }

    public void updateType(Integer id ,Type type) {
        Type type1 = typeRepository.findTypeById(id);
        if(type1 == null) {
            throw new ApiException("Type not found");
        }
        type1.getType_name();
        type1.setType_price(type.getType_price());
        typeRepository.save(type1);
    }
    public void deleteType(Integer id) {
        Type type1 = typeRepository.findTypeById(id);
        if(type1 == null) {
            throw new ApiException("Type not found");
        }
        typeRepository.delete(type1);
    }

}
