package org.example.LastChars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastCharsTest {

    LastChars lastChars = new LastChars();

    @Test
    void lastCharsTest(){
        //given
        String a = "last";
        String b = "chars";
        //when
        String newStr = lastChars.lastChars(a, b);
        //then
        assertEquals("ls", newStr);
    }

    @Test
    void hiNoneTest(){
        //given
        String a = "hi";
        String b = "";
        //when
        String newStr = lastChars.lastChars(a, b);
        //then
        assertEquals("h@", newStr);
    }

    @Test
    void noneNoneTest(){
        //given
        String a = "";
        String b = "";
        //when
        String newStr = lastChars.lastChars(a, b);
        //then
        assertEquals("@@", newStr);
    }

}