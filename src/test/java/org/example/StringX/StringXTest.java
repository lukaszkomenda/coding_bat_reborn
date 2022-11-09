package org.example.StringX;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringXTest {

    StringX stringX = new StringX();

    @Test
    void abxxxcdTest(){
        //given
        String str = "abxxxcd";
        //when
        String newStr = stringX.stringX(str);
        //then
        assertEquals("abcd", newStr);
    }

    @Test
    void helloTest(){
        //given
        String str = "Hello";
        //when
        String newStr = stringX.stringX(str);
        //then
        assertEquals("Hello", newStr);
    }

    @Test
    void noneTest(){
        //given
        String str = "";
        //when
        String newStr = stringX.stringX(str);
        //then
        assertEquals("", newStr);
    }

}