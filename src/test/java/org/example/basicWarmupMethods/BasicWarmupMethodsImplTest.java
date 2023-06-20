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
}