package org.example.mediumRecursionMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediumRecursionMethodsImplTest {

    MediumRecursionMethods mediumRecursionMethods = new MediumRecursionMethodsImpl();

    @Test
    void groupSumZeroAndTwoFourEightAndTenTest() {
        //given
        int start = 0;
        int[] nums = {2,4,8};
        int end = 10;
        //when
        boolean isStartAndEndInNumsSequence = mediumRecursionMethods.groupSum(start, nums, end);
        //then
        assertTrue(isStartAndEndInNumsSequence);
    }

    @Test
    void groupSumOneAndTwoFourEightAndTwoTest(){
        //given
        int start = 1;
        int[] nums = {2,4,8};
        int end = 2;
        //when
        boolean isStartAndEndInNumsSequence = mediumRecursionMethods.groupSum(start, nums, end);
        //then
        assertFalse(isStartAndEndInNumsSequence);
    }

    @Test
    void groupSum6ZeroAndFiveSixTwoAndEightTest() {
        //given
        int start = 0;
        int[] nums = {5,6,2};
        int target = 8;
        //when
        boolean isInRightSequence = mediumRecursionMethods.groupSum6(start, nums, target);
        //then
        assertTrue(isInRightSequence);
    }

    @Test
    void groupSum6ZeroAndFiveSixTwoAndNineTest(){
        //given
        int start = 0;
        int[] nums = {5,6,2};
        int target = 9;
        //when
        boolean isInRightSequence = mediumRecursionMethods.groupSum6(start, nums, target);
        //then
        assertFalse(isInRightSequence);
    }

    @Test
    void groupNoAdjZeroAndTwoFiveTenFourAndTwelveTest() {
        //given
        int start = 0;
        int[] nums = {2,5,10,4};
        int target = 12;
        //when
        boolean isElementsInNumsContainTarget = mediumRecursionMethods.groupNoAdj(start, nums, target);
        //then
        assertTrue(isElementsInNumsContainTarget);
    }

    @Test
    void groupNoAdjZeroAndTwoFiveTenFourAndFourteenTest(){
        //given
        int start = 0;
        int[] nums = {2,5,10,4};
        int target = 14;
        //when
        boolean isElementsInNumsContainTarget = mediumRecursionMethods.groupNoAdj(start, nums, target);
        //then
        assertFalse(isElementsInNumsContainTarget);
    }

    @Test
    void groupSum5ZeroAndTwoFiveTenFourAndNineteenTest() {
        //given
        int start = 0;
        int[] nums = {2,5,10,4};
        int target = 19;
        //when
        boolean isMultiplyOfFiveContainTarget = mediumRecursionMethods.groupSum5(start, nums, target);
        //then
        assertTrue(isMultiplyOfFiveContainTarget);
    }

    @Test
    void groupSum5ZeroAndThreeFiveOneAndFourTest(){
        //given
        int start = 0;
        int[] nums = {3,5,1};
        int target = 4;
        //when
        boolean isMultiplyOfFiveContainTarget = mediumRecursionMethods.groupSum5(start, nums, target);
        //then
        assertFalse(isMultiplyOfFiveContainTarget);
    }
}