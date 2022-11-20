package org.example.TwoChar;

public class TwoChar {

    public String twoChar(String str, int index){
        boolean isItCharsInWord = index + 2 <= str.length() && index >= 0;

        if(isItCharsInWord){
            return str.substring(index, index + 2);
        } else {
            return str.substring(0,2);
        }
    }
}
