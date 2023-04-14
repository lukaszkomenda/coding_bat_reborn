package org.example.simpleMapMethods;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMapMethodsImplTest {

    SimpleMapMethods simpleMapMethods = new SimpleMapMethodsImpl();


    @Test
    void mapBullyAbTest() {
        //given
        Map<String, String> map = new HashMap<>();
        map.put("a", "candy");
        map.put("b", "dirt");
        //when
        Map<String, String> newMap = simpleMapMethods.mapBully(map);
        //then
        assertEquals("", newMap.get("a"));
        assertEquals("candy", newMap.get("b"));
    }

    @Test
    void mapBullyAcTest(){
        //given
        Map<String, String> map = new HashMap<>();
        map.put("a", "sparkle");
        map.put("c", "meh");
        //when
        Map<String, String> newMap = simpleMapMethods.mapBully(map);
        //then
        assertEquals("", newMap.get("a"));
        assertEquals("sparkle", newMap.get("b"));
        assertEquals("meh", newMap.get("c"));
    }

    @Test
    void mapShareAbcTest() {
        //given
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "ccc");
        //when
        Map<String, String> newMap = simpleMapMethods.mapShare(map);
        //then
        assertEquals("aaa", newMap.get("a"));
        assertEquals("aaa", newMap.get("b"));
        assertEquals(2, newMap.size());
    }

    @Test
    void mapShareBcTest(){
        //given
        Map<String, String> map = new HashMap<>();
        map.put("b", "xyz");
        map.put("c", "ccc");
        //when
        Map<String, String> newMap = simpleMapMethods.mapShare(map);
        //then
        assertEquals("xyz", newMap.get("b"));
        assertEquals(1, newMap.size());
    }
}