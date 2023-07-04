package org.example.basicStringMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicStringMethodsImplTest {

    BasicStringMethods basicStringMethods = new BasicStringMethodsImpl();

    @Test
    void bobTest(){
        //given
        String name = "Bob";
        //when
        String welcome = basicStringMethods.helloName(name);
        //then
        assertEquals("Hello Bob", welcome);
    }

    @Test
    void dollyTest(){
        //given
        String name = "Dolly";
        //when
        String welcome = basicStringMethods.helloName(name);
        //then
        assertEquals("Hello Dolly", welcome);
    }

    @Test
    void alphaTest(){
        //given
        String name = "Alpha";
        //when
        String welcome = basicStringMethods.helloName(name);
        //then
        assertEquals("Hello Alpha", welcome);
    }

    @Test
    void hiByeTest(){
        //given
        String a = "Hi";
        String b = "Bye";
        //when
        String newWord = basicStringMethods.makeAbba(a, b);
        //then
        assertEquals("HiByeByeHi", newWord);
    }

    @Test
    void xyTest(){
        //given
        String a = "x";
        String b = "y";
        //when
        String newWord = basicStringMethods.makeAbba(a, b);
        //then
        assertEquals("xyyx", newWord);
    }

    @Test
    void noneYTest(){
        //given
        String a = "";
        String b = "y";
        //when
        String newWord = basicStringMethods.makeAbba(a, b);
        assertEquals("yy", newWord);
    }
}