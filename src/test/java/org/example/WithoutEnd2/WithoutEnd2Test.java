package org.example.WithoutEnd2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutEnd2Test {

    WithoutEnd2 withoutEnd2 = new WithoutEnd2();

    @Test
    void helloTest(){
        //given
        String str = "Hello";
        //when
        String newStr = withoutEnd2.withoutEnd2(str);
        //then
        assertEquals("ell", newStr);
    }

    @Test
    void abcTest(){
        //given
        String str = "abc";
        //when
        String newStr = withoutEnd2.withoutEnd2(str);
        //then
        assertEquals("b", newStr);
    }

    @Test
    void aTest(){
        //given
        String str = "a";
        //when
        String newStr = withoutEnd2.withoutEnd2(str);
        //then
        assertEquals("", newStr);
    }

}