package org.example.Left2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Left2Test {

    Left2 left2 = new Left2();

    @Test
    void javaTest(){
        //given
        String str = "java";
        //when
        String newStr = left2.left2(str);
        //then
        assertEquals("vaja", newStr);
    }

    @Test
    void hiTest(){
        //given
        String str = "Hi";
        //when
        String newStr = left2.left2(str);
        //then
        assertEquals("Hi", newStr);
    }

    @Test
    void catTest(){
        //given
        String str = "cat";
        //when
        String newStr = left2.left2(str);
        //then
        assertEquals("tca", newStr);
    }

}