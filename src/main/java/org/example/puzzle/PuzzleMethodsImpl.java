package org.example.puzzle;

public class PuzzleMethodsImpl implements PuzzleMethods {
    @Override
    public boolean makeBricks(int small, int big, int goal) {
        int remainder = goal >= (5 * big) ? goal - (5 * big) : goal % 5;

        return small >= remainder;
    }

    @Override
    public int loneSum(int a, int b, int c) {
        if (a == b && b == c) {
            return 0;
        } else if (a == b) {
            return c;
        } else if (b == c) {
            return a;
        } else if (a == c) {
            return b;
        }
        return a + b + c;
    }

    @Override
    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        } else if (b == 13) {
            return a;
        } else if (c == 13) {
            return a + b;
        }
        return a + b + c;
    }

    @Override
    public int noTeenSum(int a, int b, int c) {
        if (a == 13 || a == 14 || a == 17 || a == 18 || a == 19) {
            a = 0;
        }
        if (b == 13 || b == 14 || b == 17 || b == 18 || b == 19) {
            b = 0;
        }
        if (c == 13 || c == 14 || c == 17 || c == 18 || c == 19) {
            c = 0;
        }
        return a + b + c;
    }

    @Override
    public int roundSum(int a, int b, int c) {
        int remainderA = a % 10;
        int remainderB = b % 10;
        int remainderC = c % 10;

        if (remainderA >= 5) {
            a += 10 - remainderA;
        } else {
            a -= remainderA;
        }

        if (remainderB >= 5) {
            b += 10 - remainderB;
        } else {
            b -= remainderB;
        }
        if (remainderC >= 5) {
            c += 10 - remainderC;
        } else {
            c -= remainderC;
        }
        return a + b + c;
    }

    @Override
    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        } else return Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2;

    }

}
