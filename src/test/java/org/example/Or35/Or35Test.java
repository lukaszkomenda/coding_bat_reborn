package org.example.Or35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Or35Test {

    Or35 or35 = new Or35();

    @Test
    void tenTest(){
        //given
        int n = 10;
        //when
        boolean isMultipleThreeAndFive = or35.or35(n);
        //then
        assertTrue(isMultipleThreeAndFive);
    }

    @Test
    void fourTest(){
        //given
        int n = 4;
        //when
        boolean isMultipleThreeAndFive = or35.or35(n);
        //then
        assertFalse(isMultipleThreeAndFive);
    }

    @Test
    void hundredTest(){
        //given
        int n = 10;
        //when
        boolean isMultipleThreeAndFive = or35.or35(n);
        //then
        assertTrue(isMultipleThreeAndFive);
    }

}