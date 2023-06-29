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
    void doubleXNoneTest(){
        //given
        String str = "";
        //when
        boolean isDoubleX = mediumWarmupMethods.doubleX(str);
        //then
        assertFalse(isDoubleX);
    }

    @Test
    void stringBitsHiTest(){
        //given
        String str = "Hi";
        //when
        String newStr = mediumWarmupMethods.stringBits(str);
        //then
        assertEquals("H", newStr);
    }

    @Test
    void greetingsTest(){
        //given
        String str = "Greetings";
        //when
        String newStr = mediumWarmupMethods.stringBits(str);
        //then
        assertEquals("Getns", newStr);
    }

    @Test
    void stringBitsNoneTest(){
        //given
        String str = "";
        //when
        String newStr = mediumWarmupMethods.stringBits(str);
        //then
        assertEquals("", newStr);
    }

    @Test
    void abTest(){
        //given
        String str = "ab";
        //when
        String newStr = mediumWarmupMethods.stringSplosion(str);
        //then
        assertEquals("aab", newStr);
    }

    @Test
    void fadeTest(){
        //given
        String str = "fade";
        //when
        String newStr = mediumWarmupMethods.stringSplosion(str);
        //then
        assertEquals("ffafadfade", newStr);
    }

    @Test
    void byeTest(){
        //given
        String str = "Bye";
        //when
        String newStr = mediumWarmupMethods.stringSplosion(str);
        //then
        assertEquals("BByBye", newStr);
    }

    @Test
    void xxxxTest(){
        //given
        String str = "xxxx";
        //when
        int count = mediumWarmupMethods.last2(str);
        //then
        assertEquals(2, count);
    }

    @Test
    void hTest(){
        //given
        String str = "h";
        //when
        int count = mediumWarmupMethods.last2(str);
        //then
        assertEquals(0, count);
    }

    @Test
    void hixxhiTest(){
        //given
        String str = "hixxhi";
        //when
        int count = mediumWarmupMethods.last2(str);
        //then
        assertEquals(1, count);
    }

    @Test
    void oneTwoNineTest(){
        //given
        int[] nums = {1,2,9};
        //when
        int count9 = mediumWarmupMethods.arrayCount9(nums);
        //then
        assertEquals(1, count9);
    }

    @Test
    void oneNineNineThreeNineTest(){
        //given
        int[] nums = {1,9,9,3,9};
        //when
        int count9 = mediumWarmupMethods.arrayCount9(nums);
        //then
        assertEquals(3,count9);
    }

    @Test
    void arrayCountNoneTest(){
        //given
        int[] nums = {};
        //when
        int count9 = mediumWarmupMethods.arrayCount9(nums);
        //then
        assertEquals(0,count9);
    }

    @Test
    void oneTwoNineThreeFourTest(){
        //given
        int[] nums = {1,2,9,3,4};
        //when
        boolean isNineInFront = mediumWarmupMethods.arrayFront9(nums);
        //then
        assertTrue(isNineInFront);
    }

    @Test
    void nineTwoThreeTest(){
        //given
        int[] nums = {9,2,3};
        //when
        boolean isNineInFront = mediumWarmupMethods.arrayFront9(nums);
        //then
        assertTrue(isNineInFront);
    }

    @Test
    void noneTest(){
        //given
        int[] nums = {};
        //when
        boolean isNineInFront = mediumWarmupMethods.arrayFront9(nums);
        //then
        assertFalse(isNineInFront);
    }
}