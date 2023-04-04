package org.example.simpleRecursionMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleRecursionMethodsImplTest {

    SimpleRecursionMethods simpleRecursionMethods = new SimpleRecursionMethodsImpl();

    @Test
    void factorialThreeTest() {
        //given
        int n = 3;
        //when
        int result = simpleRecursionMethods.factorial(n);
        //then
        assertEquals(6, result);
    }

    @Test
    void factorialFourTest(){
        //given
        int n = 4;
        //when
        int result = simpleRecursionMethods.factorial(n);
        //then
        assertEquals(24, result);
    }

    @Test
    void bunnyEarsOneTest() {
        //given
        int n = 1;
        //when
        int result = simpleRecursionMethods.bunnyEars(n);
        //then
        assertEquals(2, result);
    }

    @Test
    void bunnyEarsFourTest(){
        //given
        int n = 4;
        //when
        int result = simpleRecursionMethods.bunnyEars(n);
        //then
        assertEquals(8, result);
    }

    @Test
    void fibonacciSixTest() {
        //given
        int n = 6;
        //when
        int result = simpleRecursionMethods.fibonacci(n);
        //then
        assertEquals(8, result);
    }

    @Test
    void fibonacciSevenTest(){
        //given
        int n = 7;
        //when
        int result = simpleRecursionMethods.fibonacci(n);
        //then
        assertEquals(13, result);
    }

    @Test
    void bunnyEars2ThreeTest(){
        //given
        int n = 3;
        //when
        int result = simpleRecursionMethods.bunnyEars2(n);
        //then
        assertEquals(7, result);
    }

    @Test
    void bunnyEars2FourTest(){
        //given
        int n = 4;
        //when
        int result = simpleRecursionMethods.bunnyEars2(n);
        //then
        assertEquals(10, result);
    }

    @Test
    void triangleTwoTest() {
        //given
        int rows = 2;
        //when
        int result = simpleRecursionMethods.triangle(rows);
        //then
        assertEquals(3, result);
    }

    @Test
    void triangleFourTest(){
        //given
        int rows = 4;
        //when
        int result = simpleRecursionMethods.triangle(rows);
        //then
        assertEquals(10, result);
    }

    @Test
    void sumDigitsFourtyNineTest() {
        //given
        int n = 49;
        //when
        int result = simpleRecursionMethods.sumDigits(n);
        //then
        assertEquals(13, result);
    }

    @Test
    void sumDigitsTwelveTest(){
        //given
        int n = 12;
        //when
        int result = simpleRecursionMethods.sumDigits(n);
        //then
        assertEquals(3, result);
    }

    @Test
    void count7SeventySevenTest() {
        //given
        int n = 77;
        //when
        int result = simpleRecursionMethods.count7(n);
        //then
        assertEquals(2, result);
    }

    @Test
    void count7SevenTest(){
        //given
        int n = 7;
        //when
        int result = simpleRecursionMethods.count7(n);
        //then
        assertEquals(1, result);
    }

    @Test
    void count8EightOneEightTest() {
        //given
        int n = 818;
        //when
        int result = simpleRecursionMethods.count8(n);
        //then
        assertEquals(2, result);
    }

    @Test
    void count8DoubleEightOneEightTest(){
        //given
        int n = 8818;
        //when
        int result = simpleRecursionMethods.count8(n);
        //then
        assertEquals(4, result);
    }

    @Test
    void powerNThreeTwoTest() {
        //given
        int base = 3;
        int n = 2;
        //when
        int result = simpleRecursionMethods.powerN(base, n);
        //then
        assertEquals(9, result);
    }

    @Test
    void powerNDoubleTwoTest(){
        //given
        int base = 2;
        int n = 2;
        //when
        int result = simpleRecursionMethods.powerN(base, n);
        //then
        assertEquals(4, result);
    }

    @Test
    void countXXxhixxTest() {
        //given
        String str = "xxhixx";
        //when
        int result = simpleRecursionMethods.countX(str);
        //then
        assertEquals(4, result);
    }

    @Test
    void countXHiTest(){
        //given
        String str = "hi";
        //when
        int result = simpleRecursionMethods.countX(str);
        //then
        assertEquals(0, result);
    }

    @Test
    void countHiXxhixxTest() {
        //given
        String str = "xxhixx";
        //when
        int result = simpleRecursionMethods.countHi(str);
        //then
        assertEquals(1, result);
    }

    @Test
    void countHiHihihTest(){
        //given
        String str = "hihih";
        //when
        int result = simpleRecursionMethods.countHi(str);
        //then
        assertEquals(2, result);
    }

    @Test
    void changeXYCodexTest() {
        //given
        String str = "codex";
        //when
        String newStr = simpleRecursionMethods.changeXY(str);
        //then
        assertEquals("codey", newStr);
    }

    @Test
    void changeXYXxxTest(){
        //given
        String str = "xxx";
        //when
        String newStr = simpleRecursionMethods.changeXY(str);
        //then
        assertEquals("yyy", newStr);
    }

    @Test
    void changePiXpixTest() {
        //given
        String str = "xpix";
        //when
        String newStr = simpleRecursionMethods.changePi(str);
        //then
        assertEquals("x3.14x", newStr);
    }

    @Test
    void changePiPiTest(){
        //given
        String str = "pi";
        //when
        String newStr = simpleRecursionMethods.changePi(str);
        //then
        assertEquals("3.14", newStr);
    }

    @Test
    void noXXaxbTest() {
        //given
        String str = "xaxb";
        //when
        String newStr = simpleRecursionMethods.noX(str);
        //then
        assertEquals("ab", newStr);
    }

    @Test
    void noXHelloxTest(){
        //given
        String str = "Hellox";
        //when
        String newStr = simpleRecursionMethods.noX(str);
        //then
        assertEquals("Hello", newStr);
    }

    @Test
    void array6OneSixFourAndZeroTest() {
        //given
        int[] nums = {1,6,4};
        int index = 0;
        //when
        boolean isSix = simpleRecursionMethods.array6(nums, index);
        //then
        assertTrue(isSix);
    }

    @Test
    void array6OneFourAndZeroTest(){
        //given
        int[] nums = {1,4};
        int index = 0;
        //when
        boolean isSix = simpleRecursionMethods.array6(nums, index);
        //then
        assertFalse(isSix);
    }

    @Test
    void array11OneTwoElevenAndZeroTest() {
        //given
        int[] nums = {1,2,11};
        int index = 0;
        //when
        int result = simpleRecursionMethods.array11(nums, index);
        //then
        assertEquals(1, result);
    }

    @Test
    void array11DoubleElevenAndZeroTest(){
        //given
        int[] nums = {11,11};
        int index = 0;
        //when
        int result = simpleRecursionMethods.array11(nums, index);
        //then
        assertEquals(2, result);
    }

    @Test
    void array220OneTwoTwentyAndZeroTest() {
        //given
        int[] nums = {1,2,20};
        int index = 0;
        //when
        boolean isTenDiversify = simpleRecursionMethods.array220(nums, index);
        //then
        assertTrue(isTenDiversify);
    }

    @Test
    void array220ThreeAndZeroTest(){
        //given
        int[] nums = {3};
        int index = 0;
        //when
        boolean isTenDiversify = simpleRecursionMethods.array220(nums, index);
        //then
        assertFalse(isTenDiversify);
    }

    @Test
    void allStarHelloTest() {
        //given
        String str = "hello";
        //when
        String newStr = simpleRecursionMethods.allStar(str);
        //then
        assertEquals("h*e*l*l*o", newStr);
    }

    @Test
    void allStarAbcTest(){
        //given
        String str = "abc";
        //when
        String newStr = simpleRecursionMethods.allStar(str);
        //then
        assertEquals("a*b*c", newStr);
    }

    @Test
    void pairStarHelloTest() {
        //given
        String str = "hello";
        //when
        String newStr = simpleRecursionMethods.pairStar(str);
        //then
        assertEquals("hel*lo", newStr);
    }

    @Test
    void pairStarXxyyTest(){
        //given
        String str = "xxyy";
        //when
        String newStr = simpleRecursionMethods.pairStar(str);
        //then
        assertEquals("x*xy*y", newStr);
    }

    @Test
    void endXXxreTest() {
        //given
        String str = "xxre";
        //when
        String newStr = simpleRecursionMethods.endX(str);
        //then
        assertEquals("rexx", newStr);
    }

    @Test
    void endXBxxTest(){
        //given
        String str = "bxx";
        //when
        String newStr = simpleRecursionMethods.endX(str);
        //then
        assertEquals("bxx", newStr);
    }

    @Test
    void countPairsAxaTest() {
        //given
        String str = "axa";
        //when
        int result = simpleRecursionMethods.countPairs(str);
        //then
        assertEquals(1, result);
    }

    @Test
    void countPairsAxaxTest(){
        //given
        String str = "axax";
        //when
        int result = simpleRecursionMethods.countPairs(str);
        //then
        assertEquals(2, result);
    }

    @Test
    void countAbcAbcTest() {
        //given
        String str = "abc";
        //when
        int result = simpleRecursionMethods.countAbc(str);
        //then
        assertEquals(1, result);
    }

    @Test
    void countAbcAbcxxabcTest(){
        //given
        String str = "abcxxabc";
        //when
        int result = simpleRecursionMethods.countAbc(str);
        //then
        assertEquals(2, result);
    }

    @Test
    void count11111Test() {
        //given
        String str = "111";
        //when
        int result = simpleRecursionMethods.count11(str);
        //then
        assertEquals(1, result);
    }

    @Test
    void count11HiTest(){
        //given
        String str = "hi";
        //when
        int result = simpleRecursionMethods.count11(str);
        //then
        assertEquals(0, result);
    }

    @Test
    void stringCleanYyzzzaTest() {
        //given
        String str = "yyzzza";
        //when
        String newStr = simpleRecursionMethods.stringClean(str);
        //then
        assertEquals("yza", newStr);
    }

    @Test
    void stringCleanHelloTest(){
        //given
        String str = "Hello";
        //when
        String newStr = simpleRecursionMethods.stringClean(str);
        //then
        assertEquals("Helo", newStr);
    }

    @Test
    void countHi2AhibhiTest() {
        //given
        String str = "ahibhi";
        //when
        int result = simpleRecursionMethods.countHi2(str);
        //then
        assertEquals(2, result);
    }

    @Test
    void countHi2HihihiTest(){
        //given
        String str = "hihihi";
        //when
        int result = simpleRecursionMethods.countHi2(str);
        //then
        assertEquals(3, result);
    }

    @Test
    void parenBitXAndHelloInBracketsTest() {
        //given
        String str = "x(hello)";
        //when
        String newStr = simpleRecursionMethods.parenBit(str);
        //then
        assertEquals("(hello)", newStr);
    }

    @Test
    void parenBitXInBracketsTest(){
        //given
        String str = "(x)";
        //when
        String newStr = simpleRecursionMethods.parenBit(str);
        //then
        assertEquals("(x)", newStr);
    }

    @Test
    void nestParenDoubleBracketsTest() {
        //given
        String str = "(())";
        //when
        boolean isNoneInBrackets = simpleRecursionMethods.nestParen(str);
        //then
        assertTrue(isNoneInBrackets);
    }

    @Test
    void nestParenXInTripleBracketsTest(){
        //given
        String str = "(((x)))";
        //when
        boolean isNoneInBrackets = simpleRecursionMethods.nestParen(str);
        //then
        assertFalse(isNoneInBrackets);
    }

    @Test
    void strCountCatCowCatAndCatTest() {
        //given
        String str = "catcowcat";
        String sub = "cat";
        //when
        int result = simpleRecursionMethods.strCount(str, sub);
        //then
        assertEquals(2, result);
    }

    @Test
    void strCountXyxAndXTest(){
        //given
        String str = "xyz";
        String sub = "x";
        //when
        int result = simpleRecursionMethods.strCount(str, sub);
        //then
        assertEquals(1, result);
    }

    @Test
    void strCopiesCatCowCatAndCatAndTwoTest() {
        //given
        String str = "catcowcat";
        String sub = "cat";
        int n = 2;
        //when
        boolean isSubAppearNTimes = simpleRecursionMethods.strCopies(str, sub, n);
        //then
        assertTrue(isSubAppearNTimes);
    }

    @Test
    void strCopiesCatCowCatAndCowAndTwoTest(){
        //given
        String str = "catcowcat";
        String sub = "cow";
        int n = 2;
        //when
        boolean isSubAppearNTimes = simpleRecursionMethods.strCopies(str, sub, n);
        //then
        assertFalse(isSubAppearNTimes);
    }

    @Test
    void strDistXyzAndYTest() {
        //given
        String str = "xyz";
        String sub = "y";
        //when
        int result = simpleRecursionMethods.strDist(str, sub);
        //then
        assertEquals(1, result);
    }

    @Test
    void strDistZAndZTest(){
        //given
        String str = "z";
        String sub = "z";
        //when
        int result = simpleRecursionMethods.strDist(str, sub);
        //then
        assertEquals(1, result);
    }
}