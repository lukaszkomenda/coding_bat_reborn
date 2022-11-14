package org.example.MakeOutWord;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeOutWordTest {

    MakeOutWord makeOutWord = new MakeOutWord();

    @Test
    void yayTest(){
        //given
        String out = "<<>>";
        String word = "Yay";
        //when
        String newWord = makeOutWord.makeOutWord(out, word);
        //then
        assertEquals("<<Yay>>", newWord);
    }

    @Test
    void wordTest(){
        //given
        String out = "[[]]";
        String word = "word";
        //when
        String newWord = makeOutWord.makeOutWord(out, word);
        //then
        assertEquals("[[word]]", newWord);
    }

    @Test
    void helloTest(){
        //given
        String out = "HHoo";
        String word = "Hello";
        //when
        String newWord = makeOutWord.makeOutWord(out, word);
        //then
        assertEquals("HHHellooo", newWord);
    }
}