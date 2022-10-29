package org.example.SleepIn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SleepInTest {

    SleepIn sleepIn = new SleepIn();

    @Test
    void noWeekdayNoVacationTest() {
        //given
        boolean weekday = false;
        boolean vacation = false;
        //when
        //then
        assertTrue(sleepIn.sleepIn(weekday, vacation));
    }

    @Test
    void weekdayNoVacationTest() {
        //given
        boolean weekday = true;
        boolean vacation = false;
        //when
        //then
        assertFalse(sleepIn.sleepIn(weekday, vacation));
    }

    @Test
    void noWeekdayVacationTest() {
        //given
        boolean weekday = false;
        boolean vacation = true;
        //when
        //then
        assertTrue(sleepIn.sleepIn(weekday, vacation));
    }

    @Test
    void weekdayVacationTest() {
        //given
        boolean weekday = true;
        boolean vacation = true;
        //when
        //then
        assertTrue(sleepIn.sleepIn(weekday, vacation));
    }

}