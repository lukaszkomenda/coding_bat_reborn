package org.example.LastChars;

public class LastChars {
    public String lastChars(String a, String b){
        String result = "";

        if (a.length() != 0){
            result += a.substring(0,1);
        } else {
            result += "@";
        }

        if (b.length() != 0){
            result += b.substring(b.length()-1);
        } else {
            result += "@";
        }

        return result;
    }
}
