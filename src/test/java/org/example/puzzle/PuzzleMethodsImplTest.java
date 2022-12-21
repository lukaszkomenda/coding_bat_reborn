package org.example.puzzle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PuzzleMethodsImplTest {

    PuzzleMethods puzzleMethods = new PuzzleMethodsImpl();

    @Test
    void makeBricksThreeOneEightTest() {
        //given
        int small = 3;
        int big = 1;
        int goal = 8;
        //when
        boolean isBricksCouldMake = puzzleMethods.makeBricks(small, big, goal);
        //then
        assertTrue(isBricksCouldMake);
    }

    @Test
    void makeBricksThreeOneNineTest(){
        //given
        int small = 3;
        int big = 1;
        int goal = 9;
        //when
        boolean isBricksCouldMake = puzzleMethods.makeBricks(small, big, goal);
        //then
        assertFalse(isBricksCouldMake);
    }

    @Test
    void loneSumOneTwoThreeTest() {
        //given
        int a = 1;
        int b = 2;
        int c = 3;
        //when
        int result = puzzleMethods.loneSum(a, b, c);
        //then
        assertEquals(6, result);
    }

    @Test
    void loneSumThreeTwoThreeTest(){
        //given
        int a = 3;
        int b = 2;
        int c = 3;
        //when
        int result = puzzleMethods.loneSum(a, b, c);
        //then
        assertEquals(2, result);
    }

    @Test
    void luckySumOneTwoThreeTest() {
        //given
        int a = 1;
        int b = 2;
        int c = 3;
        //when
        int result = puzzleMethods.luckySum(a, b, c);
        //then
        assertEquals(6, result);
    }

    @Test
    void luckySumThirteenTwoThirteenTest(){
        //given
        int a = 13;
        int b = 2;
        int c = 13;
        //when
        int result = puzzleMethods.luckySum(a, b, c);
        //then
        assertEquals(0, result);
    }
}