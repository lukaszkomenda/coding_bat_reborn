package org.example.Close10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Close10Test {

    Close10 close10 = new Close10();

    @Test
    void sevenThirteenTest(){
        //given
        int a = 7;
        int b = 13;
        //when
        int mostClose = close10.close10(a, b);
        //then
        assertEquals(0,mostClose);
    }

    @Test
    void zeroTwentyTest(){
        //given
        int a = 0;
        int b = 20;
        //when
        int mostClose = close10.close10(a, b);
        //then
        assertEquals(0,mostClose);
    }

    @Test
    void tenTwelveTest(){
        //given
        int a = 10;
        int b = 12;
        //when
        int mostClose = close10.close10(a, b);
        //then
        assertEquals(10,mostClose);
    }

}