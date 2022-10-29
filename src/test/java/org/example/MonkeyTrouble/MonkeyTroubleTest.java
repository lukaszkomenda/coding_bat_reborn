package org.example.MonkeyTrouble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonkeyTroubleTest {

    MonkeyTrouble monkeyTrouble = new MonkeyTrouble();

    @Test
    void isTwoMonkeysSmileTest() {
        //given
        boolean aSmile = true;
        boolean bSmile = true;
        //when
        //then
        assertTrue(monkeyTrouble.monkeyTrouble(aSmile, bSmile));
    }

    @Test
    void isTwoMonkeysDontSmileTest() {
        //given
        boolean aSmile = false;
        boolean bSmile = false;
        //when
        //then
        assertTrue(monkeyTrouble.monkeyTrouble(aSmile, bSmile));
    }

    @Test
    void isAMonkeySmileAndBMonkeyDontTest() {
        //given
        boolean aSmile = true;
        boolean bSmile = false;
        //when
        //then
        assertFalse(monkeyTrouble.monkeyTrouble(aSmile,bSmile));
    }

    @Test
    void isAMonkeyDontSmileAndBMonkeySmileTest() {
        //given
        boolean aSmile = false;
        boolean bSmile = true;
        //when
        //then
        assertFalse(monkeyTrouble.monkeyTrouble(aSmile,bSmile));
    }

}