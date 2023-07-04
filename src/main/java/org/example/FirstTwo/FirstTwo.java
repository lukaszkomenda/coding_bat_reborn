package org.example.FirstTwo;

public class FirstTwo {
    public String firstTwo(String str){
        if (str.length() >= 2){
            return str.substring(0,2);
        } else if (str.length() == 1) {
            return str.substring(0,1);
        } else {
            return "";
        }
    }
}
