package org.example.WithoutX2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutX2Test {

    WithoutX2 withoutX2 = new WithoutX2();

    @Test
    void xHiTest(){
        //given
        String str = "xHi";
        //when
        String newStr = withoutX2.withoutX2(str);
        //then
        assertEquals("Hi", newStr);
    }

    @Test
    void xxTest(){
        //given
        String str = "xx";
        //when
        String newStr = withoutX2.withoutX2(str);
        //then
        assertEquals("", newStr);
    }

    @Test
    void xaxbTest(){
        //given
        String str = "xaxb";
        //when
        String newStr = withoutX2.withoutX2(str);
        //then
        assertEquals("axb", newStr);
    }

}