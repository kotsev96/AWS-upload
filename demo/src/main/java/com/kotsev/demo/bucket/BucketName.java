package com.kotsev.demo.bucket;

public enum BucketName {

    PROFILE_IMAGE("dfgvfdv");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
