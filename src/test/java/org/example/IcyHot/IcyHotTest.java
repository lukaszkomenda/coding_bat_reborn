package org.example.IcyHot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IcyHotTest {

    IcyHot icyHot = new IcyHot();

    @Test
    void hundredTwentyAndMinusOneTest(){
        //given
        int temp1 = 120;
        int temp2 = -1;
        //when
        boolean isBelowZeroAndAboveHundred = icyHot.icyHot(temp1, temp2);
        //then
        assertTrue(isBelowZeroAndAboveHundred);
    }

    @Test
    void twoAndHundredTwentyTest(){
        //given
        int temp1 = 2;
        int temp2 = 120;
        //when
        boolean isBelowZeroAndAboveHundred = icyHot.icyHot(temp1, temp2);
        //then
        assertFalse(isBelowZeroAndAboveHundred);
    }

    @Test
    void minusTwoAndMinusTwoTest(){
        int temp1 = -2;
        int temp2 = -2;
        //when
        boolean isBelowZeroAndAboveHundred = icyHot.icyHot(temp1, temp2);
        //then
        assertFalse(isBelowZeroAndAboveHundred);
    }

}