package org.example.Array667;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array667Test {

    Array667 array667 = new Array667();

    @Test
    void sixSixTwoTest(){
        //given
        int[] nums = {6,6,2};
        //when
        int counter = array667.array667(nums);
        //then
        assertEquals(1, counter);
    }

    @Test
    void sixSixTwoSixSevenTest(){
        //given
        int[] nums = {6,6,2,6,7};
        //when
        int counter = array667.array667(nums);
        //then
        assertEquals(2,counter);
    }

    @Test
    void noneTest(){
        //given
        int[] nums = {};
        //when
        int counter = array667.array667(nums);
        //then
        assertEquals(0,counter);
    }

}