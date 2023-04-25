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
}