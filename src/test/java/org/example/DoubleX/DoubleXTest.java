package org.example.DoubleX;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DoubleXTest {

    DoubleX doubleX = new DoubleX();

    @Test
    void axxbbTest(){
        //given
        String str = "axxbb";
        //when
        boolean isDoubleX = doubleX.doubleX(str);
        //then
        assertTrue(isDoubleX);
    }

    @Test
    void abcTest(){
        //given
        String str = "abc";
        //when
        boolean isDoubleX = doubleX.doubleX(str);
        //then
        assertFalse(isDoubleX);
    }

    @Test
    void noneTest(){
        //given
        String str = "";
        //when
        boolean isDoubleX = doubleX.doubleX(str);
        //then
        assertFalse(isDoubleX);
    }

}