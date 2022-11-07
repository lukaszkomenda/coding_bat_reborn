package org.example.Last2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Last2Test {

    Last2 last2 = new Last2();

    @Test
    void xxxxTest(){
        //given
        String str = "xxxx";
        //when
        int count = last2.last2(str);
        //then
        assertEquals(2, count);
    }

    @Test
    void hTest(){
        //given
        String str = "h";
        //when
        int count = last2.last2(str);
        //then
        assertEquals(0, count);
    }

    @Test
    void hixxhiTest(){
        //given
        String str = "hixxhi";
        //when
        int count = last2.last2(str);
        //then
        assertEquals(1, count);
    }

}