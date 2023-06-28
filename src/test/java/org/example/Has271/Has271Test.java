package org.example.Has271;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Has271Test {

    Has271 has271 = new Has271();

    @Test
    void oneTwoSevenOneTest(){
        //given
        int[] nums = {1,2,7,1};
        //when
        boolean is271sequence = has271.has271(nums);
        //then
        assertTrue(is271sequence);
    }

    @Test
    void twoSevenFourTest(){
        //given
        int[] nums = {2,7,4};
        //when
        boolean is271sequence = has271.has271(nums);
        //then
        assertFalse(is271sequence);
    }

    @Test
    void twoSevenMinusOneTest(){
        //given
        int[] nums = {2,7,-1};
        //when
        boolean is271sequence = has271.has271(nums);
        //then
        assertTrue(is271sequence);
    }

}