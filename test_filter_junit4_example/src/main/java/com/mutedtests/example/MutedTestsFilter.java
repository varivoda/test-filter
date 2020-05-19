package com.mutedtests.example;

import org.junit.runner.Description;
import org.junit.runner.manipulation.Filter;

/**
 * Created by Ivan Varivoda 19/05/2020
 */
public class MutedTestsFilter extends Filter {

    private TMSClient tmsClient = new TMSClient();

    public boolean shouldRun(Description description) {
        if (description.isSuite()) {
            return true;
        }

        return !tmsClient.isTestMuted(description.getDisplayName());

    }

    public String describe() {
        return null;
    }
}
