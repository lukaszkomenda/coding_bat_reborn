package org.example.DelDel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DelDelTest {

    DelDel delDel = new DelDel();

    @Test
    void aTest(){
        //given
        String str = "a";
        //when
        String newStr = delDel.delDel(str);
        //then
        assertEquals("a",newStr);
    }

    @Test
    void noneTest(){
        //given
        String str = "";
        //when
        String newStr = delDel.delDel(str);
        //then
        assertEquals("", newStr);
    }

    @Test
    void delTest(){
        //given
        String str = "del";
        //when
        String newStr = delDel.delDel(str);
        //then
        assertEquals("del", newStr);
    }

}