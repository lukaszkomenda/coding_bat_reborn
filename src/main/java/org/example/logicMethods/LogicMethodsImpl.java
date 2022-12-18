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

    @Override
    public boolean nearTen(int num) {
        return num % 10 <= 2 || num % 10 >= 8;
    }

    @Override
    public int teenSum(int a, int b) {
        if (a >= 13 && a <= 19) {
            return 19;
        } else if (b >= 13 && b <= 19) {
            return 19;
        } else {
            return a + b;
        }
    }

    @Override
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }

        if (isMorning) {
            return isMom;
        }

        return true;
    }

    @Override
    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        } else {
            if (tea >= candy * 2 || candy >= tea * 2) {
                return 2;
            } else {
                return 1;
            }
        }
    }

    @Override
    public String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } else {
            return str;
        }
    }

    @Override
    public boolean twoAsOne(int a, int b, int c) {
        if (a + b == c) {
            return true;
        } else if (a + c == b) {
            return true;
        } else return b + c == a;
    }

    @Override
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            return c > b;
        } else {
            return b > a && c > b;
        }
    }

    @Override
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            if (a == b && a == c) {
                return true;
            }
            return b >= a && c >= b;
        } else {
            return b > a && c > b;
        }
    }

    @Override
    public boolean lastDigit(int a, int b, int c) {
        if (a%10==b%10){
            return true;
        }
        if (a%10==c%10){
            return true;
        }
        return b % 10 == c % 10;
    }

    @Override
    public boolean lessBy10(int a, int b, int c) {
        if (a >= b + 10 || a >= c + 10){
            return true;
        }
        if (b >= a + 10 || b >= c + 10){
            return true;
        }
        return c >= a + 10 || c >= b + 10;
    }

    @Override
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles){
            if (die1 == die2){
                if (die1 == 6){
                    return ++die1;
                }
                return die1 + die2 + 1;
            }
        }
        return die1 + die2;
    }

    @Override
    public int maxMod5(int a, int b) {
        if (a == b ){
            return 0;
        } else if (a > b) {
            if (a%5 == b%5){
                return b;
            }
            return a;
        } else {
            if (a%5 == b%5){
                return a;
            }
            return b;
        }
    }

    @Override
    public int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2){
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else {
            if (b != a && c != a){
                return 1;
            }
        }
        return 0;
    }

    @Override
    public int greenTicket(int a, int b, int c) {

        if (a==b && b==c){
            return 20;
        }
        if (a== b || a == c || b == c){
            return 10;
        }
        return 0;
    }

    @Override
    public int blueTicket(int a, int b, int c) {
        if (a + b == 10 || a + c == 10 || b + c == 10){
            return 10;
        }
        if (a + b >= b + c + 10 || a + b >= a + c + 10){
            return 5;
        }
        return 0;
    }
}
