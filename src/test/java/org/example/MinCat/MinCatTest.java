package org.example.MinCat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCatTest {

    MinCat minCat = new MinCat();

    @Test
    void helloHiTest(){
        //given
        String a = "Hello";
        String b = "Hi";
        //when
        String newStr = minCat.minCat(a, b);
        //then
        assertEquals("loHi", newStr);
    }

    @Test
    void abcXTest(){
        //given
        String a = "abc";
        String b = "x";
        //when
        String newStr = minCat.minCat(a, b);
        //then
        assertEquals("cx", newStr);
    }

    @Test
    void abcNoneTest(){
        //given
        String a = "abc";
        String b = "";
        //when
        String newStr = minCat.minCat(a, b);
        assertEquals("", newStr);
    }

}