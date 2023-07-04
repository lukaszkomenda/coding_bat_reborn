package org.example.ExtraEnd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtraEndTest {

    ExtraEnd extraEnd = new ExtraEnd();

    @Test
    void helloTest(){
        //given
        String str = "Hello";
        //when
        String newStr = extraEnd.extraEnd(str);
        //then
        assertEquals("lololo", newStr);
    }

    @Test
    void hiTest(){
        //given
        String str = "Hi";
        //when
        String newStr = extraEnd.extraEnd(str);
        //then
        assertEquals("HiHiHi", newStr);
    }

    @Test
    void codeTest(){
        //given
        String str = "Code";
        //when
        String newStr = extraEnd.extraEnd(str);
        //then
        assertEquals("dedede", newStr);
    }

}