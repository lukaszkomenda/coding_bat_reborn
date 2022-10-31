package org.example.MissingChar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingCharTest {

    MissingChar missingChar = new MissingChar();

    @Test
    void kittenOncTest() {
        //given
        String str = "kitten";
        int n = 1;
        //when
        String newStr = missingChar.missingChar(str, n);
        //then
        assertEquals("ktten", newStr);
    }

    @Test
    void hiZeroTest() {
        //given
        String str = "Hi";
        int n = 0;
        //when
        String newStr = missingChar.missingChar(str, n);
        //then
        assertEquals("i", newStr);
    }

    @Test
    void codeTwoTest() {
        //given
        String str = "code";
        int m = 2;
        //when
        String newStr = missingChar.missingChar(str, m);
        //then
        assertEquals("coe", newStr);
    }

}