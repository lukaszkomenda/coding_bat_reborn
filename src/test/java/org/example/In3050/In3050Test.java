package org.example.In3050;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class In3050Test {

    In3050 in3050 = new In3050();

    @Test
    void fourtyFiftyTest(){
        //given
        int a = 40;
        int b = 50;
        //when
        boolean isInRange3050 = in3050.in3050(a, b);
        //then
        assertTrue(isInRange3050);
    }

    @Test
    void fourtyThirtynineTest(){
        //given
        int a = 40;
        int b = 39;
        //when
        boolean isInRange3050 = in3050.in3050(a, b);
        //then
        assertTrue(isInRange3050);
    }

    @Test
    void fiftyFiftyoneTest() {
        //given
        int a = 50;
        int b = 51;
        //when
        boolean isInRange3050 = in3050.in3050(a, b);
        //then
        assertFalse(isInRange3050);
    }


}