package org.example.simpleRecursionMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleRecursionMethodsImplTest {

    SimpleRecursionMethods simpleRecursionMethods = new SimpleRecursionMethodsImpl();

    @Test
    void factorialThreeTest() {
        //given
        int n = 3;
        //when
        int result = simpleRecursionMethods.factorial(n);
        //then
        assertEquals(6, result);
    }

    @Test
    void factorialFourTest(){
        //given
        int n = 4;
        //when
        int result = simpleRecursionMethods.factorial(n);
        //then
        assertEquals(24, result);
    }

    @Test
    void bunnyEarsOneTest() {
        //given
        int n = 1;
        //when
        int result = simpleRecursionMethods.bunnyEars(n);
        //then
        assertEquals(2, result);
    }

    @Test
    void bunnyEarsFourTest(){
        //given
        int n = 4;
        //when
        int result = simpleRecursionMethods.bunnyEars(n);
        //then
        assertEquals(8, result);
    }

    @Test
    void fibonacciSixTest() {
        //given
        int n = 6;
        //when
        int result = simpleRecursionMethods.fibonacci(n);
        //then
        assertEquals(8, result);
    }

    @Test
    void fibonacciSevenTest(){
        //given
        int n = 7;
        //when
        int result = simpleRecursionMethods.fibonacci(n);
        //then
        assertEquals(13, result);
    }

    @Test
    void bunnyEars2ThreeTest(){
        //given
        int n = 3;
        //when
        int result = simpleRecursionMethods.bunnyEars2(n);
        //then
        assertEquals(7, result);
    }

    @Test
    void bunnyEars2FourTest(){
        //given
        int n = 4;
        //when
        int result = simpleRecursionMethods.bunnyEars2(n);
        //then
        assertEquals(10, result);
    }

    @Test
    void triangleTwoTest() {
        //given
        int rows = 2;
        //when
        int result = simpleRecursionMethods.triangle(rows);
        //then
        assertEquals(3, result);
    }

    @Test
    void triangleFourTest(){
        //given
        int rows = 4;
        //when
        int result = simpleRecursionMethods.triangle(rows);
        //then
        assertEquals(10, result);
    }

    @Test
    void sumDigitsFourtyNineTest() {
        //given
        int n = 49;
        //when
        int result = simpleRecursionMethods.sumDigits(n);
        //then
        assertEquals(13, result);
    }

    @Test
    void sumDigitsTwelveTest(){
        //given
        int n = 12;
        //when
        int result = simpleRecursionMethods.sumDigits(n);
        //then
        assertEquals(3, result);
    }

    @Test
    void count7SeventySevenTest() {
        //given
        int n = 77;
        //when
        int result = simpleRecursionMethods.count7(n);
        //then
        assertEquals(2, result);
    }

    @Test
    void count7SevenTest(){
        //given
        int n = 7;
        //when
        int result = simpleRecursionMethods.count7(n);
        //then
        assertEquals(1, result);
    }

    @Test
    void count8EightOneEightTest() {
        //given
        int n = 818;
        //when
        int result = simpleRecursionMethods.count8(n);
        //then
        assertEquals(2, result);
    }

    @Test
    void count8DoubleEightOneEightTest(){
        //given
        int n = 8818;
        //when
        int result = simpleRecursionMethods.count8(n);
        //then
        assertEquals(4, result);
    }

    @Test
    void powerNThreeTwoTest() {
        //given
        int base = 3;
        int n = 2;
        //when
        int result = simpleRecursionMethods.powerN(base, n);
        //then
        assertEquals(9, result);
    }

    @Test
    void powerNDoubleTwoTest(){
        //given
        int base = 2;
        int n = 2;
        //when
        int result = simpleRecursionMethods.powerN(base, n);
        //then
        assertEquals(4, result);
    }

    @Test
    void countXXxhixxTest() {
        //given
        String str = "xxhixx";
        //when
        int result = simpleRecursionMethods.countX(str);
        //then
        assertEquals(4, result);
    }

    @Test
    void countXHiTest(){
        //given
        String str = "hi";
        //when
        int result = simpleRecursionMethods.countX(str);
        //then
        assertEquals(0, result);
    }
}