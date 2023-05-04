package org.example.mediumMapMethods;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MediumMapMethodsImplTest {

    MediumMapMethods mediumMapMethods = new MediumMapMethodsImpl();

    @Test
    void word0AbabTest() {
        //given
        String[] strings = {"a", "b", "a", "b"};
        //when
        Map<String, Integer> newMap = mediumMapMethods.word0(strings);
        //then
        assertEquals(0, newMap.get("a"));
        assertEquals(0, newMap.get("b"));
        assertEquals(2, newMap.size());
    }

    @Test
    void word0CbaTest(){
        //given
        String[] strings = {"c", "b", "a"};
        //when
        Map<String, Integer> newMap = mediumMapMethods.word0(strings);
        //then
        assertEquals(0, newMap.get("a"));
        assertEquals(0, newMap.get("b"));
        assertEquals(0, newMap.get("c"));
        assertEquals(3, newMap.size());
    }

    @Test
    void wordLenAbbTest(){
        //given
        String[] strings = {"a", "bb", "a", "bb"};
        //when
        Map<String, Integer> newMap = mediumMapMethods.wordLen(strings);
        //then
        assertEquals(1, newMap.get("a"));
        assertEquals(2, newMap.get("bb"));
        assertEquals(2, newMap.size());
    }

    @Test
    void wordLenCodeBugTest(){
        //given
        String[] strings = {"code", "code", "code", "bug"};
        //when
        Map<String, Integer> newMap = mediumMapMethods.wordLen(strings);
        //then
        assertEquals(4, newMap.get("code"));
        assertEquals(3, newMap.get("bug"));
        assertEquals(2, newMap.size());
    }

    @Test
    void pairsManMoonMainTest(){
        //given
        String[] strings = {"man", "moon", "main"};
        //when
        Map<String, String> newMap = mediumMapMethods.pairs(strings);
        //then
        assertEquals("n", newMap.get("m"));
        assertEquals(1, newMap.size());
    }

    @Test
    void pairsCodeBugTest(){
        //given
        String[] strings = {"code", "bug"};
        //when
        Map<String, String> newMap = mediumMapMethods.pairs(strings);
        //then
        assertEquals("e", newMap.get("c"));
        assertEquals("g", newMap.get("b"));
        assertEquals(2, newMap.size());
    }

    @Test
    void wordCountAbacbTest() {
        //given
        String[] strings = {"a", "b", "a", "c", "b"};
        //when
        Map<String, Integer> newMap = mediumMapMethods.wordCount(strings);
        //then
        assertEquals(2, newMap.get("a"));
        assertEquals(2, newMap.get("b"));
        assertEquals(1, newMap.get("c"));
    }

    @Test
    void wordCountThisAndThisEmptyTest(){
        //given
        String[] strings = {"this", "and", "this", ""};
        //when
        Map<String, Integer> newMap = mediumMapMethods.wordCount(strings);
        //then
        assertEquals(2, newMap.get("this"));
        assertEquals(1, newMap.get("and"));
        assertEquals(1, newMap.get(""));
    }

    @Test
    void firstCharSaltTeaSodaToastTest() {
        //given
        String[] strings = {"salt", "tea", "soda", "toast"};
        //when
        Map<String, String> newMap = mediumMapMethods.firstChar(strings);
        //then
        assertEquals("saltsoda", newMap.get("s"));
        assertEquals("teatoast", newMap.get("t"));
        assertEquals(2, newMap.size());
    }

    @Test
    void firstCharAabbccaaacccdTest(){
        //given
        String[] strings = {"aa", "bb", "cc", "aAA", "cCC", "d"};
        //when
        Map<String, String> newMap = mediumMapMethods.firstChar(strings);
        //then
        assertEquals("aaaAA", newMap.get("a"));
        assertEquals("bb", newMap.get("b"));
        assertEquals("cccCC", newMap.get("c"));
        assertEquals("d", newMap.get("d"));
        assertEquals(4, newMap.size());
    }

    @Test
    void wordAppendAbcTest() {
        //given
        String[] strings = {"a", "b", "a"};
        //when
        String newStr = mediumMapMethods.wordAppend(strings);
        //then
        assertEquals("a", newStr);
    }

    @Test
    void wordAppendAEmptyATest(){
        //given
        String[] strings = {"a", "", "a"};
        //when
        String newStr = mediumMapMethods.wordAppend(strings);
        //then
        assertEquals("a", newStr);
    }

    @Test
    void wordMultipleAbacbTest() {
        //given
        String[] strings = {"a", "b", "a", "c", "b"};
        //when
        Map<String, Boolean> newMap = mediumMapMethods.wordMultiple(strings);
        //then
        assertTrue(newMap.get("a"));
        assertTrue(newMap.get("b"));
        assertFalse(newMap.get("c"));
        assertEquals(3, newMap.size());
    }

    @Test
    void wordMultipleThisAndThisTest(){
        //given
        String[] strings = {"this", "and", "this"};
        //when
        Map<String, Boolean> newMap = mediumMapMethods.wordMultiple(strings);
        //then
        assertTrue(newMap.get("this"));
        assertFalse(newMap.get("and"));
        assertEquals(2, newMap.size());
    }
}