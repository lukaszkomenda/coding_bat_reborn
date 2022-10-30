package org.example.Makes10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Makes10Test {

    Makes10 makes10 = new Makes10();

    @Test
    void nineAndTenTest() {
        //given
        int a = 9;
        int b = 10;
        //when
        boolean make10 = makes10.makes10(a, b);
        //then
        assertTrue(make10);
    }

    @Test
    void nineAndNineTest() {
        //given
        int a = 9;
        int b = 9;
        //when
        boolean make10 = makes10.makes10(a, b);
        //then
        assertFalse(make10);
    }

    @Test
    void oneAndNineTest() {
        //given
        int a = 1;
        int b = 9;
        //when
        boolean makes101 = makes10.makes10(a, b);
        //then
        assertTrue(makes101);
    }

    @Test
    void tenAndOneTest() {
        //given
        int a = 10;
        int b = 1;
        //when
        boolean makes101 = makes10.makes10(a, b);
        //then
        assertTrue(makes101);
    }

    @Test
    void tenAndTenTest() {
        //given
        int a = 10;
        int b = 10;
        //when
        boolean makes101 = makes10.makes10(a, b);
        //then
        assertTrue(makes101);
    }

    @Test
    void eightAndTwoTest() {
        //given
        int a = 8;
        int b = 2;
        //when
        boolean makes101 = makes10.makes10(a, b);
        //then
        assertTrue(makes101);
    }

    @Test
    void eightAndThreeTest() {
        //given
        int a = 8;
        int b = 3;
        //when
        boolean makes101 = makes10.makes10(a, b);
        //then
        assertFalse(makes101);
    }

    @Test
    void tenAndFourtytwoTest() {
        //given
        int a = 10;
        int b = 42;
        //when
        boolean makes101 = makes10.makes10(a, b);
        //then
        assertTrue(makes101);
    }

    @Test
    void twelveAndTwoTest() {
        //given
        int a = 12;
        int b = 2;
        //when
        boolean makes101 = makes10.makes10(a, b);
        //when
        assertFalse(makes101);
    }
}