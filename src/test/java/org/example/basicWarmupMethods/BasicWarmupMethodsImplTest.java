package org.example.basicWarmupMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicWarmupMethodsImplTest {

    BasicWarmupMethods basicWarmupMethods = new BasicWarmupMethodsImpl();

    @Test
    void noWeekdayNoVacationTest() {
        //given
        boolean weekday = false;
        boolean vacation = false;
        //when
        //then
        assertTrue(basicWarmupMethods.sleepIn(weekday, vacation));
    }

    @Test
    void weekdayNoVacationTest() {
        //given
        boolean weekday = true;
        boolean vacation = false;
        //when
        //then
        assertFalse(basicWarmupMethods.sleepIn(weekday, vacation));
    }

    @Test
    void noWeekdayVacationTest() {
        //given
        boolean weekday = false;
        boolean vacation = true;
        //when
        //then
        assertTrue(basicWarmupMethods.sleepIn(weekday, vacation));
    }

    @Test
    void weekdayVacationTest() {
        //given
        boolean weekday = true;
        boolean vacation = true;
        //when
        //then
        assertTrue(basicWarmupMethods.sleepIn(weekday, vacation));
    }

    @Test
    void isTwoMonkeysSmileTest() {
        //given
        boolean aSmile = true;
        boolean bSmile = true;
        //when
        //then
        assertTrue(basicWarmupMethods.monkeyTrouble(aSmile, bSmile));
    }

    @Test
    void isTwoMonkeysDontSmileTest() {
        //given
        boolean aSmile = false;
        boolean bSmile = false;
        //when
        //then
        assertTrue(basicWarmupMethods.monkeyTrouble(aSmile, bSmile));
    }

    @Test
    void isAMonkeySmileAndBMonkeyDontTest() {
        //given
        boolean aSmile = true;
        boolean bSmile = false;
        //when
        //then
        assertFalse(basicWarmupMethods.monkeyTrouble(aSmile, bSmile));
    }

    @Test
    void isAMonkeyDontSmileAndBMonkeySmileTest() {
        //given
        boolean aSmile = false;
        boolean bSmile = true;
        //when
        //then
        assertFalse(basicWarmupMethods.monkeyTrouble(aSmile, bSmile));
    }

    @Test
    void oneTwoTest() {
        //given
        int a = 1;
        int b = 2;
        //when
        //then
        assertEquals(3, basicWarmupMethods.sumDouble(a, b));
    }

    @Test
    void threeTwoTest() {
        //given
        int a = 3;
        int b = 2;
        //when
        //then
        assertEquals(5, basicWarmupMethods.sumDouble(a, b));
    }

    @Test
    void doubleTwoTest() {
        //given
        int a = 2;
        int b = 2;
        //when
        //then
        assertEquals(8, basicWarmupMethods.sumDouble(a, b));
    }

    @Test
    void minusOneZeroTest() {
        //given
        int a = -1;
        int b = 0;
        //when
        //then
        assertEquals(-1, basicWarmupMethods.sumDouble(a, b));
    }

    @Test
    void doubleThreeTest() {
        //given
        int a = 3;
        int b = 3;
        //when
        //then
        assertEquals(12, basicWarmupMethods.sumDouble(a, b));
    }

    @Test
    void doubleZeroTest() {
        //given
        int a = 0;
        int b = 0;
        //when
        int sum = basicWarmupMethods.sumDouble(a, b);
        //then
        assertEquals(0, sum);
    }

    @Test
    void zeroOneTest() {
        //given
        int a = 0;
        int b = 1;
        //when
        int sum = basicWarmupMethods.sumDouble(a, b);
        //then
        assertEquals(1, sum);
    }

    @Test
    void threeFourTest() {
        //given
        int a = 3;
        int b = 4;
        //when
        int sum = basicWarmupMethods.sumDouble(a, b);
        //then
        assertEquals(7, sum);
    }

    @Test
    void nineteenTest(){
        //given
        int n = 19;
        //when
        int difference = basicWarmupMethods.diff21(n);
        //then
        assertEquals(2,difference);
    }

    @Test
    void tenTest(){
        //given
        int n = 10;
        //when
        int difference = basicWarmupMethods.diff21(n);
        //then
        assertEquals(11,difference);
    }

    @Test
    void twentyOneTest(){
        //given
        int n = 21;
        //when
        int difference = basicWarmupMethods.diff21(n);
        //then
        assertEquals(0,difference);
    }

    @Test
    void twentyTwoTest(){
        //given
        int n = 22;
        //when
        int difference = basicWarmupMethods.diff21(n);
        //then
        assertEquals(2,difference);
    }

    @Test
    void twentyFiveTest(){
        //given
        int n = 25;
        //when
        int difference = basicWarmupMethods.diff21(n);
        //then
        assertEquals(8,difference);
    }

    @Test
    void thirtyTest(){
        //given
        int n = 30;
        //when
        int difference = basicWarmupMethods.diff21(n);
        //then
        assertEquals(18,difference);
    }

    @Test
    void zeroTest(){
        //given
        int n = 0;
        //when
        int difference = basicWarmupMethods.diff21(n);
        //then
        assertEquals(21,difference);
    }

    @Test
    void oneTest(){
        //given
        int n = 1;
        //when
        int difference = basicWarmupMethods.diff21(n);
        //then
        assertEquals(20,difference);
    }

    @Test
    void twoTest(){
        //given
        int n = 2;
        //when
        int difference = basicWarmupMethods.diff21(n);
        //then
        assertEquals(19,difference);
    }

    @Test
    void minusOneTest(){
        //given
        int n = -1;
        //when
        int difference = basicWarmupMethods.diff21(n);
        //then
        assertEquals(22,difference);
    }

    @Test
    void minusTwoTest(){
        //given
        int n = -2;
        //when
        int difference = basicWarmupMethods.diff21(n);
        //then
        assertEquals(23,difference);
    }

    @Test
    void fiftyTest(){
        //given
        int n = 50;
        //when
        int difference = basicWarmupMethods.diff21(n);
        //then
        assertEquals(58,difference);
    }

    @Test
    void loudSixTest() {
        //given
        boolean talking = true;
        int hour = 6;
        //when
        boolean isTrouble = basicWarmupMethods.parrotTrouble(talking, hour);
        //then
        assertTrue(isTrouble);
    }

    @Test
    void loudSevenTest() {
        //given
        boolean talking = true;
        int hour = 7;
        //when
        boolean isTrouble = basicWarmupMethods.parrotTrouble(talking, hour);
        //then
        assertFalse(isTrouble);
    }

    @Test
    void noLoudSixTest() {
        //given
        boolean talking = false;
        int hour = 6;
        //when
        boolean isTrouble = basicWarmupMethods.parrotTrouble(talking, hour);
        //then
        assertFalse(isTrouble);
    }

    @Test
    void loudTwentyOneTest() {
        //given
        boolean talking = true;
        int hour = 21;
        //when
        boolean isTrouble = basicWarmupMethods.parrotTrouble(talking, hour);
        //then
        assertTrue(isTrouble);
    }

    @Test
    void noLoudTwentyOneTest() {
        //given
        boolean talking = false;
        int hour = 21;
        //when
        boolean isTrouble = basicWarmupMethods.parrotTrouble(talking, hour);
        //then
        assertFalse(isTrouble);
    }

    @Test
    void noLoudTwentyTest() {
        //given
        boolean talking = false;
        int hour = 20;
        //when
        boolean isTrouble = basicWarmupMethods.parrotTrouble(talking, hour);
        //then
        assertFalse(isTrouble);
    }

    @Test
    void loudTwentyThreeTest() {
        //given
        boolean talking = true;
        int hour = 23;
        //when
        boolean isTrouble = basicWarmupMethods.parrotTrouble(talking, hour);
        //then
        assertTrue(isTrouble);
    }

    @Test
    void noLoudTwentyThreeTest() {
        //given
        boolean talking = false;
        int hour = 23;
        //when
        boolean isTrouble = basicWarmupMethods.parrotTrouble(talking, hour);
        //then
        assertFalse(isTrouble);
    }

    @Test
    void loudTwentyTest() {
        //given
        boolean talking = true;
        int hour = 20;
        //when
        boolean isTrouble = basicWarmupMethods.parrotTrouble(talking, hour);
        //then
        assertFalse(isTrouble);
    }

    @Test
    void noLoudTwelveTest() {
        //given
        boolean talking = false;
        int hour = 12;
        //when
        boolean isTrouble = basicWarmupMethods.parrotTrouble(talking, hour);
        //then
        assertFalse(isTrouble);
    }

    @Test
    void nineAndTenTest() {
        //given
        int a = 9;
        int b = 10;
        //when
        boolean make10 = basicWarmupMethods.makes10(a,b);
        //then
        assertTrue(make10);
    }

    @Test
    void nineAndNineTest() {
        //given
        int a = 9;
        int b = 9;
        //when
        boolean make10 = basicWarmupMethods.makes10(a,b);
        //then
        assertFalse(make10);
    }

    @Test
    void oneAndNineTest() {
        //given
        int a = 1;
        int b = 9;
        //when
        boolean makes101 = basicWarmupMethods.makes10(a,b);
        //then
        assertTrue(makes101);
    }

    @Test
    void tenAndOneTest() {
        //given
        int a = 10;
        int b = 1;
        //when
        boolean makes101 = basicWarmupMethods.makes10(a,b);
        //then
        assertTrue(makes101);
    }

    @Test
    void tenAndTenTest() {
        //given
        int a = 10;
        int b = 10;
        //when
        boolean makes101 = basicWarmupMethods.makes10(a,b);
        //then
        assertTrue(makes101);
    }

    @Test
    void eightAndTwoTest() {
        //given
        int a = 8;
        int b = 2;
        //when
        boolean makes101 = basicWarmupMethods.makes10(a,b);
        //then
        assertTrue(makes101);
    }

    @Test
    void eightAndThreeTest() {
        //given
        int a = 8;
        int b = 3;
        //when
        boolean makes101 = basicWarmupMethods.makes10(a,b);
        //then
        assertFalse(makes101);
    }

    @Test
    void tenAndFourtytwoTest() {
        //given
        int a = 10;
        int b = 42;
        //when
        boolean makes101 = basicWarmupMethods.makes10(a,b);
        //then
        assertTrue(makes101);
    }

    @Test
    void twelveAndTwoTest() {
        //given
        int a = 12;
        int b = 2;
        //when
        boolean makes101 = basicWarmupMethods.makes10(a,b);
        //when
        assertFalse(makes101);
    }

    @Test
    void ninthyThreeTest(){
        //given
        int a = 93;
        //when
        boolean near100 = basicWarmupMethods.nearHundred(a);
        //then
        assertTrue(near100);
    }

    @Test
    void ninthyTest(){
        //given
        int a = 90;
        //when
        boolean near100 = basicWarmupMethods.nearHundred(a);
        //then
        assertTrue(near100);
    }

    @Test
    void eightyNineTest(){
        //given
        int a = 89;
        //when
        boolean near100 = basicWarmupMethods.nearHundred(a);
        //then
        assertFalse(near100);
    }

    @Test
    void hundredAndTenTest(){
        //given
        int a = 110;
        //when
        boolean near100 = basicWarmupMethods.nearHundred(a);
        //then
        assertTrue(near100);
    }

    @Test
    void hundredElevenTest(){
        //given
        int a = 111;
        //when
        boolean near100 = basicWarmupMethods.nearHundred(a);
        //then
        assertFalse(near100);
    }

    @Test
    void hundredTwentyOneTest(){
        //given
        int a = 121;
        //when
        boolean near100 = basicWarmupMethods.nearHundred(a);
        //then
        assertFalse(near100);
    }

    @Test
    void minusHundredAndOneTest(){
        //given
        int a = -101;
        //when
        boolean near100 = basicWarmupMethods.nearHundred(a);
        //then
        assertFalse(near100);
    }

    @Test
    void minusTwoHundredAndNineTest(){
        //given
        int a = -209;
        //when
        boolean near100 = basicWarmupMethods.nearHundred(a);
        //then
        assertFalse(near100);
    }

    @Test
    void oneHundredNinethyTest(){
        //given
        int a = 190;
        //when
        boolean near100 = basicWarmupMethods.nearHundred(a);
        //then
        assertTrue(near100);
    }

    @Test
    void twoHundredAndNineTest(){
        //given
        int a = 209;
        //when
        boolean near100 = basicWarmupMethods.nearHundred(a);
        //then
        assertTrue(near100);
    }

    @Test
    void nearHundredZeroTest(){
        //given
        int a = 0;
        //when
        boolean near100 = basicWarmupMethods.nearHundred(a);
        //then
        assertFalse(near100);
    }

    @Test
    void fiveTest(){
        //given
        int a = 5;
        //when
        boolean near100 = basicWarmupMethods.nearHundred(a);
        //then
        assertFalse(near100);
    }

    @Test
    void minusFiftyTest(){
        //given
        int a = -50;
        //when
        boolean near100 = basicWarmupMethods.nearHundred(a);
        //then
        assertFalse(near100);
    }

    @Test
    void hundredNinethyOne(){
        //given
        int a = 191;
        //when
        boolean near100 = basicWarmupMethods.nearHundred(a);
        //then
        assertTrue(near100);
    }

    @Test
    void hundredEightyNineTest(){
        //given
        int a = 189;
        //when
        boolean near100 = basicWarmupMethods.nearHundred(a);
        //then
        assertFalse(near100);
    }

    @Test
    void multiplyNumberTest(){
        //given
        int a = 200;
        int b = 210;
        int c = 211;
        int d = 290;
        //when
        //then
        assertTrue(basicWarmupMethods.nearHundred(a));
        assertTrue(basicWarmupMethods.nearHundred(b));
        assertFalse(basicWarmupMethods.nearHundred(c));
        assertFalse(basicWarmupMethods.nearHundred(d));
    }

    @Test
    void oneAndMinusOnePositiveTest() {
        //given
        int a = 1;
        int b = -1;
        boolean negative = false;
        //when
        boolean isPosNeg = basicWarmupMethods.posNeg(a, b, negative);
        //then
        assertTrue(isPosNeg);
    }

    @Test
    void minusOneAndOnePositiveTest() {
        //given
        int a = -1;
        int b = 1;
        boolean negative = false;
        //when
        boolean isPosNeg = basicWarmupMethods.posNeg(a, b, negative);
        //then
        assertTrue(isPosNeg);
    }

    @Test
    void minusFourAndMinusFiveNegativeTest() {
        //given
        int a = -4;
        int b = -5;
        boolean negative = true;
        //when
        boolean isPosNeg = basicWarmupMethods.posNeg(a, b, negative);
        //then
        assertTrue(isPosNeg);
    }

    @Test
    void candyTest(){
        //given
        String str = "candy";
        //when
        String newStr = basicWarmupMethods.notString(str);
        //then
        assertEquals("not candy",newStr);
    }

    @Test
    void xTest(){
        //given
        String str = "x";
        //when
        String newStr = basicWarmupMethods.notString(str);
        //then
        assertEquals("not x", newStr);
    }

    @Test
    void notTest(){
        //given
        String str = "not";
        //when
        String newStr = basicWarmupMethods.notString(str);
        //then
        assertEquals("not", newStr);
    }

    @Test
    void kittenOncTest() {
        //given
        String str = "kitten";
        int n = 1;
        //when
        String newStr = basicWarmupMethods.missingChar(str, n);
        //then
        assertEquals("ktten", newStr);
    }

    @Test
    void hiZeroTest() {
        //given
        String str = "Hi";
        int n = 0;
        //when
        String newStr = basicWarmupMethods.missingChar(str, n);
        //then
        assertEquals("i", newStr);
    }

    @Test
    void codeTwoTest() {
        //given
        String str = "code";
        int n = 2;
        //when
        String newStr = basicWarmupMethods.missingChar(str, n);
        //then
        assertEquals("coe", newStr);
    }

    @Test
    void frontBackATest(){
        //given
        String str = "a";
        //when
        String newStr = basicWarmupMethods.frontBack(str);
        //then
        assertEquals("a", newStr);
    }

    @Test
    void helloTest(){
        //given
        String str = "hello";
        //when
        String newStr = basicWarmupMethods.frontBack(str);
        //then
        assertEquals("oellh", newStr);
    }

    @Test
    void frontBackAbcTest(){
        //given
        String str = "abc";
        //when
        String newStr = basicWarmupMethods.frontBack(str);
        //then
        assertEquals("cba", newStr);
    }

    @Test
    void abcTest(){
        //given
        String str = "abc";
        //when
        String newStr = basicWarmupMethods.front3(str);
        //then
        assertEquals("abcabcabc", newStr);
    }

    @Test
    void front3ATest(){
        //given
        String str = "a";
        //when
        String newStr = basicWarmupMethods.front3(str);
        //then
        assertEquals("aaa",newStr);
    }

    @Test
    void front3NoCharTest(){
        //given
        String str = "";
        //when
        String newStr = basicWarmupMethods.front3(str);
        //then
        assertEquals("", newStr);
    }

    @Test
    void catTest(){
        //given
        String str = "cat";
        //when
        String newStr = basicWarmupMethods.backAround(str);
        //then
        assertEquals("tcatt", newStr);
    }

    @Test
    void aTest(){
        //given
        String str = "a";
        //when
        String newStr = basicWarmupMethods.backAround(str);
        //then
        assertEquals("aaa", newStr);
    }

    @Test
    void readTest(){
        //given
        String str = "read";
        //when
        String newStr = basicWarmupMethods.backAround(str);
        //then
        assertEquals("dreadd", newStr);
    }

    @Test
    void or35TenTest(){
        //given
        int n = 10;
        //when
        boolean isMultipleThreeAndFive = basicWarmupMethods.or35(n);
        //then
        assertTrue(isMultipleThreeAndFive);
    }

    @Test
    void fourTest(){
        //given
        int n = 4;
        //when
        boolean isMultipleThreeAndFive = basicWarmupMethods.or35(n);
        //then
        assertFalse(isMultipleThreeAndFive);
    }

    @Test
    void hundredTest(){
        //given
        int n = 10;
        //when
        boolean isMultipleThreeAndFive = basicWarmupMethods.or35(n);
        //then
        assertTrue(isMultipleThreeAndFive);
    }

    @Test
    void kittenTest(){
        //given
        String str = "kitten";
        //when
        String newStr = basicWarmupMethods.front22(str);
        //then
        assertEquals("kikittenki", newStr);
    }

    @Test
    void haTest(){
        //given
        String str = "Ha";
        //when
        String newStr = basicWarmupMethods.front22(str);
        //then
        assertEquals("HaHaHa",newStr);
    }

    @Test
    void noCharTest(){
        //given
        String str = "";
        //when
        String newStr = basicWarmupMethods.front22(str);
        //then
        assertEquals("",newStr);
    }

    @Test
    void hiThereTest(){
        //given
        String str = "hi there";
        //when
        boolean isStartHi = basicWarmupMethods.startHi(str);
        //then
        assertTrue(isStartHi);
    }

    @Test
    void hTest(){
        //given
        String str = "h";
        //when
        boolean isStartHi = basicWarmupMethods.startHi(str);
        //then
        assertFalse(isStartHi);
    }

    @Test
    void hiHoTest(){
        //given
        String str = "hi ho";
        //when
        boolean isStartHi = basicWarmupMethods.startHi(str);
        //then
        assertTrue(isStartHi);
    }

    @Test
    void hundredTwentyAndMinusOneTest(){
        //given
        int temp1 = 120;
        int temp2 = -1;
        //when
        boolean isBelowZeroAndAboveHundred = basicWarmupMethods.icyHot(temp1, temp2);
        //then
        assertTrue(isBelowZeroAndAboveHundred);
    }

    @Test
    void twoAndHundredTwentyTest(){
        //given
        int temp1 = 2;
        int temp2 = 120;
        //when
        boolean isBelowZeroAndAboveHundred = basicWarmupMethods.icyHot(temp1, temp2);
        //then
        assertFalse(isBelowZeroAndAboveHundred);
    }

    @Test
    void minusTwoAndMinusTwoTest(){
        int temp1 = -2;
        int temp2 = -2;
        //when
        boolean isBelowZeroAndAboveHundred = basicWarmupMethods.icyHot(temp1, temp2);
        //then
        assertFalse(isBelowZeroAndAboveHundred);
    }

    @Test
    void twentyOneAndTwelveTest(){
        //given
        int a = 21;
        int b = 12;
        //when
        boolean isInRange1020 = basicWarmupMethods.in1020(a, b);
        //then
        assertTrue(isInRange1020);
    }

    @Test
    void doubleTwentyTest(){
        //given
        int a = 20;
        int b = 20;
        //when
        boolean isInRange1020 = basicWarmupMethods.in1020(a, b);
        //then
        assertTrue(isInRange1020);
    }

    @Test
    void doubleNineTest(){
        //given
        int a = 9;
        int b = 9;
        //when
        boolean isInRange1020 = basicWarmupMethods.in1020(a, b);
        //then
        assertFalse(isInRange1020);
    }

    @Test
    void thirteenAndTwentyAndTenTest(){
        //given
        int a = 13;
        int b = 20;
        int c = 10;
        //when
        boolean isInRange1319 = basicWarmupMethods.hasTeen(a, b, c);
        //then
        assertTrue(isInRange1319);
    }

    @Test
    void oneAndTwentyAndTwelveTest(){
        int a = 1;
        int b = 20;
        int c = 12;
        //when
        boolean isInRange1319 = basicWarmupMethods.hasTeen(a, b, c);
        //then
        assertFalse(isInRange1319);
    }

    @Test
    void fourAndTwoAndTwentyTest(){
        int a = 4;
        int b = 2;
        int c = 20;
        //when
        boolean isInRange1319 = basicWarmupMethods.hasTeen(a, b, c);
        //then
        assertFalse(isInRange1319);
    }

    @Test
    void thirteenAndNinetynineTest(){
        //given
        int a = 13;
        int b = 99;
        //when
        boolean isInRange1319 = basicWarmupMethods.loneTeen(a, b);
        //then
        assertTrue(isInRange1319);
    }

    @Test
    void doubleThirteenTest(){
        //given
        int a = 13;
        int b = 13;
        //when
        boolean isInRange1319 = basicWarmupMethods.loneTeen(a, b);
        //then
        assertFalse(isInRange1319);
    }

    @Test
    void sixteenAndNineTest(){
        //given
        int a = 16;
        int b = 9;
        //when
        boolean isInRange1319 = basicWarmupMethods.loneTeen(a, b);
        //then
        assertTrue(isInRange1319);
    }
}