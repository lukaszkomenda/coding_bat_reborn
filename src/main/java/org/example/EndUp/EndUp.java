package org.example.EndUp;

public class EndUp {
    public String endUp(String str){
        int length = str.length();

        if (length >= 4){
            return str.substring(0, length - 3) + str
                    .substring(length - 3)
                    .toUpperCase();
        } else {
            return str.toUpperCase();
        }
    }
}
