package org.example.Front3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Front3Test {

    Front3 front3 = new Front3();

    @Test
    void abcTest(){
        //given
        String str = "abc";
        //when
        String newStr = front3.front3(str);
        //then
        assertEquals("abcabcabc", newStr);
    }

    @Test
    void aTest(){
        //given
        String str = "a";
        //when
        String newStr = front3.front3(str);
        //then
        assertEquals("aaa",newStr);
    }

    @Test
    void noCharTest(){
        //given
        String str = "";
        //when
        String newStr = front3.front3(str);
        //then
        assertEquals("", newStr);
    }

}