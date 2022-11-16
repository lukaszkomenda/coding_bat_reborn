package org.example.FirstTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstTwoTest {

    FirstTwo firstTwo = new FirstTwo();

    @Test
    void helloTest(){
        //given
        String str = "Hello";
        //when
        String newStr = firstTwo.firstTwo(str);
        //then
        assertEquals("He", newStr);
    }

    @Test
    void aTest(){
        //given
        String str = "a";
        //when
        String newStr = firstTwo.firstTwo(str);
        //then
        assertEquals("a", newStr);
    }

    @Test
    void noneTest(){
        //given
        String str = "";
        //when
        String newStr = firstTwo.firstTwo(str);
        //then
        assertEquals("", newStr);
    }

}