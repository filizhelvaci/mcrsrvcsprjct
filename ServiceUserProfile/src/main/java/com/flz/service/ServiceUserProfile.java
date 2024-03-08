package com.flz.service;

import com.flz.dto.request.UserProfileSaveRequestDto;
import com.flz.mapper.IUserProfileMapper;
import com.flz.model.UserProfile;
import com.flz.repository.IRepositoryUserProfile;
import com.flz.utils.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceUserProfile extends ServiceManager<UserProfile,Long> {

    // *************  @AutoWired *************** //
    private final IRepositoryUserProfile repository;

    public ServiceUserProfile(IRepositoryUserProfile repository) {
        super(repository);
        this.repository = repository;
    }

    public Boolean save(UserProfileSaveRequestDto dto){

        /*
        UserProfile userProfile=new UserProfile();
        userProfile.setAuthId(dto.getAuthId());
        userProfile.setUsername(dto.getUsername());
        userProfile.setEmail(dto.getEmail());
        save(userProfile); */
        /*
        UserProfile userProfile=UserProfile.builder()
                .authId(dto.getAuthId())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .build();
        save(userProfile); */

        /*
        save(UserProfile.builder()
                .authId(dto.getAuthId())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .build()); */
        save(IUserProfileMapper.INSTANCE.toUserProfile(dto));
        return true;
    }




}
