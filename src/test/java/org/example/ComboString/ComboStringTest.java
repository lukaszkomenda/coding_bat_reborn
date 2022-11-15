package org.example.ComboString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComboStringTest {

    ComboString comboString = new ComboString();

    @Test
    void helloHiTest(){
        //given
        String a = "Hello";
        String b = "hi";
        //when
        String newStr = comboString.comboString(a, b);
        //then
        assertEquals("hiHellohi", newStr);
    }

    @Test
    void noneBbTest(){
        //given
        String a = "";
        String b = "bb";
        //when
        String newStr = comboString.comboString(a, b);
        //then
        assertEquals("bb", newStr);
    }

    @Test
    void xyzAbTest(){
        //given
        String a = "xyz";
        String b = "ab";
        //when
        String newStr = comboString.comboString(a, b);
        //then
        assertEquals("abxyzab", newStr);
    }

}