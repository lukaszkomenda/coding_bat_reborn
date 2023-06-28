package org.example.DoubleX;

public class DoubleX {
    public boolean doubleX(String str){
        int xIndex = str.indexOf("x");

        if (xIndex == -1){
            return false;
        }

        if (xIndex + 1 >= str.length()){
            return false;
        }

        return str.substring(xIndex + 1, xIndex + 2).equals("x");
    }
}
