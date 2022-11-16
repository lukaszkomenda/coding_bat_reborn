package org.example.NonStart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonStartTest {

    NonStart nonStart = new NonStart();

    @Test
    void javaCodeTest(){
        //given
        String a = "java";
        String b = "code";
        //when
        String newStr = nonStart.nonStart(a, b);
        //then
        assertEquals("avaode", newStr);
    }

    @Test
    void abXyTest(){
        //given
        String a = "ab";
        String b = "xy";
        //when
        String newStr = nonStart.nonStart(a, b);
        //then
        assertEquals("by", newStr);
    }

    @Test
    void axTest(){
        //given
        String a = "a";
        String b = "x";
        //when
        String newStr = nonStart.nonStart(a, b);
        //then
        assertEquals("", newStr);
    }

}