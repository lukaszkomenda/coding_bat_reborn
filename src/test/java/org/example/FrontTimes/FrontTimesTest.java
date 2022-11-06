package org.example.FrontTimes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrontTimesTest {

    FrontTimes frontTimes = new FrontTimes();

    @Test
    void abcTest(){
        //given
        String str = "Abc";
        int n = 3;
        //when
        String newStr = frontTimes.frontTimes(str, n);
        //then
        assertEquals("AbcAbcAbc", newStr);
    }

    @Test
    void aTest(){
        //given
        String str = "A";
        int n = 4;
        //when
        String newStr = frontTimes.frontTimes(str, n);
        //then
        assertEquals("AAAA", newStr);
    }

    @Test
    void noneTest(){
        //given
        String str = "";
        int n = 4;
        //when
        String newStr = frontTimes.frontTimes(str, n);
        //then
        assertEquals("", newStr);
    }

}