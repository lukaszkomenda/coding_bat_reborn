package org.example.SumDouble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumDoubleTest {

    SumDouble sumDouble = new SumDouble();

    @Test
    void oneTwoTest() {
        //given
        int a = 1;
        int b = 2;
        //when
        //then
        assertEquals(3, sumDouble.sumDouble(a, b));
    }

    @Test
    void threeTwoTest() {
        //given
        int a = 3;
        int b = 2;
        //when
        //then
        assertEquals(5, sumDouble.sumDouble(a, b));
    }

    @Test
    void doubleTwoTest() {
        //given
        int a = 2;
        int b = 2;
        //when
        //then
        assertEquals(8, sumDouble.sumDouble(a, b));
    }

    @Test
    void minusOneZeroTest() {
        //given
        int a = -1;
        int b = 0;
        //when
        //then
        assertEquals(-1, sumDouble.sumDouble(a, b));
    }

    @Test
    void doubleThreeTest() {
        //given
        int a = 3;
        int b = 3;
        //when
        //then
        assertEquals(12, sumDouble.sumDouble(a, b));
    }

    @Test
    void doubleZeroTest() {
        //given
        int a = 0;
        int b = 0;
        //when
        int sum = sumDouble.sumDouble(a, b);
        //then
        assertEquals(0, sum);
    }

    @Test
    void zeroOneTest() {
        //given
        int a = 0;
        int b = 1;
        //when
        int sum = sumDouble.sumDouble(a, b);
        //then
        assertEquals(1, sum);
    }

    @Test
    void threeFourTest() {
        //given
        int a = 3;
        int b = 4;
        //when
        int sum = sumDouble.sumDouble(a, b);
        //then
        assertEquals(7, sum);
    }

}