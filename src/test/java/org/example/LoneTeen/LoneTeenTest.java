package org.example.LoneTeen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoneTeenTest {

    LoneTeen loneTeen = new LoneTeen();

    @Test
    void thirteenAndNinetynineTest(){
        //given
        int a = 13;
        int b = 99;
        //when
        boolean isInRange1319 = loneTeen.loneTeen(a, b);
        //then
        assertTrue(isInRange1319);
    }

    @Test
    void doubleThirteenTest(){
        //given
        int a = 13;
        int b = 13;
        //when
        boolean isInRange1319 = loneTeen.loneTeen(a, b);
        //then
        assertFalse(isInRange1319);
    }

    @Test
    void sixteenAndNineTest(){
        //given
        int a = 16;
        int b = 9;
        //when
        boolean isInRange1319 = loneTeen.loneTeen(a, b);
        //then
        assertTrue(isInRange1319);
    }

}