package org.example.hardStringMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HardStringMethodsImplTest {

    HardStringMethods hardStringMethods = new HardStringMethodsImpl();

    @Test
    void countYZFezDayTest() {
        //given
        String str = "fez day";
        //when
        int result = hardStringMethods.countYZ(str);
        //then
        assertEquals(2, result);
    }

    @Test
    void countYZY2BzTest(){
        //given
        String str = "y2bz";
        //when
        int result = hardStringMethods.countYZ(str);
        //then
        assertEquals(2, result);
    }

    @Test
    void withoutStringTripleXAndXTest() {
        //given
        String base = "xxx";
        String remove = "x";
        //when
        String newStr = hardStringMethods.withoutString(base, remove);
        //then
        assertEquals("", newStr);
    }

    @Test
    void withoutString1111And11Test(){
        //given
        String base = "1111";
        String remove = "11";
        //when
        String newStr = hardStringMethods.withoutString(base, remove);
        //then
        assertEquals("", newStr);
    }

    @Test
    void equalIsNotThisIsNotTest() {
        //given
        String str = "This is not";
        //when
        boolean isEqual = hardStringMethods.equalIsNot(str);
        //then
        assertFalse(isEqual);
    }

    @Test
    void equalIsNotThisIsNotNotTest(){
        //given
        String str = "This is notnot";
        //when
        boolean isEqual = hardStringMethods.equalIsNot(str);
        //then
        assertTrue(isEqual);
    }

    @Test
    void gHappyDoubleGTest() {
        //given
        String str = "gg";
        //when
        boolean isGHappy = hardStringMethods.gHappy(str);
        //then
        assertTrue(isGHappy);
    }

    @Test
    void gHappyMgmTest(){
        //given
        String str = "mgm";
        //when
        boolean isGHappy = hardStringMethods.gHappy(str);
        //then
        assertFalse(isGHappy);
    }

    @Test
    void countTripleXxxAbcTest() {
        //given
        String str = "XXXabc";
        //when
        int tripleCounter = hardStringMethods.countTriple(str);
        //then
        assertEquals(1, tripleCounter);
    }

    @Test
    void countTripleATest(){
        //given
        String str = "a";
        //when
        int tripleCounter = hardStringMethods.countTriple(str);
        //then
        assertEquals(0, tripleCounter);
    }

    @Test
    void sumDigitsAa1Bc2D3Test() {
        //given
        String str = "aa1bc2d3";
        //when
        int result = hardStringMethods.sumDigits(str);
        //then
        assertEquals(6, result);
    }

    @Test
    void sumDigitsAa11b33Test(){
        //given
        String str = "aa11b33";
        //when
        int result = hardStringMethods.sumDigits(str);
        //then
        assertEquals(8, result);
    }

    @Test
    void sameEndsAbXyAbTest() {
        //given
        String str = "abXYab";
        //when
        String newStr = hardStringMethods.sameEnds(str);
        //then
        assertEquals("ab", newStr);
    }

    @Test
    void sameEndsXxxTest(){
        //given
        String str = "xxx";
        //when
        String newStr = hardStringMethods.sameEnds(str);
        //then
        assertEquals("x", newStr);
    }

    @Test
    void mirrorEndsAbcaTest() {
        //given
        String str = "abca";
        //when
        String newStr = hardStringMethods.mirrorEnds(str);
        //then
        assertEquals("a", newStr);
    }

    @Test
    void mirrorEndsAbabTest(){
        //given
        String str = "abab";
        //when
        String newStr = hardStringMethods.mirrorEnds(str);
        //then
        assertEquals("", newStr);
    }

    @Test
    void sumNumbersSevenEmptySpaceElevenTest() {
        //given
        String str = "7 11";
        //when
        int result = hardStringMethods.sumNumbers(str);
        //then
        assertEquals(18, result);
    }

    @Test
    void sumNumbersNoneTest(){
        //given
        String str = "";
        //when
        int result = hardStringMethods.sumNumbers(str);
        //then
        assertEquals(0, result);
    }
}