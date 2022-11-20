package org.example.TwoChar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoCharTest {

    TwoChar twoChar = new TwoChar();

    @Test
    void javaZeroTest(){
        //given
        String str = "java";
        int index = 0;
        //when
        String newStr = twoChar.twoChar(str, index);
        //then
        assertEquals("ja", newStr);
    }

    @Test
    void javaMinusOneTest(){
        //given
        String str = "java";
        int index = -1;
        //when
        String newStr = twoChar.twoChar(str, index);
        //then
        assertEquals("ja", newStr);
    }

    @Test
    void helloNintyNineTest(){
        //given
        String str = "Hello";
        int index = 99;
        //when
        String newStr = twoChar.twoChar(str, index);
        //then
        assertEquals("He", newStr);
    }

}