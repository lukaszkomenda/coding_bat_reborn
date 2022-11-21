package org.example.AtFirst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtFirstTest {

    AtFirst atFirst = new AtFirst();

    @Test
    void helloTest(){
        //given
        String str = "hello";
        //when
        String newStr = atFirst.atFirst(str);
        //then
        assertEquals("he", newStr);
    }

    @Test
    void hTest(){
        //given
        String str = "h";
        //when
        String newStr = atFirst.atFirst(str);
        //then
        assertEquals("h@", newStr);
    }

    @Test
    void noneTest(){
        //given
        String str = "";
        //when
        String newStr = atFirst.atFirst(str);
        //then
        assertEquals("@@", newStr);
    }

}