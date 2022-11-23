package org.example.LastTwo;

public class LastTwo {

    public String lastTwo(String str){
        int length = str.length();

        if (length > 2){
            String beforeLastChar = str.substring(length - 2, length - 1);
            String lastChar = str.substring(length-1);

            return str.substring(0, length -2) + lastChar + beforeLastChar;
        } else if (length == 2){
            String beforeLastChar = str.substring(length - 2, length - 1);
            String lastChar = str.substring(length-1);

            return lastChar + beforeLastChar;
        } else {
            return str;
        }
    }
}
