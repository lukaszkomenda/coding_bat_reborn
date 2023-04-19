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

    @Test
    void mapABAbTest() {
        //given
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");
        //when
        Map<String, String> newMap = simpleMapMethods.mapAB(map);
        //then
        assertEquals(3, newMap.size());
        assertEquals("HiThere", newMap.get("ab"));
    }

    @Test
    void mapABCTest(){
        //given
        Map<String, String> map = new HashMap<>();
        map.put("c", "meh");
        //when
        Map<String, String> newMap = simpleMapMethods.mapAB(map);
        //then
        assertEquals(1, newMap.size());
        assertEquals("meh", newMap.get("c"));
    }

    @Test
    void topping1IceCreamTest() {
        //given
        Map<String, String> map = new HashMap<>();
        map.put("ice cream", "peanuts");
        //when
        Map<String, String> newMap = simpleMapMethods.topping1(map);
        //then
        assertEquals(2, newMap.size());
        assertEquals("cherry", newMap.get("ice cream"));
    }

    @Test
    void topping1NoneTest(){
        //given
        Map<String, String> map = new HashMap<>();
        //when
        Map<String, String> newMap = simpleMapMethods.topping1(map);
        //then
        assertEquals(1, newMap.size());
        assertEquals("butter", newMap.get("bread"));
    }

    @Test
    void topping2IceCreamTest() {
        //given
        Map<String, String> map = new HashMap<>();
        map.put("ice cream", "cherry");
        //when
        Map<String, String> newMap = simpleMapMethods.topping2(map);
        //then
        assertEquals(2, newMap.size());
        assertEquals("cherry", newMap.get("yogurt"));
    }

    @Test
    void topping2SpinachIceCreamTest(){
        //given
        Map<String, String> map = new HashMap<>();
        map.put("ice cream", "cherry");
        map.put("spinach", "dirt");
        //when
        Map<String, String> newMap = simpleMapMethods.topping2(map);
        //then
        assertEquals(3, newMap.size());
        assertEquals("cherry", newMap.get("yogurt"));
        assertEquals("nuts", newMap.get("spinach"));
    }

    @Test
    void topping3PotatoTest() {
        //given
        Map<String, String> map = new HashMap<>();
        map.put("potato", "ketchup");
        //when
        Map<String, String> newMap = simpleMapMethods.topping3(map);
        //then
        assertEquals(2, newMap.size());
        assertEquals("ketchup", newMap.get("potato"));
    }

    @Test
    void topping3NoneTest(){
        //given
        Map<String, String> map = new HashMap<>();
        //when
        Map<String, String> newMap = simpleMapMethods.topping3(map);
        //then
        assertEquals(0, newMap.size());
        assertFalse(newMap.containsKey("potato"));
    }

    @Test
    void mapAB2AbcTest() {
        //given
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "aaa");
        map.put("c", "cake");
        //when
        Map<String, String> newMap = simpleMapMethods.mapAB2(map);
        //then
        assertEquals(1, newMap.size());
    }

    @Test
    void mapAB2AbTest(){
        //given
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bbb");
        //when
        Map<String, String> newMap = simpleMapMethods.mapAB2(map);
        //then
        assertEquals(2, newMap.size());
    }

    @Test
    void mapAB3AcTest() {
        //given
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("c", "cake");
        //when
        Map<String, String> newMap = simpleMapMethods.mapAB3(map);
        //then
        assertEquals(3, newMap.size());
        assertEquals("aaa", newMap.get("b"));
    }

    @Test
    void mapAB3BcTest(){
        //given
        Map<String, String> map = new HashMap<>();
        map.put("b", "bbb");
        map.put("c", "cake");
        //when
        Map<String, String> newMap = simpleMapMethods.mapAB3(map);
        //then
        assertEquals(3, newMap.size());
        assertEquals("bbb", newMap.get("a"));
    }
}