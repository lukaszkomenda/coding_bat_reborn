package org.example.BackAround;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackAroundTest {

    BackAround backAround = new BackAround();

    @Test
    void catTest(){
        //given
        String str = "cat";
        //when
        String newStr = backAround.backAround(str);
        //then
        assertEquals("tcatt", newStr);
    }

    @Test
    void aTest(){
        //given
        String str = "a";
        //when
        String newStr = backAround.backAround(str);
        //then
        assertEquals("aaa", newStr);
    }

    @Test
    void readTest(){
        //given
        String str = "read";
        //when
        String newStr = backAround.backAround(str);
        //then
        assertEquals("dreadd", newStr);
    }

}