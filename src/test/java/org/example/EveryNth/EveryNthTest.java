package org.example.EveryNth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EveryNthTest {

    EveryNth everyNth = new EveryNth();

    @Test
    void chocolateTest(){
        //given
        String str = "Chocolate";
        int n = 3;
        //when
        String newStr = everyNth.everyNth(str, n);
        //then
        assertEquals("Cca", newStr);
    }

    @Test
    void miracleTest(){
        //given
        String str = "Miracle";
        int n = 2;
        //when
        String newStr = everyNth.everyNth(str, n);
        //then
        assertEquals("Mrce", newStr);
    }

    @Test
    void abcdefgTest(){
        //given
        String str = "abcdefg";
        int n = 2;
        //when
        String newStr = everyNth.everyNth(str, n);
        //then
        assertEquals("aceg", newStr);
    }

}