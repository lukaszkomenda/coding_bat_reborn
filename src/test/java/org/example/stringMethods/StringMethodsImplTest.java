package org.example.stringMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMethodsImplTest {

    StringMethods stringMethods = new StringMethodsImpl();

    @Test
    void doubleCharTheTest() {
        //given
        String str = "The";
        //when
        String newStr = stringMethods.doubleChar(str);
        //then
        assertEquals("TThhee", newStr);
    }

    @Test
    void doubleCharNoneTest(){
        //given
        String str = "";
        //when
        String newStr = stringMethods.doubleChar(str);
        //then
        assertEquals("", newStr);
    }

    @Test
    void countHiHiHiTest() {
        //given
        String str = "hihi";
        //when
        int counter = stringMethods.countHi(str);
        //then
        assertEquals(2, counter);
    }

    @Test
    void countHiNoneTest(){
        //given
        String str = "";
        //when
        int counter = stringMethods.countHi(str);
        //then
        assertEquals(0, counter);
    }

    @Test
    void catDogCatDogTest() {
        //given
        String str = "catdog";
        //when
        boolean isCatDogEquals = stringMethods.catDog(str);
        //then
        assertTrue(isCatDogEquals);
    }

    @Test
    void catDogNoneTest(){
        //given
        String str = "";
        //when
        boolean isCatDogEquals = stringMethods.catDog(str);
        //then
        assertTrue(isCatDogEquals);
    }

    @Test
    void countCodeCodeTest() {
        //given
        String str = "code";
        //when
        int result = stringMethods.countCode(str);
        //then
        assertEquals(1, result);
    }

    @Test
    void countCodeNoneTest(){
        //given
        String str = "";
        //when
        int result = stringMethods.countCode(str);
        //then
        assertEquals(0, result);
    }

    @Test
    void endOtherAbcAbcTest() {
        //given
        String a = "abc";
        String b = "abc";
        //when
        boolean isEndEqual = stringMethods.endOther(a, b);
        //then
        assertTrue(isEndEqual);
    }

    @Test
    void endOtherYzXzTest(){
        //given
        String a = "yz";
        String b = "Xz";
        //when
        boolean isEndEqual = stringMethods.endOther(a, b);
        //then
        assertFalse(isEndEqual);
    }

    @Test
    void xyzThereAbcxyzTest() {
        //given
        String str = "abcxyz";
        //when
        boolean isRareXyzAppear = stringMethods.xyzThere(str);
        //then
        assertTrue(isRareXyzAppear);
    }

    @Test
    void xyzThereXyTest(){
        //given
        String str = "xy";
        //when
        boolean isRareXyzAppear = stringMethods.xyzThere(str);
        //then
        assertFalse(isRareXyzAppear);
    }

    @Test
    void bobThereB9bTest() {
        //given
        String str = "b9b";
        //when
        boolean isBobContains = stringMethods.bobThere(str);
        //then
        assertTrue(isBobContains);
    }

    @Test
    void bobThereBacTest(){
        //given
        String str = "bac";
        //when
        boolean isBobContains = stringMethods.bobThere(str);
        //then
        assertFalse(isBobContains);
    }

    @Test
    void xyBalanceXxbxTest() {
        //given
        String str = "xxbx";
        //when
        boolean isXyBalance = stringMethods.xyBalance(str);
        //then
        assertFalse(isXyBalance);
    }

    @Test
    void xyBalanceXyTest(){
        //given
        String str = "xy";
        //when
        boolean isXyBalance = stringMethods.xyBalance(str);
        //then
        assertTrue(isXyBalance);
    }

    @Test
    void mixStringAbcXyz() {
        //given
        String a = "abc";
        String b = "xyz";
        //when
        String newStr = stringMethods.mixString(a, b);
        //then
        assertEquals("axbycz", newStr);
    }

    @Test
    void mixStringAxBTest(){
        //given
        String a = "ax";
        String b = "b";
        //when
        String newStr = stringMethods.mixString(a, b);
        //then
        assertEquals("abx", newStr);
    }

    @Test
    void repeatEndHelloThreeTest() {
        //given
        String str = "Hello";
        int n = 3;
        //when
        String newStr = stringMethods.repeatEnd(str, n);
        //then
        assertEquals("llollollo", newStr);
    }

    @Test
    void repeatEndAbcThreeTest(){
        //given
        String str = "abc";
        int n = 3;
        //when
        String newStr = stringMethods.repeatEnd(str, n);
        //then
        assertEquals("abcabcabc", newStr);
    }

    @Test
    void repeatFrontXyzThreeTest() {
        //given
        String str = "xyz";
        int n = 3;
        //when
        String newStr = stringMethods.repeatFront(str, n);
        //then
        assertEquals("xyzxyx", newStr);
    }

    @Test
    void repeatFrontJavaOneTest(){
        //given
        String str = "Java";
        int n = 1;
        //when
        String newStr = stringMethods.repeatFront(str, n);
        //then
        assertEquals("J", newStr);
    }

    @Test
    void repeatSeparatorThisAndTwoTest() {
        //given
        String word = "This";
        String sep = "And";
        int count = 2;
        //when
        String newStr = stringMethods.repeatSeparator(word, sep, count);
        //then
        assertEquals("ThisAndThis", newStr);
    }

    @Test
    void repeatSeparatorAbcXxThreeTest(){
        //given
        String word = "abc";
        String sep = "XX";
        int count = 3;
        //when
        String newStr = stringMethods.repeatSeparator(word, sep, count);
        //then
        assertEquals("abcXXabcXXabc", newStr);
    }

    @Test
    void prefixAgainAaOneTest() {
        //given
        String str = "aa";
        int n = 1;
        //when
        boolean isPrefixAppear = stringMethods.prefixAgain(str, n);
        //then
        assertTrue(isPrefixAppear);
    }

    @Test
    void prefixAgainAbXyAbcThreeTest(){
        //given
        String str = "abXYabc";
        int n = 3;
        //when
        boolean isPrefixAppear = stringMethods.prefixAgain(str, n);
        //then
        assertFalse(isPrefixAppear);
    }

    @Test
    void xyzMiddleAaXyzBbTest() {
        //given
        String str = "AAxyzBB";
        //when
        boolean isXyzInMiddle = stringMethods.xyzMiddle(str);
        //then
        assertTrue(isXyzInMiddle);
    }

    @Test
    void xyzMiddleAxyzBbbTest(){
        //given
        String str = "AxyzBBB";
        //when
        boolean isXyzInMiddle = stringMethods.xyzMiddle(str);
        //then
        assertFalse(isXyzInMiddle);
    }

    @Test
    void getSandwichDoubleBreadTest() {
        //given
        String str = "breadbread";
        //when
        String newStr = stringMethods.getSandwich(str);
        //then
        assertEquals("", newStr);
    }

    @Test
    void getSandwichBreadJamBreadTest(){
        //given
        String str = "breadjambread";
        //when
        String newStr = stringMethods.getSandwich(str);
        //then
        assertEquals("jam", newStr);
    }

    @Test
    void sameStarCharXyStarYzzTest() {
        //given
        String str = "xy*yzz";
        //when
        boolean isSameCharBetweenStar = stringMethods.sameStarChar(str);
        //then
        assertTrue(isSameCharBetweenStar);
    }

    @Test
    void sameStarCharXyStarZzzTest(){
        //given
        String str = "xy*zzz";
        //then
        boolean isSameCharBetweenStar = stringMethods.sameStarChar(str);
        //then
        assertFalse(isSameCharBetweenStar);
    }

    @Test
    void oneTwoAbcTest() {
        //given
        String str = "abc";
        //when
        String newStr = stringMethods.oneTwo(str);
        //then
        assertEquals("bca", newStr);
    }

    @Test
    void oneTwoTcaTest(){
        //given
        String str = "tca";
        //when
        String newStr = stringMethods.oneTwo(str);
        //then
        assertEquals("cat", newStr);
    }

    @Test
    void zipZapZipXzapTest() {
        //given
        String str = "zipXzap";
        //when
        String newStr = stringMethods.zipZap(str);
        //then
        assertEquals("zpXzp", newStr);
    }

    @Test
    void zipZapZzpTest(){
        //given
        String str = "zzp";
        //when
        String newStr = stringMethods.zipZap(str);
        //then
        assertEquals("zp", newStr);
    }
}