package org.example.DeFront;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeFrontTest {

    DeFront deFront = new DeFront();

    @Test
    void helloTest(){
        //given
        String str = "Hello";
        //when
        String newStr = deFront.deFront(str);
        //then
        assertEquals("llo", newStr);
    }

    @Test
    void abcTest(){
        //given
        String str = "abc";
        //when
        String newStr = deFront.deFront(str);
        //then
        assertEquals("abc", newStr);
    }

    @Test
    void xbTest(){
        //given
        String str = "xb";
        //when
        String newStr = deFront.deFront(str);
        //then
        assertEquals("b", newStr);
    }

    @Test
    void ayzTest(){
        //given
        String str = "ayz";
        //when
        String newStr = deFront.deFront(str);
        //then
        assertEquals("az", newStr);
    }

}