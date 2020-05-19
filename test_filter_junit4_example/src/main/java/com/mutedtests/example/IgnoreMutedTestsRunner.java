package com.mutedtests.example;

import com.googlecode.junittoolbox.ParallelSuite;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

/**
 * Created by Ivan Varivoda 19/05/2020
 */
public class IgnoreMutedTestsRunner extends ParallelSuite {

    public IgnoreMutedTestsRunner(Class<?> klass, RunnerBuilder builder) throws InitializationError, NoTestsRemainException {
        super(klass, builder);
        filter(new MutedTestsFilter()); // filtering muted tests
    }
}
