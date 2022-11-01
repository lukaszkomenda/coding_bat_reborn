package org.example.StartHi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StartHiTest {

    StartHi startHi = new StartHi();

    @Test
    void hiThereTest(){
        //given
        String str = "hi there";
        //when
        boolean isStartHi = startHi.startHi(str);
        //then
        assertTrue(isStartHi);
    }

    @Test
    void hTest(){
        //given
        String str = "h";
        //when
        boolean isStartHi = startHi.startHi(str);
        //then
        assertFalse(isStartHi);
    }

    @Test
    void hiHoTest(){
        //given
        String str = "hi ho";
        //when
        boolean isStartHi = startHi.startHi(str);
        //then
        assertTrue(isStartHi);
    }

}