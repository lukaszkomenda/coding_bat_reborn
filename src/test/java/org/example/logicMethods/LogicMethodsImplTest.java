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
}