package org.example.EndsLy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndsLyTest {

    EndsLy endsLy = new EndsLy();

    @Test
    void lyTest(){
        //given
        String str = "ly";
        //when
        boolean isLyContains = endsLy.endsLy(str);
        //then
        assertTrue(isLyContains);
    }

    @Test
    void yTest(){
        //given
        String str = "y";
        //when
        boolean isLyContains = endsLy.endsLy(str);
        //then
        assertFalse(isLyContains);
    }

    @Test
    void noneTest(){
        //given
        String str = "";
        //when
        boolean isLyContains = endsLy.endsLy(str);
        //then
        assertFalse(isLyContains);
    }

}