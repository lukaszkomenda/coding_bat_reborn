package org.example.hardArrayMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HardArrayMethodsImplTest {

    HardArrayMethods hardArrayMethods = new HardArrayMethodsImpl();

    @Test
    void maxSpanOneTwoDoubleOneThreeTest() {
        //given
        int[] nums = {1,2,1,1,3};
        //when
        int result = hardArrayMethods.maxSpan(nums);
        //then
        assertEquals(4, result);
    }

    @Test
    void maxSpanThreeNineTest(){
        //given
        int[] nums = {3,9};
        //when
        int result = hardArrayMethods.maxSpan(nums);
        //then
        assertEquals(1, result);
    }
}