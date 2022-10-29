package org.example.Diff21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Diff21Test {

    Diff21 diff21 = new Diff21();

    @Test
    void nineteenTest(){
        //given
        int n = 19;
        //when
        int difference = diff21.diff21(n);
        //then
        assertEquals(2,difference);
    }

    @Test
    void tenTest(){
        //given
        int n = 10;
        //when
        int difference = diff21.diff21(n);
        //then
        assertEquals(11,difference);
    }

    @Test
    void twentyOneTest(){
        //given
        int n = 21;
        //when
        int difference = diff21.diff21(n);
        //then
        assertEquals(0,difference);
    }

    @Test
    void twentyTwoTest(){
        //given
        int n = 22;
        //when
        int difference = diff21.diff21(n);
        //then
        assertEquals(2,difference);
    }

    @Test
    void twentyFiveTest(){
        //given
        int n = 25;
        //when
        int difference = diff21.diff21(n);
        //then
        assertEquals(8,difference);
    }

    @Test
    void thirtyTest(){
        //given
        int n = 30;
        //when
        int difference = diff21.diff21(n);
        //then
        assertEquals(18,difference);
    }

    @Test
    void zeroTest(){
        //given
        int n = 0;
        //when
        int difference = diff21.diff21(n);
        //then
        assertEquals(21,difference);
    }

    @Test
    void oneTest(){
        //given
        int n = 1;
        //when
        int difference = diff21.diff21(n);
        //then
        assertEquals(20,difference);
    }

    @Test
    void twoTest(){
        //given
        int n = 2;
        //when
        int difference = diff21.diff21(n);
        //then
        assertEquals(19,difference);
    }

    @Test
    void minusOneTest(){
        //given
        int n = -1;
        //when
        int difference = diff21.diff21(n);
        //then
        assertEquals(22,difference);
    }

    @Test
    void minusTwoTest(){
        //given
        int n = -2;
        //when
        int difference = diff21.diff21(n);
        //then
        assertEquals(23,difference);
    }

    @Test
    void fiftyTest(){
        //given
        int n = 50;
        //when
        int difference = diff21.diff21(n);
        //then
        assertEquals(58,difference);
    }

}