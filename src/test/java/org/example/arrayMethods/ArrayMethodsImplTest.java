package org.example.arrayMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsImplTest {

    ArrayMethods arrayMethods = new ArrayMethodsImpl();

    @Test
    void oneTwoSixTest(){
        //given
        int[] nums = {1, 2, 6};
        //when
        boolean isSixContains = arrayMethods.firstLast6(nums);
        //then
        assertTrue(isSixContains);
    }

    @Test
    void threeSixOneTest(){
        //given
        int[] nums = {3, 6, 1};
        //when
        boolean isSixContains = arrayMethods.firstLast6(nums);
        //then
        assertFalse(isSixContains);
    }

    @Test
    void oneTwoThreeFourSixTest(){
        //given
        int[] nums = {1,2,3,4,6};
        //when
        boolean isSixContains = arrayMethods.firstLast6(nums);
        //then
        assertTrue(isSixContains);
    }

}