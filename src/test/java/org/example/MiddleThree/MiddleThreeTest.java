package org.example.MiddleThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleThreeTest {

    MiddleThree middleThree = new MiddleThree();

    @Test
    void candyTest(){
        //given
        String str = "Candy";
        //when
        String newStr = middleThree.middleThree(str);
        //then
        assertEquals("and", newStr);
    }

    @Test
    void solvingTest(){
        //given
        String str = "solving";
        //when
        String newStr = middleThree.middleThree(str);
        //then
        assertEquals("lvi", newStr);
    }

    @Test
    void javaYetTest(){
        //given
        String str = "java yet java";
        //when
        String newStr = middleThree.middleThree(str);
        //then
        assertEquals("yet", newStr);
    }

}