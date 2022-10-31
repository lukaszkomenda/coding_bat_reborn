package org.example.Front3;

public class Front3 {
    public String front3(String str){
        String threeLetters;

        if (str.length() >= 3){
            threeLetters = str.substring(0,3);
        } else {
            threeLetters = str;
        }
        return threeLetters + threeLetters + threeLetters;
    }
}
