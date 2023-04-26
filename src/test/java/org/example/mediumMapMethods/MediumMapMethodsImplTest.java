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
}