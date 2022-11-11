package org.example.AltPairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AltPairsTest {

    AltPairs altPairs = new AltPairs();

    @Test
    void kittenTest(){
        //given
        String str = "kitten";
        //when
        String newStr = altPairs.altPairs(str);
        //then
        assertEquals("kien",newStr);
    }

    @Test
    void yakTest(){
        //given
        String str = "yak";
        //when
        String newStr = altPairs.altPairs(str);
        //then
        assertEquals("ya", newStr);
    }

    @Test
    void noneTest(){
        String str = "";
        //when
        String newStr = altPairs.altPairs(str);
        //then
        assertEquals("", newStr);
    }

}