package org.example.StringE;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringETest {

    StringE stringE = new StringE();

    @Test
    void helloTest(){
        //given
        String str = "Hello";
        //when
        boolean isCharInRange = stringE.stringE(str);
        //then
        assertTrue(isCharInRange);
    }

    @Test
    void hllTest(){
        //given
        String str = "Hll";
        //when
        boolean isCharInRange = stringE.stringE(str);
        //then
        assertFalse(isCharInRange);
    }

    @Test
    void noneTest(){
        //given
        String str = "";
        //when
        boolean isCharInRange = stringE.stringE(str);
        //then
        assertFalse(isCharInRange);
    }

}