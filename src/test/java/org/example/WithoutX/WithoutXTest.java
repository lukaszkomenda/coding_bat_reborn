package org.example.WithoutX;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutXTest {

    WithoutX withoutX = new WithoutX();

    @Test
    void xHiTest(){
        //given
        String str = "xHi";
        //when
        String newStr = withoutX.withoutX(str);
        //then
        assertEquals("Hi", newStr);
    }

    @Test
    void xxTest(){
        //given
        String str = "xx";
        //when
        String newStr = withoutX.withoutX(str);
        //then
        assertEquals("", newStr);
    }

    @Test
    void hixTest(){
        //given
        String str = "Hix";
        //when
        String newStr = withoutX.withoutX(str);
        //then
        assertEquals("Hi", newStr);
    }

}