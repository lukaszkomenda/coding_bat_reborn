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

    @Test
    void piTest(){
        //given
        //when
        //then
        int[] pi = {3,1,4};
        assertArrayEquals(pi, arrayMethods.makePi());
    }

    @Test
    void commonEndOneTwoThreeSevenThreeTest() {
        //given
        int[] a = {1,2,3};
        int[] b = {7,3};
        //when
        boolean isCommonFrontOrEnd = arrayMethods.commonEnd(a, b);
        //then
        assertTrue(isCommonFrontOrEnd);
    }

    @Test
    void commonEndOneTwoThreeOneTest(){
        //given
        int[] a = {1,2,3};
        int[] b = {1};
        //when
        boolean isCommonFrontOrEnd = arrayMethods.commonEnd(a, b);
        //then
        assertTrue(isCommonFrontOrEnd);
    }

    @Test
    void sum3OneTwoThreeTest() {
        //given
        int[] nums = {1,2,3};
        //when
        int sum3 = arrayMethods.sum3(nums);
        //then
        assertEquals(6, sum3);
    }

    @Test
    void sum3FiveElevenTwoTest(){
        //given
        int[] nums = {5,11,2};
        //when
        int sum3 = arrayMethods.sum3(nums);
        //then
        assertEquals(18, sum3);
    }

    @Test
    void rotateLeft3OneTwoThreeTest() {
        //given
        int[] nums = {1,2,3};
        //when
        //then
        int[] expectedArray = {2,3,1};
        assertArrayEquals(expectedArray, arrayMethods.rotateLeft3(nums));
    }

    @Test
    void rotateLeft3SevenZeroZeroTest(){
        //given
        int[] nums = {7,0,0};
        //when
        int[] newOrder = arrayMethods.rotateLeft3(nums);
        //then
        int[] expectedArray = {0,0,7};
        assertArrayEquals(expectedArray,newOrder);
    }

    @Test
    void reverse3OneTwoThreeTest() {
        //given
        int[] nums = {1,2,3};
        //when
        int[] newOrder = arrayMethods.reverse3(nums);
        //then
        int[] expectedArray = {3,2,1};
        assertArrayEquals(expectedArray, newOrder);
    }

    @Test
    void reverse3TwoElevenThreeTest(){
        //given
        int[] nums = {2,11,3};
        //when
        int[] newOrder = arrayMethods.reverse3(nums);
        //then
        int[] expectedArray = {3,11,2};
        assertArrayEquals(expectedArray, newOrder);
    }

    @Test
    void maxEnd3OneTwoThreeTest() {
        //given
        int[] nums = {1,2,3};
        //when
        int[] newOrder = arrayMethods.maxEnd3(nums);
        //then
        int[] expectedArray = {3,3,3};
        assertArrayEquals(expectedArray, newOrder);
    }

    @Test
    void maxEnd3ThreeElevenElevenTest(){
        //given
        int[] nums = {3,11,11};
        //when
        int[] newOrder = arrayMethods.maxEnd3(nums);
        //then
        int[] expectedArray = {11,11,11};
        assertArrayEquals(expectedArray, newOrder);
    }

    @Test
    void sum2OneTwoThreeTest() {
        //given
        int[] nums ={1,2,3};
        //when
        int sum2 = arrayMethods.sum2(nums);
        //then
        assertEquals(3, sum2);
    }

    @Test
    void sum2OneTest(){
        //given
        int[] nums = {1};
        //when
        int sum2 = arrayMethods.sum2(nums);
        //then
        assertEquals(1, sum2);
    }

    @Test
    void middleWayOneTwoThreeFourFiveSix() {
        //given
        int[] a = {1,2,3};
        int[] b = {4,5,6};
        //when
        int[] newArray = arrayMethods.middleWay(a, b);
        //then
        int[] expectedArray = {2,5};
        assertArrayEquals(expectedArray,newArray);
    }

    @Test
    void middleWayTripleSevenThreeEightZeroTest(){
        //given
        int[] a = {7,7,7};
        int[] b = {3,8,0};
        //when
        int[] newArray = arrayMethods.middleWay(a, b);
        //then
        int[] expectedArray = {7,8};
        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    void makeEndsOneTwoThreeTest() {
        //given
        int[] nums = {1,2,3};
        //when
        int[] newArray = arrayMethods.makeEnds(nums);
        //then
        int[] expectedArray = {1,3};
        assertArrayEquals(expectedArray,newArray);
    }

    @Test
    void makeEndsSevenTest(){
        //given
        int[] nums = {7};
        //when
        int[] newArray = arrayMethods.makeEnds(nums);
        //then
        int[] expectedArray = {7,7};
        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    void has23TwoFiveTest() {
        //given
        int[] nums = {2,5};
        //when
        boolean is23Contains = arrayMethods.has23(nums);
        //then
        assertTrue(is23Contains);
    }

    @Test
    void has23DoubleSevenTest(){
        //given
        int[] nums = {7,7};
        //when
        boolean is23Contains = arrayMethods.has23(nums);
        //then
        assertFalse(is23Contains);
    }

    @Test
    void no23FourFiveTest() {
        //given
        int[] nums = {4,5};
        //when
        boolean is23NoContains = arrayMethods.no23(nums);
        //then
        assertTrue(is23NoContains);
    }

    @Test
    void no23FourTwoTest(){
        //given
        int[] nums = {4,2};
        //when
        boolean is23NoContains = arrayMethods.no23(nums);
        //then
        assertFalse(is23NoContains);
    }

    @Test
    void makeLastOneTwoTest() {
        //given
        int[] nums = {1,2};
        //when
        int[] newArray = arrayMethods.makeLast(nums);
        //then
        int[] expectedArray = {0,0,0,2};
        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    void makeLastZeroTest(){
        //given
        int[] nums = {0};
        //when
        int[] newArray = arrayMethods.makeLast(nums);
        //then
        int[] expectedArray = {0,0};
        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    void double23DoubleTwoTest() {
        //given
        int[] nums = {2,2};
        //when
        boolean isDouble23Contains = arrayMethods.double23(nums);
        //then
        assertTrue(isDouble23Contains);
    }

    @Test
    void double23TwoThreeTest(){
        //given
        int[] nums = {2,3};
        //when
        boolean isDouble23Contains = arrayMethods.double23(nums);
        //then
        assertFalse(isDouble23Contains);
    }

    @Test
    void fix23OneTwoThreeTest() {
        //given
        int[] nums = {1,2,3};
        //when
        int[] newArray = arrayMethods.fix23(nums);
        //then
        int[] expectedArray = {1,2,0};
        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    void fix23OneTwoOneTest(){
        //given
        int[] nums = {1,2,1};
        //when
        int[] newArray = arrayMethods.fix23(nums);
        //then
        int[] expectedArray = {1,2,1};
        assertArrayEquals(expectedArray,newArray);
    }

    @Test
    void start1OneTwoThreeAndOneThreeTest() {
        //given
        int[] a = {1,2,3};
        int[] b = {1,3};
        //when
        int count1 = arrayMethods.start1(a, b);
        //then
        assertEquals(2, count1);
    }

    @Test
    void start1NoneOneTwoTest(){
        //given
        int[] a = {};
        int[] b = {1,2};
        //when
        int count1 = arrayMethods.start1(a, b);
        //then
        assertEquals(1, count1);
    }

    @Test
    void biggerTwoOneTwoAndThreeFourTest() {
        //given
        int[] a = {1,2};
        int[] b = {3,4};
        //when
        int[] biggerArray = arrayMethods.biggerTwo(a, b);
        //then
        int[] expectedArray = {3,4};
        assertArrayEquals(expectedArray,biggerArray);
    }

    @Test
    void biggerTwoDoubleTwoAndOneThreeTest(){
        //given
        int[] a = {2,2};
        int[] b = {1,3};
        //when
        int[] biggerArray = arrayMethods.biggerTwo(a, b);
        //then
        int[] expectedArray = {2,2};
        assertArrayEquals(expectedArray,biggerArray);
    }

    @Test
    void makeMiddleOneTwoThreeFourTest() {
        //given
        int[] nums = {1,2,3,4};
        //when
        int[] newArray = arrayMethods.makeMiddle(nums);
        //then
        int[] expectedArray = {2,3};
        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    void makeMiddleOneTwoTest(){
        //given
        int[] nums = {1,2};
        //when
        int[] newArray = arrayMethods.makeMiddle(nums);
        //then
        int[] expectedArray = {1,2};
        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    void plusTwoOneTwoThreeFourTest() {
        //given
        int[] a = {1,2};
        int[] b = {3,4};
        //when
        int[] newArray = arrayMethods.plusTwo(a, b);
        //then
        int[] expectedArray = {1,2,3,4};
        assertArrayEquals(expectedArray,newArray);
    }

    @Test
    void plusTwoDoubleFourDoubleTwoTest(){
        //given
        int[] a = {4,4};
        int[] b = {2,2};
        //when
        int[] newArray = arrayMethods.plusTwo(a, b);
        //then
        int[] expectedArray = {4,4,2,2};
        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    void swapEndsOneTwoThreeFourTest() {
        //given
        int[] nums = {1,2,3,4};
        //when
        int[] swappedNums = arrayMethods.swapEnds(nums);
        //then
        int[] expectedArray = {4,2,3,1};
        assertArrayEquals(expectedArray, swappedNums);
    }

    @Test
    void swapEndsOneTest(){
        //given
        int[] nums = {1};
        //when
        int[] swappedNums = arrayMethods.swapEnds(nums);
        //then
        int[] expectedArray = {1};
        assertArrayEquals(expectedArray, swappedNums);
    }
}