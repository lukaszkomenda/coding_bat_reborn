package org.example.TheEnd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheEndTest {

    TheEnd theEnd = new TheEnd();

    @Test
    void ohFrontTest(){
        //given
        String str = "oh";
        boolean front = true;
        //when
        String newStr = theEnd.theEnd(str, front);
        //then
        assertEquals("o", newStr);
    }

    @Test
    void helloBackTest(){
        //given
        String str = "Hello";
        boolean front = false;
        //when
        String newStr = theEnd.theEnd(str, front);
        //then
        assertEquals("o", newStr);
    }

    @Test
    void xFrontTest(){
        //given
        String str = "x";
        boolean front = true;
        //when
        String newStr = theEnd.theEnd(str, front);
        //then
        assertEquals("x", newStr);
    }

}