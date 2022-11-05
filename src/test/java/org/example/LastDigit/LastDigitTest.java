package org.example.LastDigit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastDigitTest {

    LastDigit lastDigit = new LastDigit();

    @Test
    void sixSeventeenTest(){
        //given
        int a = 6;
        int b = 17;
        //when
        boolean isLastDigitSame = lastDigit.lastDigit(a, b);
        //then
        assertFalse(isLastDigitSame);
    }

    @Test
    void threeHundredThirteenTest(){
        //given
        int a = 3;
        int b = 113;
        //when
        boolean isLastDigitSame = lastDigit.lastDigit(a, b);
        //then
        assertTrue(isLastDigitSame);
    }

    @Test
    void tenZeroTest(){
        int a = 10;
        int b = 0;
        //when
        boolean isLastDigitSame = lastDigit.lastDigit(a, b);
        //then
        assertTrue(isLastDigitSame);
    }

}