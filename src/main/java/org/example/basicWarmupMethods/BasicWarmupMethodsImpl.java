package org.example.basicWarmupMethods;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class BasicWarmupMethodsImpl implements BasicWarmupMethods{
    @Override
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday && !vacation) {
            return true;
        }
        return !weekday || vacation;
    }

    @Override
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        } else return !aSmile && !bSmile;
    }

    @Override
    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        } else return a + b;
    }

    @Override
    public int diff21(int n) {
        if (n <= 21){
            return 21 - n;
        } else {
            return (n-21)*2;
        }
    }

    @Override
    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    @Override
    public boolean makes10(int a, int b) {
        return a == 10 || b == 10 || a + b == 10;
    }

    @Override
    public boolean nearHundred(int n) {
        return n >= 90 && n <= 110 || n >= 190 && n <= 210;
    }

    @Override
    public boolean posNeg(int a, int b, boolean negative) {
        if(negative){
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    @Override
    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }

    @Override
    public String missingChar(String str, int n) {
        return str.substring(0,n)+str.substring(n+1);
    }

    @Override
    public String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            return (str.substring(str.length() - 1)
                    + str.substring(1, str.length() - 1)
                    + str.charAt(0));
        }
    }

    @Override
    public String front3(String str) {
        String threeLetters;

        if (str.length() >= 3){
            threeLetters = str.substring(0,3);
        } else {
            threeLetters = str;
        }
        return threeLetters + threeLetters + threeLetters;
    }

    @Override
    public String backAround(String str) {
        return str.charAt(str.length() -1) + str + str.charAt(str.length() -1);
    }

    @Override
    public boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    @Override
    public String front22(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2) + str.substring(0, 2)
                    + str.substring(2) + str.substring(0, 2);
        } else if (str.length() == 1){
            return str + str + str;
        } else {
            return str;
        }
    }

    @Override
    public boolean startHi(String str) {
        if (str.length() >= 2){
            return str.startsWith("hi");
        } else {
            return false;
        }
    }

    @Override
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
    }

    @Override
    public boolean in1020(int a, int b) {
        if (a >= 10 && a <= 20){
            return true;
        } else {
            return b >= 10 && b <= 20;
        }
    }

    @Override
    public boolean hasTeen(int a, int b, int c) {
        if (a >= 13 && a <= 19){
            return true;
        } else {
            if (b >= 13 && b <= 19){
                return true;
            } else {
                return c >= 13 && c <= 19;
            }
        }
    }

    @Override
    public boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) && (b >= 13 && b <= 19)){
            return false;
        } else {
            if (a >= 13 && a <=19){
                return true;
            } else {
                return b >= 13 && b <= 19;
            }
        }
    }

    @Override
    public String delDel(String str) {
        if (str.length() >= 4 && str.startsWith("del", 1)) return str.charAt(0) + str.substring(4);
        else {
            return str;
        }
    }

    @Override
    public boolean mixStart(String str) {
        if (str.length() >= 3){
            return str.startsWith("ix", 1);
        } else {
            return false;
        }
    }

    @Override
    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o'){
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1) == 'z'){
            result = result + str.charAt(1);
        }

        return result;
    }

    @Override
    public int intMax(int a, int b, int c) {
        List<Integer> listOfValues = Arrays.asList(a,b,c);

        return listOfValues
                .stream()
                .mapToInt(value -> value)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }

    @Override
    public int close10(int a, int b) {
        if (Math.abs(10-a) > Math.abs(10-b)){
            return b;
        } else if (Math.abs(10 -a) == Math.abs(10-b)) {
            return 0;
        } else {
            return a;
        }
    }

    @Override
    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40){
            return true;
        }
        return a >= 40 && a <= 50 && b >= 40 && b <= 50;
    }

    @Override
    public int max1020(int a, int b) {
        if (a < 10 || a > 20){
            a = 0;
        }

        if (b < 10 || b > 20){
            b = 0;
        }

        if (a == 0 && b == 0){
            return 0;
        }

        List<Integer> listOfValues = Arrays.asList(a,b);

        return listOfValues
                .stream()
                .mapToInt(value -> value)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }

    @Override
    public boolean stringE(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e'){
                count++;
            }
        }
        return (count >= 1 && count <=3);
    }

    @Override
    public boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }

    @Override
    public String endUp(String str) {
        int length = str.length();

        if (length >= 4){
            return str.substring(0, length - 3) + str
                    .substring(length - 3)
                    .toUpperCase();
        } else {
            return str.toUpperCase();
        }
    }

    @Override
    public String everyNth(String str, int n) {
        StringBuilder textNew = new StringBuilder();

        for (int i = 0; i < str.length(); i += n) {
            textNew.append(str.charAt(i));

        }
        return textNew.toString();
    }
}
