package org.example.MiddleTwo;

public class MiddleTwo {

    public String middleTwo(String str){
        int length = str.length();
        if (length > 2){
            return str.substring(length/2 - 1, length / 2 + 1);
        } else {
            return str;
        }
    }
}
