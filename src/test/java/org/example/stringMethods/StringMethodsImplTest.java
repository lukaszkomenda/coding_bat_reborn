package org.example.stringMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMethodsImplTest {

    StringMethods stringMethods = new StringMethodsImpl();

    @Test
    void doubleCharTheTest() {
        //given
        String str = "The";
        //when
        String newStr = stringMethods.doubleChar(str);
        //then
        assertEquals("TThhee", newStr);
    }

    @Test
    void doubleCharNoneTest(){
        //given
        String str = "";
        //when
        String newStr = stringMethods.doubleChar(str);
        //then
        assertEquals("", newStr);
    }

    @Test
    void countHiHiHiTest() {
        //given
        String str = "hihi";
        //when
        int counter = stringMethods.countHi(str);
        //then
        assertEquals(2, counter);
    }

    @Test
    void countHiNoneTest(){
        //given
        String str = "";
        //when
        int counter = stringMethods.countHi(str);
        //then
        assertEquals(0, counter);
    }
}