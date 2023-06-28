package org.example.ArrayFront9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayFront9Test {

    ArrayFront9 arrayFront9 = new ArrayFront9();

    @Test
    void oneTwoNineThreeFourTest(){
        //given
        int[] nums = {1,2,9,3,4};
        //when
        boolean isNineInFront = arrayFront9.arrayFront9(nums);
        //then
        assertTrue(isNineInFront);
    }

    @Test
    void nineTwoThreeTest(){
        //given
        int[] nums = {9,2,3};
        //when
        boolean isNineInFront = arrayFront9.arrayFront9(nums);
        //then
        assertTrue(isNineInFront);
    }

    @Test
    void noneTest(){
        //given
        int[] nums = {};
        //when
        boolean isNineInFront = arrayFront9.arrayFront9(nums);
        //then
        assertFalse(isNineInFront);
    }

}