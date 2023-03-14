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
}