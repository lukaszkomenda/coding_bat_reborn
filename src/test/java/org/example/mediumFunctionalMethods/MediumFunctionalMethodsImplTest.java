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
}