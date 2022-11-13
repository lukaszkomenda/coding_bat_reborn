package org.example.MakeTags;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeTagsTest {

    MakeTags makeTags = new MakeTags();

    @Test
    void yayTest(){
        //given
        String tag = "i";
        String word = "Yay";
        //when
        String expression = makeTags.makeTags(tag, word);
        //then
        assertEquals("<i>Yay</i>", expression);
    }

    @Test
    void helloTest(){
        //given
        String tag = "i";
        String word = "Hello";
        //when
        String expression = makeTags.makeTags(tag, word);
        //then
        assertEquals("<i>Hello</i>", expression);
    }

    @Test
    void noneTest(){
        //given
        String tag = "i";
        String word = "";
        //when
        String expression = makeTags.makeTags(tag, word);
        //then
        assertEquals("<i></i>", expression);
    }

}