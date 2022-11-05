package org.example.EndUp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndUpTest {

    EndUp endUp = new EndUp();

    @Test
    void hiTest(){
        //given
        String str = "Hi";
        //when
        String newStr = endUp.endUp(str);
        //then
        assertEquals("HI",newStr);
    }

    @Test
    void wooHooTest(){
        //given
        String str = "woo Hoo";
        //when
        String newStr = endUp.endUp(str);
        //then
        assertEquals("woo HOO", newStr);
    }

    @Test
    void xTest(){
        //given
        String str = "x";
        //when
        String newStr = endUp.endUp(str);
        //then
        assertEquals("X", newStr);
    }

}