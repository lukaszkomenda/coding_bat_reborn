package org.example.FrontBack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrontBackTest {

    FrontBack frontBack = new FrontBack();

    @Test
    void aTest(){
        //given
        String str = "a";
        //when
        String newStr = frontBack.frontBack(str);
        //then
        assertEquals("a", newStr);
    }

    @Test
    void helloTest(){
        //given
        String str = "hello";
        //when
        String newStr = frontBack.frontBack(str);
        //then
        assertEquals("oellh", newStr);
    }

    @Test
    void abcTest(){
        //given
        String str = "abc";
        //when
        String newStr = frontBack.frontBack(str);
        //then
        assertEquals("cba", newStr);
    }

}