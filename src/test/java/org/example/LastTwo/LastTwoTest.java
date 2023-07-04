package org.example.LastTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastTwoTest {

    LastTwo lastTwo = new LastTwo();

    @Test
    void catTest(){
        //given
        String str = "cat";
        //when
        String newStr = lastTwo.lastTwo(str);
        //then
        assertEquals("cta", newStr);
    }

    @Test
    void abTest(){
        //given
        String str = "ab";
        //when
        String newStr = lastTwo.lastTwo(str);
        //then
        assertEquals("ba", newStr);
    }

    @Test
    void noneTest(){
        //given
        String str = "";
        //when
        String newStr = lastTwo.lastTwo(str);
        //then
        assertEquals("", newStr);
    }

}