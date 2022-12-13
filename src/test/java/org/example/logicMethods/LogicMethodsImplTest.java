package org.example.logicMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicMethodsImplTest {

    LogicMethods logicMethods = new LogicMethodsImpl();

    @Test
    void cigarPartyThirdNoWeekendTest() {
        //given
        int cigars = 30;
        boolean isWeekend = false;
        //when
        boolean isInRange = logicMethods.cigarParty(cigars, isWeekend);
        //then
        assertFalse(isInRange);
    }

    @Test
    void cigarPartyFiftyNoWeekendTest(){
        //given
        int cigars = 50;
        boolean isWeekend = false;
        //when
        boolean isInRange = logicMethods.cigarParty(cigars, isWeekend);
        //then
        assertTrue(isInRange);
    }

    @Test
    void dateFashionFiveTenTest() {
        //given
        int you = 5;
        int date = 10;
        //when
        int result = logicMethods.dateFashion(you, date);
        //then
        assertEquals(2, result);
    }

    @Test
    void dateFashionFiveTwoTest(){
        //given
        int you = 5;
        int date = 2;
        //when
        int result = logicMethods.dateFashion(you, date);
        //then
        assertEquals(0, result);
    }

    @Test
    void squirrelPlaySeventyNoSummer() {
        //given
        int temp = 70;
        boolean isSummer = false;
        //when
        boolean isPlay = logicMethods.squirrelPlay(temp, isSummer);
        //then
        assertTrue(isPlay);
    }

    @Test
    void squirrelPlayFiftySummer(){
        //given
        int temp = 50;
        boolean isSummer = true;
        //when
        boolean isPlay = logicMethods.squirrelPlay(temp, isSummer);
        //then
        assertFalse(isPlay);
    }

    @Test
    void caughtSpeedingSixtyNoBirthday() {
        //given
        int speed = 60;
        boolean isBirthday = false;
        //when
        int result = logicMethods.caughtSpeeding(speed, isBirthday);
        //then
        assertEquals(0, result);
    }

    @Test
    void caughtSpeedingSixtyFiveBirthday(){
        //given
        int speed = 65;
        boolean isBirthday = true;
        //when
        int result = logicMethods.caughtSpeeding(speed, isBirthday);
        //then
        assertEquals(0, result);
    }

    @Test
    void sortaSumThreeFourTest() {
        //given
        int a = 3;
        int b = 4;
        //when
        int result = logicMethods.sortaSum(a, b);
        //then
        assertEquals(7, result);
    }

    @Test
    void sortaSumNineFourTest(){
        //given
        int a = 9;
        int b = 4;
        //when
        int result = logicMethods.sortaSum(a, b);
        //then
        assertEquals(20, result);
    }

    @Test
    void alarmClockOneNoVacation() {
        //given
        int day = 1;
        boolean vacation = false;
        //when
        String clock = logicMethods.alarmClock(day, vacation);
        //then
        assertEquals("7:00", clock);
    }

    @Test
    void alarmClockZeroVacation(){
        //given
        int day = 0;
        boolean vacation = true;
        //when
        String clock = logicMethods.alarmClock(day, vacation);
        //then
        assertEquals("off", clock);
    }

    @Test
    void love6SixFourTest() {
        //given
        int a = 6;
        int b = 4;
        //when
        boolean isSixResult = logicMethods.love6(a, b);
        //then
        assertTrue(isSixResult);
    }

    @Test
    void love6MinusTwoMinusFourTest(){
        //given
        int a = -2;
        int b = -4;
        //when
        boolean isSixResult = logicMethods.love6(a, b);
        //then
        assertFalse(isSixResult);
    }

    @Test
    void in1To10FiveNoOutsideTest() {
        //given
        int n = 5;
        boolean outsideMode = false;
        //when
        boolean isIn1to10 = logicMethods.in1To10(n, outsideMode);
        //then
        assertTrue(isIn1to10);
    }

    @Test
    void in1To10MinusOneNoOutsideTest(){
        //given
        int n = -1;
        boolean outsideMode = false;
        //when
        boolean isIn1to10 = logicMethods.in1To10(n, outsideMode);
        //then
        assertFalse(isIn1to10);
    }

    @Test
    void specialElevenTwentyTwoTest() {
        //given
        int n = 22;
        //when
        boolean is11Divisible = logicMethods.specialEleven(n);
        //then
        assertTrue(is11Divisible);
    }

    @Test
    void specialElevenNineTest(){
        //given
        int n = 9;
        //when
        boolean is11Divisible = logicMethods.specialEleven(n);
        //then
        assertFalse(is11Divisible);
    }

    @Test
    void more20TwentyTest() {
        //given
        int n = 20;
        //when
        boolean isRest12 = logicMethods.more20(n);
        //then
        assertFalse(isRest12);
    }

    @Test
    void more20TwentyOneTest(){
        //given
        int n = 21;
        //when
        boolean isRest12 = logicMethods.more20(n);
        //then
        assertTrue(isRest12);
    }

    @Test
    void old35ThreeTest() {
        //given
        int n = 3;
        //when
        boolean isDivisible3or5 = logicMethods.old35(n);
        //then
        assertTrue(isDivisible3or5);
    }

    @Test
    void old35fifteenTest(){
        //given
        int n = 15;
        //when
        boolean isDivisible3or5 = logicMethods.old35(n);
        //then
        assertFalse(isDivisible3or5);
    }

    @Test
    void less20eighteenTest() {
        //given
        int n = 18;
        //when
        boolean isDivisible1819 = logicMethods.less20(n);
        //then
        assertTrue(isDivisible1819);
    }

    @Test
    void less20eightTest(){
        //given
        int n = 8;
        //when
        boolean isDivisible1819 = logicMethods.less20(n);
        //then
        assertFalse(isDivisible1819);
    }
}