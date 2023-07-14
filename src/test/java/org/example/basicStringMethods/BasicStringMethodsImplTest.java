package org.example.basicStringMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicStringMethodsImplTest {

    BasicStringMethods basicStringMethods = new BasicStringMethodsImpl();

    @Test
    void bobTest(){
        //given
        String name = "Bob";
        //when
        String welcome = basicStringMethods.helloName(name);
        //then
        assertEquals("Hello Bob", welcome);
    }

    @Test
    void dollyTest(){
        //given
        String name = "Dolly";
        //when
        String welcome = basicStringMethods.helloName(name);
        //then
        assertEquals("Hello Dolly", welcome);
    }

    @Test
    void alphaTest(){
        //given
        String name = "Alpha";
        //when
        String welcome = basicStringMethods.helloName(name);
        //then
        assertEquals("Hello Alpha", welcome);
    }

    @Test
    void hiByeTest(){
        //given
        String a = "Hi";
        String b = "Bye";
        //when
        String newWord = basicStringMethods.makeAbba(a, b);
        //then
        assertEquals("HiByeByeHi", newWord);
    }

    @Test
    void xyTest(){
        //given
        String a = "x";
        String b = "y";
        //when
        String newWord = basicStringMethods.makeAbba(a, b);
        //then
        assertEquals("xyyx", newWord);
    }

    @Test
    void noneYTest(){
        //given
        String a = "";
        String b = "y";
        //when
        String newWord = basicStringMethods.makeAbba(a, b);
        assertEquals("yy", newWord);
    }

    @Test
    void makeTagsYayTest(){
        //given
        String tag = "i";
        String word = "Yay";
        //when
        String expression = basicStringMethods.makeTags(tag, word);
        //then
        assertEquals("<i>Yay</i>", expression);
    }

    @Test
    void makeTagsHelloTest(){
        //given
        String tag = "i";
        String word = "Hello";
        //when
        String expression = basicStringMethods.makeTags(tag, word);
        //then
        assertEquals("<i>Hello</i>", expression);
    }

    @Test
    void makeTagsNoneTest(){
        //given
        String tag = "i";
        String word = "";
        //when
        String expression = basicStringMethods.makeTags(tag, word);
        //then
        assertEquals("<i></i>", expression);
    }

    @Test
    void yayTest(){
        //given
        String out = "<<>>";
        String word = "Yay";
        //when
        String newWord = basicStringMethods.makeOutWord(out, word);
        //then
        assertEquals("<<Yay>>", newWord);
    }

    @Test
    void wordTest(){
        //given
        String out = "[[]]";
        String word = "word";
        //when
        String newWord = basicStringMethods.makeOutWord(out, word);
        //then
        assertEquals("[[word]]", newWord);
    }

    @Test
    void makeOutHelloTest(){
        //given
        String out = "HHoo";
        String word = "Hello";
        //when
        String newWord = basicStringMethods.makeOutWord(out, word);
        //then
        assertEquals("HHHellooo", newWord);
    }

    @Test
    void extraEndHelloTest(){
        //given
        String str = "Hello";
        //when
        String newStr = basicStringMethods.extraEnd(str);
        //then
        assertEquals("lololo", newStr);
    }

    @Test
    void extraEndHiTest(){
        //given
        String str = "Hi";
        //when
        String newStr = basicStringMethods.extraEnd(str);
        //then
        assertEquals("HiHiHi", newStr);
    }

    @Test
    void extraEndCodeTest(){
        //given
        String str = "Code";
        //when
        String newStr = basicStringMethods.extraEnd(str);
        //then
        assertEquals("dedede", newStr);
    }

    @Test
    void firstTwoHelloTest(){
        //given
        String str = "Hello";
        //when
        String newStr = basicStringMethods.firstTwo(str);
        //then
        assertEquals("He", newStr);
    }

    @Test
    void firstTwoATest(){
        //given
        String str = "a";
        //when
        String newStr = basicStringMethods.firstTwo(str);
        //then
        assertEquals("a", newStr);
    }

    @Test
    void firstTwoNoneTest(){
        //given
        String str = "";
        //when
        String newStr = basicStringMethods.firstTwo(str);
        //then
        assertEquals("", newStr);
    }

    @Test
    void wooTest(){
        //given
        String str = "WooHoo";
        //when
        String newStr = basicStringMethods.firstHalf(str);
        //then
        assertEquals("Woo", newStr);
    }

    @Test
    void firstHalfHelloTest(){
        //given
        String str = "HelloThere";
        //when
        String newStr = basicStringMethods.firstHalf(str);
        //then
        assertEquals("Hello", newStr);
    }

    @Test
    void firstHalfNoneTest(){
        //given
        String str = "";
        //when
        String newStr = basicStringMethods.firstHalf(str);
        //then
        assertEquals("", newStr);
    }

    @Test
    void withoutEndJavaTest(){
        //given
        String str = "java";
        //when
        String newStr = basicStringMethods.withoutEnd(str);
        //then
        assertEquals("av", newStr);
    }

    @Test
    void codingTest(){
        //given
        String str = "coding";
        //when
        String newStr = basicStringMethods.withoutEnd(str);
        //then
        assertEquals("odin", newStr);
    }

    @Test
    void withoutEndAbTest(){
        //given
        String str = "ab";
        //when
        String newStr = basicStringMethods.withoutEnd(str);
        //then
        assertEquals("", newStr);
    }

    @Test
    void helloHiTest(){
        //given
        String a = "Hello";
        String b = "hi";
        //when
        String newStr = basicStringMethods.comboString(a, b);
        //then
        assertEquals("hiHellohi", newStr);
    }

    @Test
    void noneBbTest(){
        //given
        String a = "";
        String b = "bb";
        //when
        String newStr = basicStringMethods.comboString(a, b);
        //then
        assertEquals("bb", newStr);
    }

    @Test
    void xyzAbTest(){
        //given
        String a = "xyz";
        String b = "ab";
        //when
        String newStr = basicStringMethods.comboString(a, b);
        //then
        assertEquals("abxyzab", newStr);
    }

    @Test
    void javaCodeTest(){
        //given
        String a = "java";
        String b = "code";
        //when
        String newStr = basicStringMethods.nonStart(a, b);
        //then
        assertEquals("avaode", newStr);
    }

    @Test
    void abXyTest(){
        //given
        String a = "ab";
        String b = "xy";
        //when
        String newStr = basicStringMethods.nonStart(a, b);
        //then
        assertEquals("by", newStr);
    }

    @Test
    void axTest(){
        //given
        String a = "a";
        String b = "x";
        //when
        String newStr = basicStringMethods.nonStart(a, b);
        //then
        assertEquals("", newStr);
    }

    @Test
    void left2JavaTest(){
        //given
        String str = "java";
        //when
        String newStr = basicStringMethods.left2(str);
        //then
        assertEquals("vaja", newStr);
    }

    @Test
    void left2HiTest(){
        //given
        String str = "Hi";
        //when
        String newStr = basicStringMethods.left2(str);
        //then
        assertEquals("Hi", newStr);
    }

    @Test
    void left2CatTest(){
        //given
        String str = "cat";
        //when
        String newStr = basicStringMethods.left2(str);
        //then
        assertEquals("tca", newStr);
    }

    @Test
    void javaTest(){
        //given
        String str = "java";
        //when
        String newStr = basicStringMethods.right2(str);
        //then
        assertEquals("vaja", newStr);
    }

    @Test
    void hiTest(){
        //given
        String str = "Hi";
        //when
        String newStr = basicStringMethods.right2(str);
        //then
        assertEquals("Hi", newStr);
    }

    @Test
    void catTest(){
        //given
        String str = "cat";
        //when
        String newStr = basicStringMethods.right2(str);
        //then
        assertEquals("atc", newStr);
    }

    @Test
    void ohFrontTest(){
        //given
        String str = "oh";
        boolean front = true;
        //when
        String newStr = basicStringMethods.theEnd(str, front);
        //then
        assertEquals("o", newStr);
    }

    @Test
    void helloBackTest(){
        //given
        String str = "Hello";
        boolean front = false;
        //when
        String newStr = basicStringMethods.theEnd(str, front);
        //then
        assertEquals("o", newStr);
    }

    @Test
    void xFrontTest(){
        //given
        String str = "x";
        boolean front = true;
        //when
        String newStr = basicStringMethods.theEnd(str, front);
        //then
        assertEquals("x", newStr);
    }

    @Test
    void withoutEnd2HelloTest(){
        //given
        String str = "Hello";
        //when
        String newStr = basicStringMethods.withouEnd2(str);
        //then
        assertEquals("ell", newStr);
    }

    @Test
    void abcTest(){
        //given
        String str = "abc";
        //when
        String newStr = basicStringMethods.withouEnd2(str);
        //then
        assertEquals("b", newStr);
    }

    @Test
    void aTest(){
        //given
        String str = "a";
        //when
        String newStr = basicStringMethods.withouEnd2(str);
        //then
        assertEquals("", newStr);
    }

    @Test
    void stringTest(){
        //given
        String str = "string";
        //when
        String newStr = basicStringMethods.middleTwo(str);
        //then
        assertEquals("ri", newStr);
    }

    @Test
    void middleTwoCodeTest(){
        //given
        String str = "code";
        //when
        String newStr = basicStringMethods.middleTwo(str);
        //then
        assertEquals("od", newStr);
    }

    @Test
    void abTest(){
        //given
        String str = "ab";
        //when
        String newStr = basicStringMethods.middleTwo(str);
        //then
        assertEquals("ab", newStr);
    }

    @Test
    void lyTest(){
        //given
        String str = "ly";
        //when
        boolean isLyContains = basicStringMethods.endsLy(str);
        //then
        assertTrue(isLyContains);
    }

    @Test
    void yTest(){
        //given
        String str = "y";
        //when
        boolean isLyContains = basicStringMethods.endsLy(str);
        //then
        assertFalse(isLyContains);
    }

    @Test
    void noneTest(){
        //given
        String str = "";
        //when
        boolean isLyContains = basicStringMethods.endsLy(str);
        //then
        assertFalse(isLyContains);
    }

    @Test
    void helloTest(){
        //given
        String str = "Hello";
        int n = 2;
        //when
        String newStr = basicStringMethods.nTwice(str, n);
        //then
        assertEquals("Helo", newStr);
    }

    @Test
    void codeTest(){
        //given
        String str = "Code";
        int n = 4;
        //when
        String newStr = basicStringMethods.nTwice(str, n);
        //then
        assertEquals("CodeCode", newStr);
    }

    @Test
    void chocolateTest(){
        //given
        String str = "Chocolate";
        int n = 0;
        //when
        String newStr = basicStringMethods.nTwice(str, n);
        //then
        assertEquals("", newStr);
    }
}