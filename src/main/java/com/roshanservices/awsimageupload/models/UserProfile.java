package com.roshanservices.awsimageupload.models;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class UserProfile {

    private UUID userProfileId;
    private String username;
    private String userProfileImageLink;  // S3 key

    public UserProfile(UUID userProfileId, String username, String userProfileImageLink) {
        this.userProfileId = userProfileId;
        this.username = username;
        this.userProfileImageLink = userProfileImageLink;
    }

    public UUID getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(UUID userProfileId) {
        this.userProfileId = userProfileId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Optional<String> getUserProfileImageLink() {
        return Optional.ofNullable(userProfileImageLink);
    }

    public void setUserProfileImageLink(String userProfileImageLink) {
        this.userProfileImageLink = userProfileImageLink;
    }


    //@param a an object
    //@param b an object to be compared with {@code a} for equality
    //@return {@code true} if the arguments are equal to each other
    //and {@code false} otherwise
    //@see Object#equals(Object)

    //public static boolean equals(Object a, Object b) {
    // return (a == b) || (a != null && a.equals(b));
    // }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return Objects.equals(userProfileId, that.userProfileId) &&
                Objects.equals(username, that.username) &&
                Objects.equals(userProfileImageLink, that.userProfileImageLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userProfileId, username, userProfileImageLink);
    }
}
