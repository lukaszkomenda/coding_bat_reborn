package org.example.IntMax;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntMaxTest {

    IntMax intMax = new IntMax();

    @Test
    void oneTwoThreeTest(){
        //given
        int a = 1;
        int b = 2;
        int c = 3;
        //when
        int max = intMax.intMax(a, b, c);
        //then
        assertEquals(3,max);
    }

    @Test
    void minusThreeMinusOneMinusTwoTest(){
        //given
        int a = -3;
        int b = -1;
        int c = -2;
        //when
        int max = intMax.intMax(a, b, c);
        //then
        assertEquals(-1,max);
    }

    @Test
    void sixTwoFiveTest(){
        //given
        int a = 6;
        int b = 2;
        int c = 5;
        //when
        int max = intMax.intMax(a, b, c);
        //then
        assertEquals(6,max);
    }

}