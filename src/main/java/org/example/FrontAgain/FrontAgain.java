package org.example.FrontAgain;

public class FrontAgain {

    public boolean frontAgain(String str){

        if (str.length() >= 2){
            String front = str.substring(0,2);

            return str.endsWith(front);
        } else {
            return false;
        }


    }
}
