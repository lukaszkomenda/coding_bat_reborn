package org.example.MiddleTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleTwoTest {

    MiddleTwo middleTwo = new MiddleTwo();

    @Test
    void stringTest(){
        //given
        String str = "string";
        //when
        String newStr = middleTwo.middleTwo(str);
        //then
        assertEquals("ri", newStr);
    }

    @Test
    void codeTest(){
        //given
        String str = "code";
        //when
        String newStr = middleTwo.middleTwo(str);
        //then
        assertEquals("od", newStr);
    }

    @Test
    void abTest(){
        //given
        String str = "ab";
        //when
        String newStr = middleTwo.middleTwo(str);
        //then
        assertEquals("ab", newStr);
    }

}