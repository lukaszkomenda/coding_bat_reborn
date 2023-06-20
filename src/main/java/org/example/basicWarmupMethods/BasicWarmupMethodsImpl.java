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
}
