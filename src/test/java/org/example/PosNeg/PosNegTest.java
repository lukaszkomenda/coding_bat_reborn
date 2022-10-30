package org.example.PosNeg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosNegTest {

    PosNeg posNeg = new PosNeg();

    @Test
    void oneAndMinusOnePositiveTest() {
        //given
        int a = 1;
        int b = -1;
        boolean negative = false;
        //when
        boolean isPosNeg = posNeg.posNeg(a, b, negative);
        //then
        assertTrue(isPosNeg);
    }

    @Test
    void minusOneAndOnePositiveTest() {
        //given
        int a = -1;
        int b = 1;
        boolean negative = false;
        //when
        boolean isPosNeg = posNeg.posNeg(a, b, negative);
        //then
        assertTrue(isPosNeg);
    }

    @Test
    void minusFourAndMinusFiveNegativeTest() {
        //given
        int a = -4;
        int b = -5;
        boolean negative = true;
        //when
        boolean isPosNeg = posNeg.posNeg(a, b, negative);
        //then
        assertTrue(isPosNeg);
    }

    @Test
    void multiplyNumbersPositiveAndNegativeTest() {
        //given
        int a1 = -4;
        int b1 = -5;
        boolean negative1 = false;

        int a2 = -4;
        int b2 = 5;
        boolean negative2 = false;

        int a3 = -4;
        int b3 = 5;
        boolean negative3 = true;

        int a4 = 1;
        int b4 = 1;
        boolean negative4 = false;

        int a5 = -1;
        int b5 = -1;
        boolean negative5 = false;

        int a6 = 1;
        int b6 = -1;
        boolean negative6 = true;

        int a7 = -1;
        int b7 = 1;
        boolean negative7 = true;

        int a8 = 1;
        int b8 = 1;
        boolean negative8 = true;

        int a9 = -1;
        int b9 = -1;
        boolean negative9 = true;

        int a10 = 5;
        int b10 = -5;
        boolean negative10 = false;

        int a11 = -6;
        int b11 = 6;
        boolean negative11 = false;

        int a12 = -5;
        int b12 = -6;
        boolean negative12 = false;

        int a13 = -2;
        int b13 = -1;
        boolean negative13 = false;

        int a14 = 1;
        int b14 = 2;
        boolean negative14 = false;

        int a15 = -5;
        int b15 = 6;
        boolean negative15 = true;

        int a16 = -5;
        int b16 = -5;
        boolean negative16 = true;
        //when
        //then
        assertFalse(posNeg.posNeg(a1, b1, negative1));
        assertTrue(posNeg.posNeg(a2, b2, negative2));
        assertFalse(posNeg.posNeg(a3, b3, negative3));
        assertFalse(posNeg.posNeg(a4, b4, negative4));
        assertFalse(posNeg.posNeg(a5, b5, negative5));
        assertFalse(posNeg.posNeg(a6, b6, negative6));
        assertFalse(posNeg.posNeg(a7, b7, negative7));
        assertFalse(posNeg.posNeg(a8, b8, negative8));
        assertTrue(posNeg.posNeg(a9, b9, negative9));
        assertTrue(posNeg.posNeg(a10, b10, negative10));
        assertTrue(posNeg.posNeg(a11, b11, negative11));
        assertFalse(posNeg.posNeg(a12, b12, negative12));
        assertFalse(posNeg.posNeg(a13, b13, negative13));
        assertFalse(posNeg.posNeg(a14, b14, negative14));
        assertFalse(posNeg.posNeg(a15, b15, negative15));
        assertTrue(posNeg.posNeg(a16, b16, negative16));
    }
}