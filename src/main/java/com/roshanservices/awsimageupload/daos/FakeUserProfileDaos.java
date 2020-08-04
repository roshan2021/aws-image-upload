package com.roshanservices.awsimageupload.daos;


import com.roshanservices.awsimageupload.models.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDaos {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfile() {
        return USER_PROFILES;
    }
}
