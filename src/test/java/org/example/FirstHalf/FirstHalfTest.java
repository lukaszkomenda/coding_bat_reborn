package org.example.FirstHalf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstHalfTest {

    FirstHalf firstHalf = new FirstHalf();

    @Test
    void wooTest(){
        //given
        String str = "WooHoo";
        //when
        String newStr = firstHalf.firstHalf(str);
        //then
        assertEquals("Woo", newStr);
    }

    @Test
    void helloTest(){
        //given
        String str = "HelloThere";
        //when
        String newStr = firstHalf.firstHalf(str);
        //then
        assertEquals("Hello", newStr);
    }

    @Test
    void noneTest(){
        //given
        String str = "";
        //when
        String newStr = firstHalf.firstHalf(str);
        //then
        assertEquals("", newStr);
    }

}