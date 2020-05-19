package com.mutedtests.example;

import com.googlecode.junittoolbox.SuiteClasses;
import org.junit.runner.RunWith;

/**
 * Created by Ivan Varivoda 19/05/2020
 */
@RunWith(IgnoreMutedTestsRunner.class)
@SuiteClasses("**/*Test.class")
public class RunNotMutedTests {
}
