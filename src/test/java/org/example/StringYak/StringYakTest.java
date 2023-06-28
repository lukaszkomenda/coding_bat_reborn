package org.example.StringYak;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringYakTest {

    StringYak stringYak = new StringYak();

    @Test
    void yakpakTest(){
        //given
        String str = "yakpak";
        //when
        String newStr = stringYak.stringYak(str);
        //then
        assertEquals("pak", newStr);
    }

    @Test
    void yakTest(){
        //given
        String str = "yak";
        //when
        String newStr = stringYak.stringYak(str);
        //then
        assertEquals("", newStr);
    }

    @Test
    void hiyakhiTest(){
        //given
        String str = "HiyakHi";
        //when
        String newStr = stringYak.stringYak(str);
        //then
        assertEquals("HiHi", newStr);
    }

}