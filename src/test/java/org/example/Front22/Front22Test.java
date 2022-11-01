package org.example.Front22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Front22Test {

    Front22 front22 = new Front22();

    @Test
    void kittenTest(){
        //given
        String str = "kitten";
        //when
        String newStr = front22.front22(str);
        //then
        assertEquals("kikittenki", newStr);
    }

    @Test
    void haTest(){
        //given
        String str = "Ha";
        //when
        String newStr = front22.front22(str);
        //then
        assertEquals("HaHaHa",newStr);
    }

    @Test
    void noCharTest(){
        //given
        String str = "";
        //when
        String newStr = front22.front22(str);
        //then
        assertEquals("",newStr);
    }

}