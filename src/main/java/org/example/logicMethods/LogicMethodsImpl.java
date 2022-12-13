package org.example.logicMethods;

public class LogicMethodsImpl implements LogicMethods {
    @Override
    public boolean cigarParty(int cigars, boolean isWeekend) {

        boolean isInRange = cigars >= 40 && cigars <= 60;

        if (isInRange) {
            return true;
        } else {
            return isWeekend && cigars >= 40;
        }
    }

    @Override
    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2)
            return 0;

        if (you >= 8 || date >= 8)
            return 2;

        return 1;
    }

    @Override
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            return temp >= 60 && temp <= 100;
        } else {
            return temp >= 60 && temp <= 90;
        }
    }

    @Override
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            if (speed <= 65) {
                return 0;
            } else if (speed <= 85) {
                return 1;
            } else {
                return 2;
            }
        } else {
            if (speed <= 60) {
                return 0;
            } else if (speed <= 80) {
                return 1;
            } else {
                return 2;
            }
        }
    }

    @Override
    public int sortaSum(int a, int b) {
        int sum = a + b;

        if (sum >= 10 && sum <= 19) {
            return 20;
        } else {
            return sum;
        }
    }

    @Override
    public String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day <= 5 && day != 0) {
                return "10:00";
            } else {
                return "off";
            }
        } else {
            if (day <= 5 && day != 0) {
                return "7:00";
            } else {
                return "10:00";
            }
        }
    }

    @Override
    public boolean love6(int a, int b) {
        int six = 6;

        if (a == six || b == six) {
            return true;
        } else if (a + b == six) {
            return true;
        } else return Math.abs(a - b) == six || Math.abs(b - a) == six;
    }

    @Override
    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            return n <= 1 || n >= 10;
        } else {
            return n >= 1 && n <= 10;
        }
    }

    @Override
    public boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    @Override
    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    @Override
    public boolean old35(int n) {
        if (n % 3 == 0 && n % 5 != 0) {
            return true;
        }

        return n % 5 == 0 && n % 3 != 0;
    }

    @Override
    public boolean less20(int n) {
        return n % 20 == 19 || n % 20 == 18;
    }
}
