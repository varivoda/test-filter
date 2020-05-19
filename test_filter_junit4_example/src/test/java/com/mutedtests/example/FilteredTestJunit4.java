package com.mutedtests.example;

import com.googlecode.junittoolbox.ParallelRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Ivan Varivoda 19/05/2020
 */
@RunWith(ParallelRunner.class)
public class FilteredTestJunit4 {

    @Test
    public void testIsNotMuted() {
        System.out.println("I will be ran. Ura");
    }

    @Test
    public void testIsMuted() {
        System.out.println("I won't be ran. =(");

    }

}
