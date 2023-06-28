package org.example.StringBits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringBitsTest {

    StringBits stringBits = new StringBits();

    @Test
    void hiTest(){
        //given
        String str = "Hi";
        //when
        String newStr = stringBits.stringBits(str);
        //then
        assertEquals("H", newStr);
    }

    @Test
    void greetingsTest(){
        //given
        String str = "Greetings";
        //when
        String newStr = stringBits.stringBits(str);
        //then
        assertEquals("Getns", newStr);
    }

    @Test
    void noneTest(){
        //given
        String str = "";
        //when
        String newStr = stringBits.stringBits(str);
        //then
        assertEquals("", newStr);
    }
}