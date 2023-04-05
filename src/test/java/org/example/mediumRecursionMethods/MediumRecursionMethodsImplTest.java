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
}