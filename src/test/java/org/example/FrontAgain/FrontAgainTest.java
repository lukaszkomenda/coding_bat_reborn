package org.example.FrontAgain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrontAgainTest {

    FrontAgain frontAgain = new FrontAgain();

    @Test
    void editedTest(){
        //given
        String str = "edited";
        //when
        boolean isFrontAgain = frontAgain.frontAgain(str);
        //then
        assertTrue(isFrontAgain);
    }

    @Test
    void editTest(){
        //given
        String str = "edit";
        //when
        boolean isFrontAgain = frontAgain.frontAgain(str);
        //then
        assertFalse(isFrontAgain);
    }

    @Test
    void xTest(){
        //given
        String str = "x";
        //when
        boolean isFrontAgain = frontAgain.frontAgain(str);
        //then
        assertFalse(isFrontAgain);
    }

}