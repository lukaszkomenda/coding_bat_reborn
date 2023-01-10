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
}