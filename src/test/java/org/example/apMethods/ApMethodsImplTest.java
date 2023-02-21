package org.example.apMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApMethodsImplTest {

    ApMethods apMethods = new ApMethodsImpl();

    @Test
    void scoresIncreasingOneThreeFourTest() {
        //given
        int[] nums = {1,3,4};
        //when
        boolean isIncreasing = apMethods.scoresIncreasing(nums);
        //then
        assertTrue(isIncreasing);
    }

    @Test
    void scoresIncreasingOneThreeTwoTest(){
        //given
        int[] nums = {1,3,2};
        //when
        boolean isIncreasing = apMethods.scoresIncreasing(nums);
        //then
        assertFalse(isIncreasing);
    }

    @Test
    void scores100OneDoubleHundredTest() {
        //given
        int[] nums = {1,100, 100};
        //when
        boolean isHundredNextTo = apMethods.scores100(nums);
        //then
        assertTrue(isHundredNextTo);
    }

    @Test
    void scores100HundredOneHundredOneTest(){
        //given
        int[] nums = {100, 1, 100, 1};
        //when
        boolean isHundredNextTo = apMethods.scores100(nums);
        //then
        assertFalse(isHundredNextTo);
    }

    @Test
    void scoresClumpThreeFourFiveTest() {
        //given
        int[] nums = {3,4,5};
        //when
        boolean isIncreasingByTwo = apMethods.scoresClump(nums);
        //then
        assertTrue(isIncreasingByTwo);
    }

    @Test
    void scoresClumpThreeFourSixTest(){
        //given
        int[] nums = {3,4,6};
        //when
        boolean isIncreasingByTwo = apMethods.scoresClump(nums);
        //then
        assertFalse(isIncreasingByTwo);
    }
}