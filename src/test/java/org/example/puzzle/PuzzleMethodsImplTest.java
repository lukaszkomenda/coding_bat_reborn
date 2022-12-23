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

    @Test
    void noTeenSumOneTwoThreeTest() {
        //given
        int a = 1;
        int b = 2;
        int c = 3;
        //when
        int result = puzzleMethods.noTeenSum(a, b, c);
        //then
        assertEquals(6, result);
    }

    @Test
    void noTeenSumTwoThirteenOneTest(){
        //given
        int a = 2;
        int b = 13;
        int c = 1;
        //when
        int result = puzzleMethods.noTeenSum(a, b, c);
        //then
        assertEquals(3, result);
    }

    @Test
    void roundSumSixFourFour() {
        //given
        int a = 6;
        int b = 4;
        int c = 4;
        //when
        int result = puzzleMethods.roundSum(a, b, c);
        //then
        assertEquals(10, result);
    }

    @Test
    void roundSumTenTenNineteenTest(){
        //given
        int a = 10;
        int b = 10;
        int c = 19;
        //when
        int result = puzzleMethods.roundSum(a, b, c);
        //then
        assertEquals(40, result);
    }

    @Test
    void closeFarFourOneThreeTest() {
        //given
        int a = 4;
        int b = 1;
        int c = 3;
        //when
        boolean isCloseFar = puzzleMethods.closeFar(a, b, c);
        //then
        assertTrue(isCloseFar);
    }

    @Test
    void closeFarMinusOneTenZeroTest(){
        //given
        int a = -1;
        int b = 10;
        int c = 0;
        //when
        boolean isCloseFar = puzzleMethods.closeFar(a, b, c);
        //then
        assertTrue(isCloseFar);
    }

    @Test
    void blackjackNineteenTwentyOneTest() {
        //given
        int a = 19;
        int b = 21;
        //when
        int blackjack = puzzleMethods.blackjack(a, b);
        //then
        assertEquals(21, blackjack);
    }

    @Test
    void blackjackTwentyTwoFiftyTest(){
        //given
        int a = 22;
        int b = 50;
        //when
        int blackjack = puzzleMethods.blackjack(a, b);
        //then
        assertEquals(0, blackjack);
    }

    @Test
    void evenlySpacedTwoFourSixTest() {
        //given
        int a = 2;
        int b = 4;
        int c = 6;
        //when
        boolean isSameDifference = puzzleMethods.evenlySpaced(a, b, c);
        //then
        assertTrue(isSameDifference);
    }

    @Test
    void evenlySpacedFourSixThreeTest(){
        //given
        int a = 4;
        int b = 6;
        int c = 3;
        //when
        boolean isSameDifference = puzzleMethods.evenlySpaced(a, b, c);
        //then
        assertFalse(isSameDifference);
    }

    @Test
    void makeChocolateFourOneNineTest() {
        //given
        int small = 4;
        int big = 1;
        int goal = 9;
        //when
        int result = puzzleMethods.makeChocolate(small, big, goal);
        //then
        assertEquals(4, result);
    }

    @Test
    void makeChocolateFourOneTenTest(){
        //given
        int small = 4;
        int big = 1;
        int goal = 10;
        //when
        int result = puzzleMethods.makeChocolate(small, big, goal);
        //then
        assertEquals(-1, result);
    }
}