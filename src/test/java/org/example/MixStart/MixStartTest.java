package org.example.MixStart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MixStartTest {

    MixStart mixStart = new MixStart();

    @Test
    void nixTest(){
        //given
        String str = "nix";
        //when
        boolean isContainsIx = mixStart.mixStart(str);
        //then
        assertTrue(isContainsIx);
    }

    @Test
    void niTest(){
        //given
        String str = "ni";
        //when
        boolean isContainsIx = mixStart.mixStart(str);
        //then
        assertFalse(isContainsIx);
    }

    @Test
    void noneTest(){
        //given
        String str = "";
        //when
        boolean isContainsIx = mixStart.mixStart(str);
        //then
        assertFalse(isContainsIx);
    }

}