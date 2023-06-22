package org.example.basicWarmupMethods;

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
}
