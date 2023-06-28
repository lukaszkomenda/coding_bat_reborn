package org.example.mediumWarmupMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediumWarmupMethodsImplTest {

    MediumWarmupMethods mediumWarmupMethods = new MediumWarmupMethodsImpl();

    @Test
    void hiTest(){
        //given
        String str = "Hi";
        int n = 2;
        //when
        String newStr = mediumWarmupMethods.stringTimes(str, n);
        //then
        assertEquals("HiHi", newStr);
    }

    @Test
    void stringTimesNoneTest(){
        //given
        String str = "";
        int n = 4;
        //when
        String newStr = mediumWarmupMethods.stringTimes(str, n);
        //then
        assertEquals("", newStr);
    }

    @Test
    void ohBoyTest(){
        //given
        String str = "Oh Boy!";
        int n = 2;
        //when
        String newStr = mediumWarmupMethods.stringTimes(str, n);
        //then
        assertEquals("Oh Boy!Oh Boy!", newStr);
    }

    @Test
    void frontTimesAbcTest(){
        //given
        String str = "Abc";
        int n = 3;
        //when
        String newStr = mediumWarmupMethods.frontTimes(str, n);
        //then
        assertEquals("AbcAbcAbc", newStr);
    }

    @Test
    void aTest(){
        //given
        String str = "A";
        int n = 4;
        //when
        String newStr = mediumWarmupMethods.frontTimes(str, n);
        //then
        assertEquals("AAAA", newStr);
    }

    @Test
    void frontTimesNoneTest(){
        //given
        String str = "";
        int n = 4;
        //when
        String newStr = mediumWarmupMethods.frontTimes(str, n);
        //then
        assertEquals("", newStr);
    }

    @Test
    void countXxAbcTest(){
        //given
        String str = "abc";
        //when
        int counter = mediumWarmupMethods.countXX(str);
        //then
        assertEquals(0, counter);
    }

    @Test
    void xxxTest(){
        //given
        String str = "xxx";
        //when
        int counter = mediumWarmupMethods.countXX(str);
        //then
        assertEquals(2, counter);
    }

    @Test
    void abcxxTest(){
        //given
        String str = "abcxx";
        //when
        int counter = mediumWarmupMethods.countXX(str);
        //then
        assertEquals(1, counter);
    }

    @Test
    void axxbbTest(){
        //given
        String str = "axxbb";
        //when
        boolean isDoubleX = mediumWarmupMethods.doubleX(str);
        //then
        assertTrue(isDoubleX);
    }

    @Test
    void abcTest(){
        //given
        String str = "abc";
        //when
        boolean isDoubleX = mediumWarmupMethods.doubleX(str);
        //then
        assertFalse(isDoubleX);
    }

    @Test
    void noneTest(){
        //given
        String str = "";
        //when
        boolean isDoubleX = mediumWarmupMethods.doubleX(str);
        //then
        assertFalse(isDoubleX);
    }
}