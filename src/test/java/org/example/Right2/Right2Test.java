package org.example.Right2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Right2Test {

    Right2 right2 = new Right2();

    @Test
    void javaTest(){
        //given
        String str = "java";
        //when
        String newStr = right2.right2(str);
        //then
        assertEquals("vaja", newStr);
    }

    @Test
    void hiTest(){
        //given
        String str = "Hi";
        //when
        String newStr = right2.right2(str);
        //then
        assertEquals("Hi", newStr);
    }

    @Test
    void catTest(){
        //given
        String str = "cat";
        //when
        String newStr = right2.right2(str);
        //then
        assertEquals("atc", newStr);
    }

}