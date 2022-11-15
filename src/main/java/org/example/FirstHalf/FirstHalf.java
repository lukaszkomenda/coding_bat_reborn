package org.example.FirstHalf;

public class FirstHalf {
    public String firstHalf(String str){
        int half = str.length() /2;
        return str.substring(0,half);
    }
}
