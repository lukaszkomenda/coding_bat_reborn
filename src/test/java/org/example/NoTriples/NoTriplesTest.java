package org.example.NoTriples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoTriplesTest {

    NoTriples noTriples = new NoTriples();

    @Test
    void oneTwoOneTest(){
        //given
        int[] nums = {1,2,1};
        //when
        boolean isNoTriples = noTriples.noTriples(nums);
        //then
        assertTrue(isNoTriples);
    }

    @Test
    void oneOneTwoTwoOneTest(){
        //given
        int[] nums = {1,1,2,2,1};
        //when
        boolean isNoTriples = noTriples.noTriples(nums);
        //then
        assertTrue(isNoTriples);
    }

    @Test
    void oneOneOneTest(){
        //given
        int[] nums = {1,1,1};
        //when
        boolean isNoTriples = noTriples.noTriples(nums);
        //then
        assertFalse(isNoTriples);
    }

}