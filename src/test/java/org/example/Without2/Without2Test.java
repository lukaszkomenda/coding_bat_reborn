package org.example.Without2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Without2Test {

    Without2 without2 = new Without2();

    @Test
    void helloHeTest(){
        //given
        String str = "HelloHe";
        //when
        String newStr = without2.without2(str);
        //then
        assertEquals("lloHe", newStr);
    }

    @Test
    void xxxTest(){
        //given
        String str = "xxx";
        //when
        String newStr = without2.without2(str);
        //then
        assertEquals("x", newStr);
    }

    @Test
    void noneTest(){
        //given
        String str = "";
        //when
        String newStr = without2.without2(str);
        //then
        assertEquals("", newStr);
    }

}