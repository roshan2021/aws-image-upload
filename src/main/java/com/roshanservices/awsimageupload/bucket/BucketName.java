package com.roshanservices.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("roshanservices-image-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
