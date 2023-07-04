package org.example.MakeAbba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeAbbaTest {

    MakeAbba makeAbba = new MakeAbba();

    @Test
    void hiByeTest(){
        //given
        String a = "Hi";
        String b = "Bye";
        //when
        String newWord = makeAbba.makeAbba(a, b);
        //then
        assertEquals("HiByeByeHi", newWord);
    }

    @Test
    void xyTest(){
        //given
        String a = "x";
        String b = "y";
        //when
        String newWord = makeAbba.makeAbba(a, b);
        //then
        assertEquals("xyyx", newWord);
    }

    @Test
    void noneYTest(){
        //given
        String a = "";
        String b = "y";
        //when
        String newWord = makeAbba.makeAbba(a, b);
        assertEquals("yy", newWord);
    }

}