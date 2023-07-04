package org.example.NTwice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NTwiceTest {

    NTwice nTwice = new NTwice();

    @Test
    void helloTest(){
        //given
        String str = "Hello";
        int n = 2;
        //when
        String newStr = nTwice.nTwice(str, n);
        //then
        assertEquals("Helo", newStr);
    }

    @Test
    void codeTest(){
        //given
        String str = "Code";
        int n = 4;
        //when
        String newStr = nTwice.nTwice(str, n);
        //then
        assertEquals("CodeCode", newStr);
    }

    @Test
    void chocolateTest(){
        //given
        String str = "Chocolate";
        int n = 0;
        //when
        String newStr = nTwice.nTwice(str, n);
        //then
        assertEquals("", newStr);
    }

}