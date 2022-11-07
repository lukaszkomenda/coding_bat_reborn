package org.example.StringSplosion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringSplosionTest {

    StringSplosion stringSplosion = new StringSplosion();

    @Test
    void abTest(){
        //given
        String str = "ab";
        //when
        String newStr = stringSplosion.stringSplosion(str);
        //then
        assertEquals("aab", newStr);
    }

    @Test
    void fadeTest(){
        //given
        String str = "fade";
        //when
        String newStr = stringSplosion.stringSplosion(str);
        //then
        assertEquals("ffafadfade", newStr);
    }

    @Test
    void byeTest(){
        //given
        String str = "Bye";
        //when
        String newStr = stringSplosion.stringSplosion(str);
        //then
        assertEquals("BByBye", newStr);
    }

}