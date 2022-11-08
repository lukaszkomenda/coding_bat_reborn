package org.example.ArrayCount9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCount9Test {

    ArrayCount9 arrayCount9 = new ArrayCount9();

    @Test
    void oneTwoNineTest(){
        //given
        int[] nums = {1,2,9};
        //when
        int count9 = arrayCount9.arrayCount9(nums);
        //then
        assertEquals(1, count9);
    }

    @Test
    void oneNineNineThreeNineTest(){
        //given
        int[] nums = {1,9,9,3,9};
        //when
        int count9 = arrayCount9.arrayCount9(nums);
        //then
        assertEquals(3,count9);
    }

    @Test
    void noneTest(){
        //given
        int[] nums = {};
        //when
        int count9 = arrayCount9.arrayCount9(nums);
        //then
        assertEquals(0,count9);
    }

}