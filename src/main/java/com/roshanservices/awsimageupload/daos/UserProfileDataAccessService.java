package com.roshanservices.awsimageupload.daos;


import com.roshanservices.awsimageupload.models.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessService {

    private final FakeUserProfileDaos fakeUserProfileDaos;

    @Autowired
    public UserProfileDataAccessService(FakeUserProfileDaos fakeUserProfileDaos) {
        this.fakeUserProfileDaos = fakeUserProfileDaos;
    }

    List<UserProfile> getUserProfiles() {
        return fakeUserProfileDaos.getUserProfile();
    }
}
