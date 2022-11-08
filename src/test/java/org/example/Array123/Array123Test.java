package org.example.Array123;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array123Test {

    Array123 array123 = new Array123();

    @Test
    void oneOneTwoThreeOneTest(){
        //given
        int[] nums = {1,1,2,3,1};
        //when
        boolean is123sequence = array123.array123(nums);
        //then
        assertTrue(is123sequence);
    }

    @Test
    void oneOneTwoOneTwoOneTest(){
        //given
        int[] nums = {1,1,2,1,2,1};
        //when
        boolean is123sequence = array123.array123(nums);
        //then
        assertFalse(is123sequence);
    }

    @Test
    void noneTest(){
        //given
        int[] nums = {};
        //when
        boolean is123sequence = array123.array123(nums);
        //then
        assertFalse(is123sequence);
    }

}