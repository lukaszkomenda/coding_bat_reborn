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

    @Test
    void sum28TwoThreeDoubleTwoFourTwoTest() {
        //given
        int[] nums = {2,3,2,2,4,2};
        //when
        boolean isEqualEight = mediumArrayMethods.sum28(nums);
        //then
        assertTrue(isEqualEight);
    }

    @Test
    void sum28OneTwoThreeFourTest(){
        //given
        int[] nums = {1,2,3,4};
        //when
        boolean isEqualEight = mediumArrayMethods.sum28(nums);
        //then
        assertFalse(isEqualEight);
    }

    @Test
    void more14OneFourOneTest() {
        //given
        int[] nums = {1,4,1};
        //when
        boolean is4MoreThan1 = mediumArrayMethods.more14(nums);
        //then
        assertTrue(is4MoreThan1);
    }

    @Test
    void more14OneFourTest(){
        //given
        int[] nums = {1,4};
        //when
        boolean is4MoreThan1 = mediumArrayMethods.more14(nums);
        //then
        assertFalse(is4MoreThan1);
    }

    @Test
    void fizzArrayZeroTest() {
        //given
        int n = 0;
        //when
        int[] array = mediumArrayMethods.fizzArray(n);
        //then
        int[] expectedArray = new int[0];
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void fizzArrayTwoTest(){
        //given
        int n = 2;
        //when
        int[] array = mediumArrayMethods.fizzArray(n);
        //then
        int[] expectedArray = {0,1};
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void only14OneFourOneFourTest() {
        //given
        int[] nums = {1,4,1,4};
        //when
        boolean isOnly14 = mediumArrayMethods.only14(nums);
        //then
        assertTrue(isOnly14);
    }

    @Test
    void only14TwoTest(){
        //given
        int[] nums = {2};
        //when
        boolean isOnly14 = mediumArrayMethods.only14(nums);
        //then
        assertFalse(isOnly14);
    }

    @Test
    void fizzArray2FourTest() {
        //given
        int n = 4;
        //when
        String[] array = mediumArrayMethods.fizzArray2(n);
        //then
        String[] expectedArray = {"0", "1", "2", "3"};
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void fizzArray2ZeroTest(){
        //given
        int n = 0;
        //when
        String[] array2 = mediumArrayMethods.fizzArray2(n);
        //then
        String[] expectedArray = new String[0];
        assertArrayEquals(expectedArray, array2);
    }

    @Test
    void no14OneTwoThreeTest() {
        //given
        int[] nums = {1,2,3};
        //when
        boolean is14Exist = mediumArrayMethods.no14(nums);
        //then
        assertTrue(is14Exist);
    }

    @Test
    void no14OneTwoThreeFourTest(){
        //given
        int[] nums = {1,2,3,4};
        //when
        boolean is14Exist = mediumArrayMethods.no14(nums);
        //then
        assertFalse(is14Exist);
    }

    @Test
    void isEverywhereOneTwoOneThreeAndOneTest() {
        //given
        int[] nums = {1,2,1,3};
        int val = 1;
        //when
        boolean isValInPair = mediumArrayMethods.isEverywhere(nums, val);
        //then
        assertTrue(isValInPair);
    }

    @Test
    void isEverywhereOneTwoOneThreeAndTwoTest(){
        //given
        int[] nums = {1,2,1,3};
        int val = 2;
        //when
        boolean isValInPair = mediumArrayMethods.isEverywhere(nums, val);
        //then
        assertFalse(isValInPair);
    }

    @Test
    void either24OneTwoTwo() {
        //given
        int[] nums = {1,2,2};
        //when
        boolean is22Or44InPair = mediumArrayMethods.either24(nums);
        //then
        assertTrue(is22Or44InPair);
    }

    @Test
    void either24OneTwoThreeFourTest(){
        //given
        int[] nums = {1,2,3,4};
        //when
        boolean is22Or44InPair = mediumArrayMethods.either24(nums);
        //then
        assertFalse(is22Or44InPair);
    }

    @Test
    void matchUpOneTwoThreeAndTwoThreeTenTest() {
        //given
        int[] num1 = {1,2,3};
        int[] num2 = {2,3,10};
        //when
        int result = mediumArrayMethods.matchUp(num1, num2);
        //then
        assertEquals(2, result);
    }

    @Test
    void matchUpFiveThreeAndDoubleFourTest(){
        //given
        int[] num1 = {5,3};
        int[] num2 = {4,4};
        //when
        int result = mediumArrayMethods.matchUp(num1, num2);
        //then
        assertEquals(2, result);
    }

    @Test
    void has77OneDoubleSevenTest() {
        //given
        int[] nums = {1,7,7};
        //when
        boolean isSevenNear = mediumArrayMethods.has77(nums);
        //then
        assertTrue(isSevenNear);
    }

    @Test
    void has77SevenOneSevenTest(){
        //given
        int[] nums = {7, 1,7};
        //when
        boolean isSevenNear = mediumArrayMethods.has77(nums);
        //then
        assertTrue(isSevenNear);
    }

    @Test
    void has12OneThreeTwoTest() {
        //given
        int[] nums = {1,3,2};
        //when
        boolean isTwoAfterOne = mediumArrayMethods.has12(nums);
        //then
        assertTrue(isTwoAfterOne);
    }

    @Test
    void has12TwoOneThreeTest(){
        //given
        int[] nums = {2,1,3};
        //when
        boolean isTwoAfterOne = mediumArrayMethods.has12(nums);
        //then
        assertFalse(isTwoAfterOne);
    }

    @Test
    void modThreeTwoOneThreeFiveTest() {
        //given
        int[] nums = {2,1,3,5};
        //when
        boolean isEvenOrOddSequence = mediumArrayMethods.modThree(nums);
        //then
        assertTrue(isEvenOrOddSequence);
    }

    @Test
    void modThreeTwoOneTwoFiveTest(){
        //given
        int[] nums = {2,1,2,5};
        //when
        boolean isEvenOrOddSequence = mediumArrayMethods.modThree(nums);
        //then
        assertFalse(isEvenOrOddSequence);
    }

    @Test
    void haveThreeThreeOneThreeOneThreeTest() {
        //given
        int[] nums = {3,1,3,1,3};
        //when
        boolean isThreeTimesThree = mediumArrayMethods.haveThree(nums);
        //then
        assertTrue(isThreeTimesThree);
    }

    @Test
    void haveThreeThreeOneDoubleThreeTest(){
        //given
        int[] nums = {3,1,3,3};
        //when
        boolean isThreeTimesThree = mediumArrayMethods.haveThree(nums);
        //then
        assertFalse(isThreeTimesThree);
    }

    @Test
    void twoTwoDoubleTwoFourTest() {
        //given
        int[] nums = {2,2,4};
        //when
        boolean isTwoNextTo = mediumArrayMethods.twoTwo(nums);
        //then
        assertTrue(isTwoNextTo);
    }

    @Test
    void twoTwoDoubleTwoFourTwoTest(){
        //given
        int[] nums = {2,2,4,2};
        //when
        boolean isTwoNextTo = mediumArrayMethods.twoTwo(nums);
        //then
        assertFalse(isTwoNextTo);
    }

    @Test
    void sameEndsOneTwoFiveTwoOneAndOneTest() {
        //given
        int[] nums = {1,2,5,2,1};
        int len = 1;
        //when
        boolean isEndsEqual = mediumArrayMethods.sameEnds(nums, len);
        //then
        assertTrue(isEndsEqual);
    }

    @Test
    void sameEndsOneTwoFiveTwoOneAndTwoTest(){
        //given
        int[] nums = {1,2,5,2,1};
        int len = 2;
        //when
        boolean isEndsEqual = mediumArrayMethods.sameEnds(nums, len);
        //then
        assertFalse(isEndsEqual);
    }

    @Test
    void tripleUpOneFourFiveSixTwoTest() {
        //given
        int[] nums = {1,4,5,6,2};
        //when
        boolean isIncreasingAdjacent = mediumArrayMethods.tripleUp(nums);
        //then
        assertTrue(isIncreasingAdjacent);
    }

    @Test
    void tripleUpOneTwoFourTest(){
        //given
        int[] nums = {1,2,4};
        //when
        boolean isIncreasingAdjacent = mediumArrayMethods.tripleUp(nums);
        //then
        assertFalse(isIncreasingAdjacent);
    }

    @Test
    void fizzArray3FiveAndTenTest() {
        //given
        int start = 5;
        int end = 10;
        //when
        int[] array = mediumArrayMethods.fizzArray3(start, end);
        //then
        int[] expectedArray = {5,6,7,8,9};
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void fizzArray3OneAndOneTest(){
        //given
        int start = 1;
        int end = 1;
        //when
        int[] array = mediumArrayMethods.fizzArray3(start, end);
        //then
        int[] expectedArray = new int[0];
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void shiftLeftSixTwoFiveThreeTest() {
        //given
        int[] nums = {6,2,5,3};
        //when
        int[] newArray = mediumArrayMethods.shiftLeft(nums);
        //then
        int[] expectedArray = {2,5,3,6};
        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    void shiftLeftOneTest(){
        //given
        int[] nums = {1};
        //when
        int[] newArray  = mediumArrayMethods.shiftLeft(nums);
        //then
        int[] expectedArray = {1};
        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    void tenRunTenTwoTest() {
        //given
        int[] nums = {10,2};
        //when
        int[] newArray = mediumArrayMethods.tenRun(nums);
        //then
        int[] expectedArray = {10,10};
        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    void tenRunOneTwoFiftyOneTest(){
        //given
        int[] nums = {1,2,50,1};
        //when
        int[] newArray = mediumArrayMethods.tenRun(nums);
        //then
        int[] expectedArray = {1,2,50,50};
        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    void pre4OneTwoFourOneTest() {
        //given
        int[] nums = {1,2,4,1};
        //when
        int[] newArray = mediumArrayMethods.pre4(nums);
        //then
        int[] expectedArray = {1,2};
        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    void pre4DoubleFourTest(){
        //given
        int[] nums = {4,4};
        //when
        int[] newArray = mediumArrayMethods.pre4(nums);
        //then
        int[] expectedArray = new int[0];
        assertArrayEquals(expectedArray, newArray);
    }
}