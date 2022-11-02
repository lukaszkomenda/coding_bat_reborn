package org.example.HasTeen;

public class HasTeen {
    public boolean hasTeen(int a, int b, int c){
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
}
