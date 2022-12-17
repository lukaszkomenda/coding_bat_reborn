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

    @Test
    void nearTenTwelveTest() {
        //given
        int num = 12;
        //when
        boolean isNear10 = logicMethods.nearTen(num);
        //then
        assertTrue(isNear10);
    }

    @Test
    void nearTenSixTest(){
        //given
        int num = 6;
        //when
        boolean isNear10 = logicMethods.nearTen(num);
        //then
        assertFalse(isNear10);
    }

    @Test
    void teenSumThreeFourTest() {
        //given
        int a = 3;
        int b = 4;
        //when
        int teenSum = logicMethods.teenSum(a, b);
        //then
        assertEquals(7, teenSum);
    }

    @Test
    void teenSumThreeNineteenTest(){
        //given
        int a = 3;
        int b = 19;
        //when
        int teenSum = logicMethods.teenSum(a, b);
        //then
        assertEquals(19, teenSum);
    }

    @Test
    void answerCellNoMorningNoMumNoAsleepTest() {
        //given
        boolean isMorning = false;
        boolean isMum = false;
        boolean isAsleep = false;
        //when
        boolean makeCall = logicMethods.answerCell(isMorning, isMum, isAsleep);
        //then
        assertTrue(makeCall);
    }

    @Test
    void answerCellNoMorningNoMumAsleepTest(){
        //given
        boolean isMorning = false;
        boolean isMum = false;
        boolean isAsleep = true;
        //when
        boolean makeCall = logicMethods.answerCell(isMorning, isMum, isAsleep);
        //then
        assertFalse(makeCall);
    }

    @Test
    void teaPartySixEightTest() {
        //given
        int tea = 6;
        int candy = 8;
        //when
        int partyRate = logicMethods.teaParty(tea, candy);
        //then
        assertEquals(1 ,partyRate);
    }

    @Test
    void teaPartyThreeEightTest(){
        //given
        int tea = 3;
        int candy = 8;
        //when
        int partyRate = logicMethods.teaParty(tea, candy);
        //then
        assertEquals(0, partyRate);
    }

    @Test
    void fizzStringFigTest() {
        //given
        String str = "fig";
        //when
        String newStr = logicMethods.fizzString(str);
        //then
        assertEquals("Fizz", newStr);
    }

    @Test
    void fizzStringFooobTest(){
        //given
        String str = "fooob";
        //when
        String newStr = logicMethods.fizzString(str);
        //then
        assertEquals("FizzBuzz", newStr);
    }

    @Test
    void twoAsOneOneTwoThreeTest() {
        //given
        int a = 1;
        int b = 2;
        int c = 3;
        //when
        boolean isSumEachOther = logicMethods.twoAsOne(a, b, c);
        //then
        assertTrue(isSumEachOther);
    }

    @Test
    void twoAsOneThreeDoubleTwoTest(){
        //given
        int a = 3;
        int b = 2;
        int c = 2;
        //when
        boolean isSumEachOther = logicMethods.twoAsOne(a, b, c);
        //then
        assertFalse(isSumEachOther);
    }

    @Test
    void inOrderOneTwoFourBNoOkTest() {
        //given
        int a = 1;
        int b = 2;
        int c = 4;
        boolean bOk = false;
        //when
        boolean isOk = logicMethods.inOrder(a, b, c, bOk);
        //then
        assertTrue(isOk);
    }

    @Test
    void inOrderOneTwoOneBNoOkTest(){
        //given
        int a = 1;
        int b = 2;
        int c = 1;
        boolean bOk = false;
        //when
        boolean isOk = logicMethods.inOrder(a, b, c, bOk);
        //then
        assertFalse(isOk);
    }

    @Test
    void inOrderEqualTwoFiveElevenNoEqualModeTest() {
        //given
        int a = 2;
        int b = 5;
        int c = 11;
        boolean equalMode = false;
        //when
        boolean isOk = logicMethods.inOrderEqual(a, b, c, equalMode);
        //then
        assertTrue(isOk);
    }

    @Test
    void inOrderFiveSevenSixNoEqualModeTest(){
        //given
        int a = 5;
        int b = 7;
        int c = 6;
        boolean equalMode = false;
        //when
        boolean isOk = logicMethods.inOrderEqual(a, b, c, equalMode);
        //then
        assertFalse(isOk);
    }

    @Test
    void lastDigitOneTwoThreeTest() {
        //given
        int a = 1;
        int b = 2;
        int c = 3;
        //when
        boolean isLastDigitSame = logicMethods.lastDigit(a, b, c);
        //then
        assertFalse(isLastDigitSame);
    }

    @Test
    void lastDigitTenElevenTwentyTest(){
        //given
        int a = 10;
        int b = 11;
        int c = 20;
        //when
        boolean isLastDigitSame = logicMethods.lastDigit(a, b, c);
        //then
        assertTrue(isLastDigitSame);
    }

    @Test
    void lessBy10OneSevenElevenTest() {
        //given
        int a = 1;
        int b = 7;
        int c = 11;
        //when
        boolean isLessThan10 = logicMethods.lessBy10(a, b, c);
        //then
        assertTrue(isLessThan10);
    }

    @Test
    void lessBy10OneSevenTen(){
        //given
        int a = 1;
        int b = 7;
        int c = 10;
        //when
        boolean isLessThan10 = logicMethods.lessBy10(a, b, c);
        //then
        assertFalse(isLessThan10);
    }
}