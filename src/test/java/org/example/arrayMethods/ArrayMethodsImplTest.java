package org.example.arrayMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsImplTest {

    ArrayMethods arrayMethods = new ArrayMethodsImpl();

    //firstLast6Tests
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

    //sameFirstLastTests
    @Test
    void oneTwoOneTest() {
        //given
        int[] nums = {1,2,1};
        //when
        boolean isFirstAndLastSame = arrayMethods.sameFirstLast(nums);
        //then
        assertTrue(isFirstAndLastSame);
    }

    @Test
    void sevenTest(){
        //given
        int[] nums = {7};
        //when
        boolean isFirstAndLastSame = arrayMethods.sameFirstLast(nums);
        //then
        assertTrue(isFirstAndLastSame);
    }

    @Test
    void noneTest(){
        //given
        int[] nums = {0};
        //when
        boolean isFirstAndLastSame = arrayMethods.sameFirstLast(nums);
        //then
        assertTrue(isFirstAndLastSame);
    }
}