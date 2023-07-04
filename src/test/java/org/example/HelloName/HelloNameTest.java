package org.example.HelloName;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloNameTest {

    HelloName helloName = new HelloName();

    @Test
    void bobTest(){
        //given
        String name = "Bob";
        //when
        String welcome = helloName.helloName(name);
        //then
        assertEquals("Hello Bob", welcome);
    }

    @Test
    void dollyTest(){
        //given
        String name = "Dolly";
        //when
        String welcome = helloName.helloName(name);
        //then
        assertEquals("Hello Dolly", welcome);
    }

    @Test
    void alphaTest(){
        //given
        String name = "Alpha";
        //when
        String welcome = helloName.helloName(name);
        //then
        assertEquals("Hello Alpha", welcome);
    }

}