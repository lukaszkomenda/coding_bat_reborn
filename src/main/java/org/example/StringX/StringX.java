package org.example.StringX;

public class StringX {
    public String stringX(String str){
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (!(i > 0 && i < (str.length()-1) && str.charAt(i) == 'x')){
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();
    }
}
