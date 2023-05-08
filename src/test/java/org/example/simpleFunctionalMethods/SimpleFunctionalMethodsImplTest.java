package org.example.simpleFunctionalMethods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class SimpleFunctionalMethodsImplTest {

    SimpleFunctionalMethods simpleFunctionalMethods = new SimpleFunctionalMethodsImpl();

    @Test
    void doublingOneTwoThreeTest() {
        //given
        List<Integer> nums = Arrays.asList(1, 2, 3);
        //when
        List<Integer> newList = simpleFunctionalMethods.doubling(nums);
        //then
        List<Integer> expectedList = Arrays.asList(2, 4, 6);
        Assertions.assertArrayEquals(expectedList.toArray(), newList.toArray());
    }

    @Test
    void doublingFiveTenTest(){
        //given
        List<Integer> nums = Arrays.asList(5, 10);
        //when
        List<Integer> newList = simpleFunctionalMethods.doubling(nums);
        //then
        List<Integer> expectedList = Arrays.asList(10,20);
        Assertions.assertArrayEquals(expectedList.toArray(), newList.toArray());
    }

    @Test
    void squareOneTwoThreeTest() {
        //given
        List<Integer> nums = Arrays.asList(1,2,3);
        //when
        List<Integer> newList = simpleFunctionalMethods.square(nums);
        //then
        List<Integer> expectedList = Arrays.asList(1,4,9);
        Assertions.assertArrayEquals(expectedList.toArray(), newList.toArray());
    }

    @Test
    void squereTwelveTest(){
        //given
        List<Integer> nums = List.of(12);
        //when
        List<Integer> newList = simpleFunctionalMethods.square(nums);
        //then
        List<Integer> expectedList = List.of(144);
        Assertions.assertArrayEquals(expectedList.toArray(), newList.toArray());
    }
}