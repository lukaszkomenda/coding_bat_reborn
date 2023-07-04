package org.example.WithoutEnd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutEndTest {

    WithoutEnd withoutEnd = new WithoutEnd();

    @Test
    void javaTest(){
        //given
        String str = "java";
        //when
        String newStr = withoutEnd.withoutEnd(str);
        //then
        assertEquals("av", newStr);
    }

    @Test
    void codingTest(){
        //given
        String str = "coding";
        //when
        String newStr = withoutEnd.withoutEnd(str);
        //then
        assertEquals("odin", newStr);
    }

    @Test
    void abTest(){
        //given
        String str = "ab";
        //when
        String newStr = withoutEnd.withoutEnd(str);
        //then
        assertEquals("", newStr);
    }

}