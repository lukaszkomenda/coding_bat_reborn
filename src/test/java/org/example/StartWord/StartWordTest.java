package org.example.StartWord;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StartWordTest {

    StartWord startWord = new StartWord();

    @Test
    void hippoHiTest(){
        //given
        String str = "hippo";
        String word = "hi";
        //when
        String newStr = startWord.startWord(str, word);
        //then
        assertEquals("hi", newStr);
    }

    @Test
    void hIxTest(){
        //given
        String str = "h";
        String word = "ix";
        //when
        String newStr = startWord.startWord(str, word);
        //then
        assertEquals("", newStr);
    }

    @Test
    void hippoXippoTest(){
        //given
        String str = "hippo";
        String word = "xippo";
        //when
        String newStr = startWord.startWord(str, word);
        //then
        assertEquals("hippo", newStr);
    }

}