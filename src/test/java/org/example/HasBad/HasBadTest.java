package org.example.HasBad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HasBadTest {

    HasBad hasBad = new HasBad();

    @Test
    void badXxTest(){
        //given
        String str = "badxx";
        //when
        boolean isBadContains = hasBad.hadBad(str);
        //then
        assertTrue(isBadContains);
    }

    @Test
    void codeTest(){
        //given
        String str = "code";
        //when
        boolean isBadContains = hasBad.hadBad(str);
        //then
        assertFalse(isBadContains);
    }

    @Test
    void xBaTest(){
        //given
        String str = "xba";
        //when
        boolean isBadContains = hasBad.hadBad(str);
        //then
        assertFalse(isBadContains);
    }

}