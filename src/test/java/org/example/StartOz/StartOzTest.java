package org.example.StartOz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StartOzTest {

    StartOz startOz = new StartOz();

    @Test
    void ozymandiasTest(){
        //given
        String str = "ozymandias";
        //when
        String newStr = startOz.startOz(str);
        //then
        assertEquals("oz", newStr);
    }

    @Test
    void oxxTest(){
        //given
        String str = "oxx";
        //when
        String newStr = startOz.startOz(str);
        //then
        assertEquals("o", newStr);
    }

    @Test
    void abcTest(){
        //given
        String str = "abc";
        //when
        String newStr = startOz.startOz(str);
        //then
        assertEquals("",newStr);
    }

}