package org.example.CountXX;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountXXTest {

    CountXX countXX = new CountXX();

    @Test
    void abcTest(){
        //given
        String str = "abc";
        //when
        int counter = countXX.countXX(str);
        //then
        assertEquals(0, counter);
    }

    @Test
    void xxxTest(){
        //given
        String str = "xxx";
        //when
        int counter = countXX.countXX(str);
        //then
        assertEquals(2, counter);
    }

    @Test
    void abcxxTest(){
        //given
        String str = "abcxx";
        //when
        int counter = countXX.countXX(str);
        //then
        assertEquals(1, counter);
    }

}