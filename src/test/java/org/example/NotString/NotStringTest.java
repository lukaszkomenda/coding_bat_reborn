package org.example.NotString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotStringTest {

    NotString notString = new NotString();

    @Test
    void candyTest(){
        //given
        String str = "candy";
        //when
        String newStr = notString.notString(str);
        //then
        assertEquals("not candy",newStr);
    }

    @Test
    void xTest(){
        //given
        String str = "x";
        //when
        String newStr = notString.notString(str);
        //then
        assertEquals("not x", newStr);
    }

    @Test
    void notTest(){
        //given
        String str = "not";
        //when
        String newStr = notString.notString(str);
        //then
        assertEquals("not", newStr);
    }

}