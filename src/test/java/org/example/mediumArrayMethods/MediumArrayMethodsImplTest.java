package org.example.mediumArrayMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediumArrayMethodsImplTest {

    MediumArrayMethods mediumArrayMethods = new MediumArrayMethodsImpl();

    @Test
    void countEvensTwoTwoZeroTest() {
        //given
        int[] nums = {2,2,0};
        //when
        int result = mediumArrayMethods.countEvens(nums);
        //then
        assertEquals(3, result);
    }

    @Test
    void countEvensOneThreeFiveTest(){
        //given
        int[] nums = {1,3,5};
        //when
        int result = mediumArrayMethods.countEvens(nums);
        //then
        assertEquals(0, result);
    }

    @Test
    void bigDiffTenThreeFiveSixTest() {
        //given
        int[] nums = {10, 3, 5, 6};
        //when
        int result = mediumArrayMethods.bigDiff(nums);
        //then
        assertEquals(7, result);
    }

    @Test
    void bigDiffTwoThreeTest(){
        //given
        int[] nums = {2,3};
        //when
        int result = mediumArrayMethods.bigDiff(nums);
        //then
        assertEquals(1, result);
    }

    @Test
    void centeredAverageFourZeroHundredTest() {
        //given
        int[] nums = {4, 0, 100};
        //when
        int result = mediumArrayMethods.centeredAverage(nums);
        //then
        assertEquals(4, result);
    }

    @Test
    void centeredAverageOneSevenEightTest(){
        //given
        int[] nums = {1,7,8};
        //when
        int result = mediumArrayMethods.centeredAverage(nums);
        //then
        assertEquals(7, result);
    }

    @Test
    void sum13OneTwoTwoOneTest() {
        //given
        int[] nums = {1,2,2,1};
        //when
        int result = mediumArrayMethods.sum13(nums);
        //then
        assertEquals(6, result);
    }

    @Test
    void sum13ThirteenOneThirteenTest(){
        //given
        int[] nums = {13,1,13};
        //when
        int result = mediumArrayMethods.sum13(nums);
        //then
        assertEquals(0, result);
    }

    @Test
    void sum67OneTwoTwoTest() {
        //given
        int[] nums = {1,2,2};
        //when
        int result = mediumArrayMethods.sum67(nums);
        //then
        assertEquals(5, result);
    }

    @Test
    void sum67OneSixSevenSevenTest(){
        //given
        int[] nums = {1,6,7,7};
        //when
        int result = mediumArrayMethods.sum67(nums);
        //then
        assertEquals(8, result);
    }

    @Test
    void has22OneTwoTwoTest() {
        //given
        int[] nums = {1,2,2};
        //when
        boolean isTwoInRaw = mediumArrayMethods.has22(nums);
        //then
        assertTrue(isTwoInRaw);
    }

    @Test
    void has22OneThreeTwoTest(){
        //given
        int[] nums = {1,3,2};
        //when
        boolean isTwoInRaw = mediumArrayMethods.has22(nums);
        //then
        assertFalse(isTwoInRaw);
    }

    @Test
    void lucky13ZeroTwoFourTest() {
        //given
        int[] nums = {0, 2, 4};
        //when
        boolean is13InArray = mediumArrayMethods.lucky13(nums);
        //then
        assertTrue(is13InArray);
    }

    @Test
    void lucky13OneTwoThreeTest(){
        //given
        int[] nums = {1,2,3};
        //when
        boolean is13InArray = mediumArrayMethods.lucky13(nums);
        //then
        assertFalse(is13InArray);
    }
}