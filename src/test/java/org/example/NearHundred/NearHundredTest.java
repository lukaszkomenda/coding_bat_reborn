package org.example.NearHundred;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NearHundredTest {

    NearHundred nearHundred = new NearHundred();

    @Test
    void ninthyThreeTest(){
        //given
        int a = 93;
        //when
        boolean near100 = nearHundred.nearHundred(a);
        //then
        assertTrue(near100);
    }

    @Test
    void ninthyTest(){
        //given
        int a = 90;
        //when
        boolean near100 = nearHundred.nearHundred(a);
        //then
        assertTrue(near100);
    }

    @Test
    void eightyNineTest(){
        //given
        int a = 89;
        //when
        boolean near100 = nearHundred.nearHundred(a);
        //then
        assertFalse(near100);
    }

    @Test
    void hundredAndTenTest(){
        //given
        int a = 110;
        //when
        boolean near100 = nearHundred.nearHundred(a);
        //then
        assertTrue(near100);
    }

    @Test
    void hundredElevenTest(){
        //given
        int a = 111;
        //when
        boolean near100 = nearHundred.nearHundred(a);
        //then
        assertFalse(near100);
    }

    @Test
    void hundredTwentyOneTest(){
        //given
        int a = 121;
        //when
        boolean near100 = nearHundred.nearHundred(a);
        //then
        assertFalse(near100);
    }

    @Test
    void minusHundredAndOneTest(){
        //given
        int a = -101;
        //when
        boolean near100 = nearHundred.nearHundred(a);
        //then
        assertFalse(near100);
    }

    @Test
    void minusTwoHundredAndNineTest(){
        //given
        int a = -209;
        //when
        boolean near100 = nearHundred.nearHundred(a);
        //then
        assertFalse(near100);
    }

    @Test
    void oneHundredNinethyTest(){
        //given
        int a = 190;
        //when
        boolean near100 = nearHundred.nearHundred(a);
        //then
        assertTrue(near100);
    }

    @Test
    void twoHundredAndNineTest(){
        //given
        int a = 209;
        //when
        boolean near100 = nearHundred.nearHundred(a);
        //then
        assertTrue(near100);
    }

    @Test
    void zeroTest(){
        //given
        int a = 0;
        //when
        boolean near100 = nearHundred.nearHundred(a);
        //then
        assertFalse(near100);
    }

    @Test
    void fiveTest(){
        //given
        int a = 5;
        //when
        boolean near100 = nearHundred.nearHundred(a);
        //then
        assertFalse(near100);
    }

    @Test
    void minusFiftyTest(){
        //given
        int a = -50;
        //when
        boolean near100 = nearHundred.nearHundred(a);
        //then
        assertFalse(near100);
    }

    @Test
    void hundredNinethyOne(){
        //given
        int a = 191;
        //when
        boolean near100 = nearHundred.nearHundred(a);
        //then
        assertTrue(near100);
    }

    @Test
    void hundredEightyNineTest(){
        //given
        int a = 189;
        //when
        boolean near100 = nearHundred.nearHundred(a);
        //then
        assertFalse(near100);
    }

    @Test
    void multiplyNumberTest(){
        //given
        int a = 200;
        int b = 210;
        int c = 211;
        int d = 290;
        //when
        //then
        assertTrue(nearHundred.nearHundred(a));
        assertTrue(nearHundred.nearHundred(b));
        assertFalse(nearHundred.nearHundred(c));
        assertFalse(nearHundred.nearHundred(d));
    }

}