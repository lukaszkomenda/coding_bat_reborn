package org.example.apMethods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApMethodsImplTest {

    ApMethods apMethods = new ApMethodsImpl();

    @Test
    void scoresIncreasingOneThreeFourTest() {
        //given
        int[] nums = {1,3,4};
        //when
        boolean isIncreasing = apMethods.scoresIncreasing(nums);
        //then
        assertTrue(isIncreasing);
    }

    @Test
    void scoresIncreasingOneThreeTwoTest(){
        //given
        int[] nums = {1,3,2};
        //when
        boolean isIncreasing = apMethods.scoresIncreasing(nums);
        //then
        assertFalse(isIncreasing);
    }

    @Test
    void scores100OneDoubleHundredTest() {
        //given
        int[] nums = {1,100, 100};
        //when
        boolean isHundredNextTo = apMethods.scores100(nums);
        //then
        assertTrue(isHundredNextTo);
    }

    @Test
    void scores100HundredOneHundredOneTest(){
        //given
        int[] nums = {100, 1, 100, 1};
        //when
        boolean isHundredNextTo = apMethods.scores100(nums);
        //then
        assertFalse(isHundredNextTo);
    }

    @Test
    void scoresClumpThreeFourFiveTest() {
        //given
        int[] nums = {3,4,5};
        //when
        boolean isIncreasingByTwo = apMethods.scoresClump(nums);
        //then
        assertTrue(isIncreasingByTwo);
    }

    @Test
    void scoresClumpThreeFourSixTest(){
        //given
        int[] nums = {3,4,6};
        //when
        boolean isIncreasingByTwo = apMethods.scoresClump(nums);
        //then
        assertFalse(isIncreasingByTwo);
    }

    @Test
    void scoresAverageDoubleTwoDoubleFourTest() {
        //given
        int[] nums = {2,2,4,4};
        //when
        int result = apMethods.scoresAverage(nums);
        //then
        assertEquals(4, result);
    }

    @Test
    void scoresAverageFiveSixTest(){
        //given
        int[] nums = {5,6};
        //when
        int result = apMethods.scoresAverage(nums);
        //then
        assertEquals(6, result);
    }

    @Test
    void wordsCountABbBCccOneTest() {
        //given
        String[] array = {"a", "bb", "ccc", "b"};
        int len = 1;
        //when
        int result = apMethods.wordsCount(array, len);
        //then
        assertEquals(2, result);
    }

    @Test
    void wordsCountABbBCccFourTest(){
        //given
        String[] array = {"a", "bb", "ccc", "b"};
        int len = 4;
        //when
        int result = apMethods.wordsCount(array, len);
        //then
        assertEquals(0, result);
    }

    @Test
    void wordsFrontABCDOneTest() {
        //given
        String[] array = {"a", "b", "c", "d"};
        int n = 1;
        //when
        String[] newArray = apMethods.wordsFront(array, n);
        //then
        String[] expectedArray = {"a"};
        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    void wordsFrontABCDTwoTest(){
        //given
        String[] array = {"a", "b", "c", "d"};
        int n = 2;
        //when
        String[] newArray = apMethods.wordsFront(array, n);
        //then
        String[] expectedArray = {"a", "b"};
        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    void wordsWithoutListABbBCccOneTest() {
        //given
        String[] words = {"a", "bb", "b", "ccc"};
        int len = 1;
        //when
        List<String> listWithoutProvidedLength = apMethods.wordsWithoutList(words, len);
        //then
        List<String> expectedList = Arrays.asList("bb", "ccc");
        Assertions.assertArrayEquals(expectedList.toArray(), listWithoutProvidedLength.toArray());
    }

    @Test
    void wordsWithoutListABbBCccThreeTest(){
        //given
        String[] words = {"a", "bb", "b", "ccc"};
        int len = 3;
        //when
        List<String> listWithoutProvidedLength = apMethods.wordsWithoutList(words, len);
        //then
        List<String> expectedList = Arrays.asList("a", "bb", "b");
        Assertions.assertArrayEquals(expectedList.toArray(), listWithoutProvidedLength.toArray());
    }

    @Test
    void hasOneTenTest() {
        //given
        int n = 10;
        //when
        boolean isOneContains = apMethods.hasOne(n);
        //then
        assertTrue(isOneContains);
    }

    @Test
    void hasOneTwentyTwoTest(){
        //given
        int n = 22;
        //when
        boolean isOneContains = apMethods.hasOne(n);
        //then
        assertFalse(isOneContains);
    }

    @Test
    void dividesSelfTwelveTest() {
        //given
        int n = 12;
        //when
        boolean isDivisible = apMethods.dividesSelf(n);
        //then
        assertTrue(isDivisible);
    }

    @Test
    void dividesSelfHundredTwentyTest(){
        //given
        int n = 120;
        //when
        boolean isDivisible = apMethods.dividesSelf(n);
        //then
        assertFalse(isDivisible);
    }

    @Test
    void copyEvensTwoAndOneTest() {
        //given
        int[] nums = {2};
        int count = 1;
        //when
        int[] array = apMethods.copyEvens(nums, count);
        //then
        int[] expectedArray = {2};
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void copyEvensOneEightFourAndOneTest(){
        //given
        int[] nums = {1,8,4};
        int count = 1;
        //when
        int[] array = apMethods.copyEvens(nums, count);
        //then
        int[] expectedArray = {8};
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void copyEndyTenElevenNinetyAndTwoTest() {
        //given
        int[] nums = {10,11,90};
        int count = 2;
        //when
        int[] array = apMethods.copyEndy(nums, count);
        //then
        int[] expectedArray = {10,90};
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void copyEndyThirteenDoubleTwoZeroAndTwoTest(){
        //given
        int[] nums = {13,2,2,0};
        int count = 2;
        //when
        int[] array = apMethods.copyEndy(nums, count);
        //then
        int[] expectedArray = {2,2};
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void matchUpTripleNoneAndNoneBbCcTest() {
        //given
        String[] a = {"", "", ""};
        String[] b = {"", "bb", "cc"};
        //when
        int result = apMethods.matchUp(a, b);
        //then
        assertEquals(0, result);
    }

    @Test
    void matchUpDoubleNoneCccAndAaBbCcTest(){
        //given
        String[] a = {"", "", "ccc"};
        String[] b = {"aa", "bb", "cc"};
        //when
        int result = apMethods.matchUp(a, b);
        //then
        assertEquals(1, result);
    }

    @Test
    void scoreUpAabbAndAcbcTest() {
        //given
        String[] key = {"a", "a", "b", "b"};
        String[] answers = {"a", "c", "b", "c"};
        //when
        int result = apMethods.scoreUp(key, answers);
        //then
        assertEquals(6, result);
    }

    @Test
    void scoreUpAabbAndQMarkcbQMarkTest(){
        //given
        String[] key = {"a", "a", "b", "b"};
        String[] answers = {"?", "c", "b", "?"};
        //when
        int result = apMethods.scoreUp(key, answers);
        //then
        assertEquals(3, result);
    }

    @Test
    void wordsWithoutAbcaAndATest() {
        //given
        String[] words = {"a", "b", "c", "a"};
        String target = "a";
        //when
        String[] array = apMethods.wordsWithout(words, target);
        //then
        String[] expectedArray = {"b", "c"};
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void wordsWithoutAbcaAndBTest(){
        //given
        String[] words = {"a", "b", "c", "a"};
        String target = "b";
        //when
        String[] array = apMethods.wordsWithout(words, target);
        //then
        String[] expectedArray = {"a", "c", "a"};
        assertArrayEquals(expectedArray, array);
    }

    @Test
    void scoresSpecialTwelveTenFourAndTwoTwentyThirtyTest() {
        //given
        int[] a = {12,10,4};
        int[] b = {2,20,30};
        //when
        int result = apMethods.scoresSpecial(a, b);
        //then
        assertEquals(40, result);
    }

    @Test
    void scoresSpecialOneTwentyTwoFiftyAndThreeFourFiveTest(){
        //given
        int[] a = {1,20,2,50};
        int[] b = {3,4,5};
        //when
        int result = apMethods.scoresSpecial(a, b);
        //then
        assertEquals(50, result);
    }

    @Test
    void sumHeightsFiveThreeSixSevenTwoAndTwoAndFourTest() {
        //given
        int[] heights = {5,3,6,7,2};
        int start = 2;
        int end = 4;
        //when
        int result = apMethods.sumHeights(heights, start, end);
        //then
        assertEquals(6, result);
    }

    @Test
    void sumHeightsFiveThreeSixSevenTwoAndDoubleOneTest(){
        //given
        int[] heights = {5,3,6,7,2};
        int start = 1;
        int end = 1;
        //when
        int result = apMethods.sumHeights(heights, start, end);
        //then
        assertEquals(0, result);
    }

    @Test
    void sumHeights2FiveThreeSixSevenTwoAndTwoAndFourTest() {
        //given
        int[] heights = {5,3,6,7,2};
        int start = 2;
        int end = 4;
        //when
        int result = apMethods.sumHeights2(heights, start, end);
        //then
        assertEquals(7, result);
    }

    @Test
    void sumHeightsFiveThreeSixSevenTwoAndZeroAndOneTest(){
        //given
        int[] heights = {5,3,6,7,2};
        int start = 0;
        int end = 1;
        //when
        int result = apMethods.sumHeights2(heights, start, end);
        //then
        assertEquals(2, result);
    }

    @Test
    void bigHeightsFiveThreeSixSevenTwoAndTwoAndFourTest() {
        //given
        int[] heights = {5,3,6,7,2};
        int start = 2;
        int end = 4;
        //when
        int result = apMethods.bigHeights(heights, start, end);
        //then
        assertEquals(1, result);
    }

    @Test
    void bigHeightsFiveThreeSixSevenTwoAndZeroAndOneTest(){
        //given
        int[] heights = {5,3,6,7,2};
        int start = 0;
        int end = 1;
        //when
        int result = apMethods.bigHeights(heights, start, end);
        //then
        assertEquals(0, result);
    }
}