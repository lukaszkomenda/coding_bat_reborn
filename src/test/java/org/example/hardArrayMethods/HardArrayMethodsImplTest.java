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

    @Test
    void fix34OneThreeOneFourTest() {
        //given
        int[] nums = {1, 3, 1, 4};
        //when
        int[] newArray = hardArrayMethods.fix34(nums);
        //then
        int[] expectedArray = {1, 3, 4, 1};
        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    void fix34ThreeOneFourTest(){
        //given
        int[] nums = {3,1,4};
        //when
        int[] newArray = hardArrayMethods.fix34(nums);
        //then
        int[] expectedArray = {3, 4, 1};
        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    void fix45FiveFourOneTest() {
        //given
        int[] nums = {5,4,1};
        //when
        int[] newArray = hardArrayMethods.fix45(nums);
        //then
        int[] expectedArray = {1, 4, 5};
        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    void fix45FourOneFiveTest(){
        //given
        int[] nums = {4,1,5};
        //when
        int[] newArray = hardArrayMethods.fix45(nums);
        //then
        int[] expectedArray = {4,5,1};
        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    void canBalanceTripleOneTwoOneTest() {
        //given
        int[] nums = {1,1,1,2,1};
        //when
        boolean isLeftEqualRight = hardArrayMethods.canBalance(nums);
        //then
        assertTrue(isLeftEqualRight);
    }

    @Test
    void canBalanceOneTest(){
        //given
        int[] nums = {1};
        //when
        boolean isLeftEqualRight = hardArrayMethods.canBalance(nums);
        //then
        assertFalse(isLeftEqualRight);
    }

    @Test
    void linearInOneTwoFourSixAndTwoFourTest() {
        //given
        int[] outer = {1,2,4,6};
        int[] inner = {2,4};
        //when
        boolean isInnerIncludeOuter = hardArrayMethods.linearIn(outer, inner);
        //then
        assertTrue(isInnerIncludeOuter);
    }

    @Test
    void linearInOneTwoThreeAndMinusOneTest(){
        //given
        int[] outer = {1,2,3};
        int[] inner = {-1};
        //when
        boolean isInnerIncludeOuter = hardArrayMethods.linearIn(outer, inner);
        //then
        assertFalse(isInnerIncludeOuter);
    }

    @Test
    void squareUpTwoTest() {
        //given
        int n = 2;
        //when
        int[] array = hardArrayMethods.squareUp(n);
        //then
        int[] expectedArray = {0, 1, 2, 1};
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void squareUpOneTest(){
        //given
        int n = 1;
        //when
        int[] array = hardArrayMethods.squareUp(n);
        //then
        int[] expectedArray = {1};
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void seriesUpThreeTest() {
        //given
        int n = 3;
        //when
        int[] array = hardArrayMethods.seriesUp(n);
        //then
        int[] expectedArray = {1, 1, 2, 1, 2, 3};
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void seriesUpTwoTest(){
        //given
        int n = 2;
        //when
        int[] array = hardArrayMethods.seriesUp(n);
        //then
        int[] expectedArray = {1, 1, 2};
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void maxMirrorOneTwoOneFourTest() {
        //given
        int[] nums = {1,2,1,4};
        //when
        int result = hardArrayMethods.maxMirror(nums);
        //then
        assertEquals(3, result);
    }

    @Test
    void maxMirrorOneTwoThreeTwoOneTest(){
        //given
        int[] nums = {1,2,3,2,1};
        //when
        int result = hardArrayMethods.maxMirror(nums);
        //then
        assertEquals(5, result);
    }

    @Test
    void countClumpsDoubleOneTwoDoubleOne() {
        //given
        int[] nums = {1,1,2,1,1};
        //when
        int result = hardArrayMethods.countClumps(nums);
        //then
        assertEquals(2, result);
    }

    @Test
    void countClumpsOneTwoThreeTest(){
        //given
        int[] nums = {1,2,3};
        //when
        int result = hardArrayMethods.countClumps(nums);
        //then
        assertEquals(0, result);
    }
}