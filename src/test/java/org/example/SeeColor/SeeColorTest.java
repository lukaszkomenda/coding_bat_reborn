package org.example.SeeColor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeeColorTest {

    SeeColor seeColor = new SeeColor();

    @Test
    void redXxTest(){
        //given
        String str = "redxx";
        //when
        String newStr = seeColor.seeColor(str);
        //then
        assertEquals("red", newStr);
    }

    @Test
    void noColorTest(){
        //given
        String str = "NoColor";
        //when
        String newStr = seeColor.seeColor(str);
        //then
        assertEquals("", newStr);
    }

    @Test
    void aTest(){
        //given
        String str = "a";
        //when
        String newStr = seeColor.seeColor(str);
        //then
        assertEquals("", newStr);
    }

}