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

    @Test
    void addStarAbbcccTest() {
        //given
        List<String> strings = Arrays.asList("a", "bb", "ccc");
        //when
        List<String> newList = simpleFunctionalMethods.addStar(strings);
        //then
        List<String> expectedList = Arrays.asList("a*", "bb*", "ccc*");
        Assertions.assertArrayEquals(expectedList.toArray(), newList.toArray());
    }

    @Test
    void addStarHelloThereTest(){
        //given
        List<String> strings = Arrays.asList("hello", "there");
        //when
        List<String> newList = simpleFunctionalMethods.addStar(strings);
        //then
        List<String> expectedList = Arrays.asList("hello*", "there*");
        Assertions.assertArrayEquals(expectedList.toArray(), newList.toArray());
    }

    @Test
    void copies3AbbcccTest() {
        //given
        List<String> strings = Arrays.asList("a", "bb", "ccc");
        //when
        List<String> newList = simpleFunctionalMethods.copies3(strings);
        //then
        List<String> expectedList = Arrays.asList("aaa", "bbbbbb", "ccccccccc");
        Assertions.assertArrayEquals(expectedList.toArray(), newList.toArray());
    }

    @Test
    void copies3HelloThereTest(){
        //given
        List<String> strings = Arrays.asList("hello", "there");
        //when
        List<String> newList = simpleFunctionalMethods.copies3(strings);
        //then
        List<String> expectedList = Arrays.asList("hellohellohello", "theretherethere");
        Assertions.assertArrayEquals(expectedList.toArray(), newList.toArray());
    }

    @Test
    void moreYAbcTest() {
        //given
        List<String> strings = Arrays.asList("a", "b", "c");
        //when
        List<String> newList = simpleFunctionalMethods.moreY(strings);
        //then
        List<String> expectedList = Arrays.asList("yay", "yby", "ycy");
        Assertions.assertArrayEquals(expectedList.toArray(), newList.toArray());
    }

    @Test
    void moreYHelloThereTest(){
        //given
        List<String> strings = Arrays.asList("hello", "there");
        //when
        List<String> newList = simpleFunctionalMethods.moreY(strings);
        //then
        List<String> expectedList = Arrays.asList("yhelloy", "ytherey");
        Assertions.assertArrayEquals(expectedList.toArray(), newList.toArray());
    }

    @Test
    void math1OneTwoThreeTest() {
        //given
        List<Integer> nums = Arrays.asList(1,2,3);
        //when
        List<Integer> newList = simpleFunctionalMethods.math1(nums);
        //then
        List<Integer> expectedList = Arrays.asList(20, 30, 40);
        Assertions.assertArrayEquals(expectedList.toArray(), newList.toArray());
    }

    @Test
    void math1SixEightSixEightOneTest(){
        //given
        List<Integer> nums = Arrays.asList(6,8,6,8,1);
        //when
        List<Integer> newList = simpleFunctionalMethods.math1(nums);
        //then
        List<Integer> expectedList = Arrays.asList(70, 90, 70, 90, 20);
        Assertions.assertArrayEquals(expectedList.toArray(), newList.toArray());
    }

    @Test
    void rightDigitFiveTenTest() {
        //given
        List<Integer> nums = Arrays.asList(5,10);
        //when
        List<Integer> newList = simpleFunctionalMethods.rightDigit(nums);
        //then
        List<Integer> expectedList = Arrays.asList(5, 0);
        Assertions.assertArrayEquals(expectedList.toArray(), newList.toArray());
    }

    @Test
    void rightDigitOneTwentyTwoNinetyThreeTest(){
        //given
        List<Integer> nums = Arrays.asList(1,22,93);
        //when
        List<Integer> newList = simpleFunctionalMethods.rightDigit(nums);
        //then
        List<Integer> expectedList = Arrays.asList(1,2,3);
        Assertions.assertArrayEquals(expectedList.toArray(), newList.toArray());
    }

    @Test
    void lowerHelloHiTest() {
        //given
        List<String> strings = Arrays.asList("Hello", "Hi");
        //when
        List<String> newList = simpleFunctionalMethods.lower(strings);
        //then
        List<String> expectedList = Arrays.asList("hello", "hi");
        Assertions.assertArrayEquals(expectedList.toArray(), newList.toArray());
    }

    @Test
    void lowerAaaBbbCccTest(){
        //given
        List<String> strings = Arrays.asList("AAA", "BBB", "ccc");
        //when
        List<String> newList = simpleFunctionalMethods.lower(strings);
        //then
        List<String> expectedList = Arrays.asList("aaa", "bbb", "ccc");
        Assertions.assertArrayEquals(expectedList.toArray(), newList.toArray());
    }

    @Test
    void noXAxBbCxTest() {
        //given
        List<String> strings = Arrays.asList("ax", "bb", "cx");
        //when
        List<String> newList = simpleFunctionalMethods.noX(strings);
        //then
        List<String> expectedList = Arrays.asList("a", "bb", "c");
        Assertions.assertArrayEquals(expectedList.toArray(), newList.toArray());
    }

    @Test
    void noXTheTaxiTest(){
        //given
        List<String> strings = Arrays.asList("the", "taxi");
        //when
        List<String> newList = simpleFunctionalMethods.noX(strings);
        //then
        List<String> expectedList = Arrays.asList("the", "tai");
        Assertions.assertArrayEquals(expectedList.toArray(), newList.toArray());
    }
}