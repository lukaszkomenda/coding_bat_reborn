package org.example.mediumWarmupMethods;

public class MediumWarmupMethodsImpl implements MediumWarmupMethods{
    @Override
    public String stringTimes(String str, int n) {
        return String.valueOf(str).repeat(Math.max(0, n));
    }

    @Override
    public String frontTimes(String str, int n) {
        int frontLen = 3;

        if (frontLen > str.length()){
            frontLen = str.length();
        }

        String front = str.substring(0,frontLen);

        return front.repeat(Math.max(0, n));
    }

    @Override
    public int countXX(String str) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith("xx", i)){
                counter++;
            }
        }
        return counter;
    }

    @Override
    public boolean doubleX(String str) {
        int xIndex = str.indexOf("x");

        if (xIndex == -1){
            return false;
        }

        if (xIndex + 1 >= str.length()){
            return false;
        }

        return str.charAt(xIndex + 1) == 'x';
    }


}
