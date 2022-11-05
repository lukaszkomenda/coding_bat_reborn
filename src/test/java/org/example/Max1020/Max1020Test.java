package org.example.Max1020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Max1020Test {

    Max1020 max1020 = new Max1020();

    @Test
    void nineTwentyoneTest(){
        //given
        int a = 9;
        int b = 21;
        //when
        int maxValueInRange1020 = max1020.max1020(a, b);
        //then
        assertEquals(0,maxValueInRange1020);
    }

    @Test
    void tenTwentyoneTest(){
        //given
        int a = 10;
        int b = 21;
        //when
        int maxValueInRange1020 = max1020.max1020(a, b);
        //then
        assertEquals(10,maxValueInRange1020);
    }

    @Test
    void sevenTwentyTest(){
        //given
        int a = 7;
        int b = 20;
        //when
        int maxValueInRange1020 = max1020.max1020(a, b);
        //then
        assertEquals(20,maxValueInRange1020);
    }

}