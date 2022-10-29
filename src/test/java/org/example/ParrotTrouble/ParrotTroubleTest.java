package org.example.ParrotTrouble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParrotTroubleTest {

    ParrotTrouble parrotTrouble = new ParrotTrouble();

    @Test
    void loudSixTest() {
        //given
        boolean talking = true;
        int hour = 6;
        //when
        boolean isTrouble = parrotTrouble.parrotTrouble(talking, hour);
        //then
        assertTrue(isTrouble);
    }

    @Test
    void loudSevenTest() {
        //given
        boolean talking = true;
        int hour = 7;
        //when
        boolean isTrouble = parrotTrouble.parrotTrouble(talking, hour);
        //then
        assertFalse(isTrouble);
    }

    @Test
    void noLoudSixTest() {
        //given
        boolean talking = false;
        int hour = 6;
        //when
        boolean isTrouble = parrotTrouble.parrotTrouble(talking, hour);
        //then
        assertFalse(isTrouble);
    }

    @Test
    void loudTwentyOneTest() {
        //given
        boolean talking = true;
        int hour = 21;
        //when
        boolean isTrouble = parrotTrouble.parrotTrouble(talking, hour);
        //then
        assertTrue(isTrouble);
    }

    @Test
    void noLoudTwentyOneTest() {
        //given
        boolean talking = false;
        int hour = 21;
        //when
        boolean isTrouble = parrotTrouble.parrotTrouble(talking, hour);
        //then
        assertFalse(isTrouble);
    }

    @Test
    void noLoudTwentyTest() {
        //given
        boolean talking = false;
        int hour = 20;
        //when
        boolean isTrouble = parrotTrouble.parrotTrouble(talking, hour);
        //then
        assertFalse(isTrouble);
    }

    @Test
    void loudTwentyThreeTest() {
        //given
        boolean talking = true;
        int hour = 23;
        //when
        boolean isTrouble = parrotTrouble.parrotTrouble(talking, hour);
        //then
        assertTrue(isTrouble);
    }

    @Test
    void noLoudTwentyThreeTest() {
        //given
        boolean talking = false;
        int hour = 23;
        //when
        boolean isTrouble = parrotTrouble.parrotTrouble(talking, hour);
        //then
        assertFalse(isTrouble);
    }

    @Test
    void loudTwentyTest() {
        //given
        boolean talking = true;
        int hour = 20;
        //when
        boolean isTrouble = parrotTrouble.parrotTrouble(talking, hour);
        //then
        assertFalse(isTrouble);
    }

    @Test
    void noLoudTwelveTest() {
        //given
        boolean talking = false;
        int hour = 12;
        //when
        boolean isTrouble = parrotTrouble.parrotTrouble(talking, hour);
        //then
        assertFalse(isTrouble);
    }

}