package org.example.EveryNth;

public class EveryNth {
    public String everyNth(String str, int n){
        StringBuilder textNew = new StringBuilder();

        for (int i = 0; i < str.length(); i+=n) {
            textNew.append(str.charAt(i));
        }
        return textNew.toString();
    }
}
