package org.example.ExtraFront;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtraFrontTest {

    ExtraFront extraFront = new ExtraFront();

    @Test
    void helloTest(){
        //given
        String str = "Hello";
        //when
        String newStr = extraFront.extraFront(str);
        //then
        assertEquals("HeHeHe", newStr);
    }

    @Test
    void hTest(){
        //given
        String str = "H";
        //when
        String newStr = extraFront.extraFront(str);
        //then
        assertEquals("HHH", newStr);
    }

    @Test
    void noneTest(){
        //given
        String str = "";
        //when
        String newStr = extraFront.extraFront(str);
        //then
        assertEquals("", newStr);
    }

}