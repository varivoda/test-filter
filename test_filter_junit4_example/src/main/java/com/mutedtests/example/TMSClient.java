package com.mutedtests.example;

/**
 * Created by Ivan Varivoda 19/05/2020
 */
public class TMSClient {

    public boolean isTestMuted(String testName) {
        return testName.contains("IsMuted");
    }
}
