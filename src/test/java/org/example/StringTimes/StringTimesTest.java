package org.example.StringTimes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTimesTest {

    StringTimes stringTimes = new StringTimes();

    @Test
    void hiTest(){
        //given
        String str = "Hi";
        int n = 2;
        //when
        String newStr = stringTimes.stringTimes(str, n);
        //then
        assertEquals("HiHi", newStr);
    }

    @Test
    void noneTest(){
        //given
        String str = "";
        int n = 4;
        //when
        String newStr = stringTimes.stringTimes(str, n);
        //then
        assertEquals("", newStr);
    }

    @Test
    void ohBoyTest(){
        //given
        String str = "Oh Boy!";
        int n = 2;
        //when
        String newStr = stringTimes.stringTimes(str, n);
        //then
        assertEquals("Oh Boy!Oh Boy!", newStr);
    }

}