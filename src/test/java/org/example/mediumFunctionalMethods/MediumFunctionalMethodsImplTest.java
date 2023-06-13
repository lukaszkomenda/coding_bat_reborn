package org.example.mediumFunctionalMethods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class MediumFunctionalMethodsImplTest {

    MediumFunctionalMethods mediumFunctionalMethods = new MediumFunctionalMethodsImpl();

    @Test
    void noNegOneMinusTwoTest() {
        //given
        List<Integer> nums = Arrays.asList(1, -2);
        //when
        List<Integer> newList = mediumFunctionalMethods.noNeg(nums);
        //then
        List<Integer> expectedList = List.of(1);
        Assertions.assertArrayEquals(expectedList.toArray(), newList.toArray());
    }

    @Test
    void noNegDoubleMinusThreeDoubleThreeTest(){
        //given
        List<Integer> nums = Arrays.asList(-3, -3, 3, 3);
        //when
        List<Integer> newList = mediumFunctionalMethods.noNeg(nums);
        //then
        List<Integer> expectedList = Arrays.asList(3, 3);
        Assertions.assertArrayEquals(expectedList.toArray(), newList.toArray());
    }

    @Test
    void no9OneTwoNineteenTest() {
        //given
        List<Integer> nums = Arrays.asList(1, 2, 19);
        //when
        List<Integer> newList = mediumFunctionalMethods.no9(nums);
        //then
        List<Integer> expectedList = Arrays.asList(1, 2);
        Assertions.assertArrayEquals(expectedList.toArray(), newList.toArray());
    }

    @Test
    void no9ZeroNineZeroTest(){
        //given
        List<Integer> nums = Arrays.asList(0, 9, 0);
        //when
        List<Integer> newList = mediumFunctionalMethods.no9(nums);
        //then
        List<Integer> expectedList = Arrays.asList(0,0);
        Assertions.assertArrayEquals(expectedList.toArray(), newList.toArray());
    }
}