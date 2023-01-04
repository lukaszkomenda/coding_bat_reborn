package org.example.hardStringMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HardStringMethodsImplTest {

    HardStringMethods hardStringMethods = new HardStringMethodsImpl();

    @Test
    void countYZFezDayTest() {
        //given
        String str = "fez day";
        //when
        int result = hardStringMethods.countYZ(str);
        //then
        assertEquals(2, result);
    }

    @Test
    void countYZY2BzTest(){
        //given
        String str = "y2bz";
        //when
        int result = hardStringMethods.countYZ(str);
        //then
        assertEquals(2, result);
    }

    @Test
    void withoutStringTripleXAndXTest() {
        //given
        String base = "xxx";
        String remove = "x";
        //when
        String newStr = hardStringMethods.withoutString(base, remove);
        //then
        assertEquals("", newStr);
    }

    @Test
    void withoutString1111And11Test(){
        //given
        String base = "1111";
        String remove = "11";
        //when
        String newStr = hardStringMethods.withoutString(base, remove);
        //then
        assertEquals("11", newStr);
    }
}