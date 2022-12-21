package org.example.puzzle;

public class PuzzleMethodsImpl implements PuzzleMethods{
    @Override
    public boolean makeBricks(int small, int big, int goal) {
        int remainder = goal >= (5 * big) ? goal - (5 * big) : goal % 5;

        return small >= remainder;
    }

    @Override
    public int loneSum(int a, int b, int c) {
        if (a == b && b == c){
            return 0;
        } else if (a == b){
            return c;
        } else if (b == c){
            return a;
        } else if (a == c){
            return b;
        }
        return a + b + c;
    }

    @Override
    public int luckySum(int a, int b, int c) {
        if (a == 13){
            return 0;
        } else if (b == 13){
            return a;
        } else if (c == 13){
            return a + b;
        }
        return a + b + c;
    }
}
