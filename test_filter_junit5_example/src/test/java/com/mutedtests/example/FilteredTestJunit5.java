package com.mutedtests.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Created by Ivan Varivoda 19/05/2020
 */
@ExtendWith(IgnoreMutedTestsCondition.class)
class FilteredTestJunit5 {

    @Test
    void testIsNotMuted() {
        System.out.println("I will be ran. Ura");
    }

    @Test
    void testIsMuted() {
        System.out.println("I won't be ran. =(");

    }

}
