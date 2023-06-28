package org.example.CountXX;

public class CountXX {
    public int countXX(String str){
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith("xx", i)){
                counter++;
            }
        }
        return counter;
    }
}
