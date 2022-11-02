package org.example.HasTeen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HasTeenTest {

    HasTeen hasTeen = new HasTeen();

    @Test
    void thirteenAndTwentyAndTenTest(){
        //given
        int a = 13;
        int b = 20;
        int c = 10;
        //when
        boolean isInRange1319 = hasTeen.hasTeen(a, b, c);
        //then
        assertTrue(isInRange1319);
    }

    @Test
    void oneAndTwentyAndTwelveTest(){
        int a = 1;
        int b = 20;
        int c = 12;
        //when
        boolean isInRange1319 = hasTeen.hasTeen(a, b, c);
        //then
        assertFalse(isInRange1319);
    }

    @Test
    void fourAndTwoAndTwentyTest(){
        int a = 4;
        int b = 2;
        int c = 20;
        //when
        boolean isInRange1319 = hasTeen.hasTeen(a, b, c);
        //then
        assertFalse(isInRange1319);
    }

}