package org.example.MiddleThree;

public class MiddleThree {

    public String middleThree(String str){
        int position;
        int length;

        if (str.length() % 2 == 0){
            position = str.length() / 2 - 1;
            length = 3;
        } else{
            position = str.length() / 2;
            length = 2;
        }
        return str.substring(position - 1, position + length);
    }
}
