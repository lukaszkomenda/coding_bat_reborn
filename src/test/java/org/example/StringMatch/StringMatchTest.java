package org.example.StringMatch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMatchTest {

    StringMatch stringMatch = new StringMatch();

    @Test
    void abcAbcTest(){
        //given
        String a = "abc";
        String b = "abc";
        //when
        int count = stringMatch.stringMatch(a, b);
        //then
        assertEquals(2,count);
    }

    @Test
    void helloHeTest(){
        //given
        String a = "hello";
        String b = "he";
        //when
        int count = stringMatch.stringMatch(a, b);
        //then
        assertEquals(1,count);
    }

    @Test
    void abcAxcTest(){
        //given
        String a = "abc";
        String b = "axc";
        //when
        int count = stringMatch.stringMatch(a, b);
        //then
        assertEquals(0,count);
    }

}