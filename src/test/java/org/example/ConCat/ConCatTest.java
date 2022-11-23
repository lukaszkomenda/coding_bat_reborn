package org.example.ConCat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConCatTest {

    ConCat conCat = new ConCat();

    @Test
    void abcCatTest(){
        //given
        String a = "abc";
        String b = "cat";
        //when
        String newStr = conCat.conCat(a, b);
        //then
        assertEquals("abcat", newStr);
    }

    @Test
    void abcNoneTest(){
        //given
        String a = "abc";
        String b = "";
        //when
        String newStr = conCat.conCat(a, b);
        //then
        assertEquals("abc", newStr);
    }

    @Test
    void pigGTest(){
        //given
        String a = "pig";
        String b = "g";
        //when
        String newStr = conCat.conCat(a, b);
        //then
        assertEquals("pig", newStr);
    }
}