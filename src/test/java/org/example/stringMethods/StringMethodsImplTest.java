package org.example.stringMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMethodsImplTest {

    StringMethods stringMethods = new StringMethodsImpl();

    @Test
    void doubleCharTheTest() {
        //given
        String str = "The";
        //when
        String newStr = stringMethods.doubleChar(str);
        //then
        assertEquals("TThhee", newStr);
    }

    @Test
    void doubleCharNoneTest(){
        //given
        String str = "";
        //when
        String newStr = stringMethods.doubleChar(str);
        //then
        assertEquals("", newStr);
    }

    @Test
    void countHiHiHiTest() {
        //given
        String str = "hihi";
        //when
        int counter = stringMethods.countHi(str);
        //then
        assertEquals(2, counter);
    }

    @Test
    void countHiNoneTest(){
        //given
        String str = "";
        //when
        int counter = stringMethods.countHi(str);
        //then
        assertEquals(0, counter);
    }

    @Test
    void catDogCatDogTest() {
        //given
        String str = "catdog";
        //when
        boolean isCatDogEquals = stringMethods.catDog(str);
        //then
        assertTrue(isCatDogEquals);
    }

    @Test
    void catDogNoneTest(){
        //given
        String str = "";
        //when
        boolean isCatDogEquals = stringMethods.catDog(str);
        //then
        assertTrue(isCatDogEquals);
    }

    @Test
    void countCodeCodeTest() {
        //given
        String str = "code";
        //when
        int result = stringMethods.countCode(str);
        //then
        assertEquals(1, result);
    }

    @Test
    void countCodeNoneTest(){
        //given
        String str = "";
        //when
        int result = stringMethods.countCode(str);
        //then
        assertEquals(0, result);
    }

    @Test
    void endOtherAbcAbcTest() {
        //given
        String a = "abc";
        String b = "abc";
        //when
        boolean isEndEqual = stringMethods.endOther(a, b);
        //then
        assertTrue(isEndEqual);
    }

    @Test
    void endOtherYzXzTest(){
        //given
        String a = "yz";
        String b = "Xz";
        //when
        boolean isEndEqual = stringMethods.endOther(a, b);
        //then
        assertFalse(isEndEqual);
    }

    @Test
    void xyzThereAbcxyzTest() {
        //given
        String str = "abcxyz";
        //when
        boolean isRareXyzAppear = stringMethods.xyzThere(str);
        //then
        assertTrue(isRareXyzAppear);
    }

    @Test
    void xyzThereXyTest(){
        //given
        String str = "xy";
        //when
        boolean isRareXyzAppear = stringMethods.xyzThere(str);
        //then
        assertFalse(isRareXyzAppear);
    }
}