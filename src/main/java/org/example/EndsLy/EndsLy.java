package org.example.EndsLy;

public class EndsLy {

    public boolean endsLy(String str){
        int length = str.length();

        if (length >= 2){
            return str.endsWith("ly");
        } else {
            return false;
        }
    }
}
