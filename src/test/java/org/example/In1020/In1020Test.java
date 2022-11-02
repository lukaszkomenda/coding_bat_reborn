package org.example.In1020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class In1020Test {

    In1020 in1020 = new In1020();

    @Test
    void twentyOneAndTwelveTest(){
        //given
        int a = 21;
        int b = 12;
        //when
        boolean isInRange1020 = in1020.in1020(a, b);
        //then
        assertTrue(isInRange1020);
    }

    @Test
    void doubleTwentyTest(){
        //given
        int a = 20;
        int b = 20;
        //when
        boolean isInRange1020 = in1020.in1020(a, b);
        //then
        assertTrue(isInRange1020);
    }

    @Test
    void doubleNineTest(){
        //given
        int a = 9;
        int b = 9;
        //when
        boolean isInRange1020 = in1020.in1020(a, b);
        //then
        assertFalse(isInRange1020);
    }

}