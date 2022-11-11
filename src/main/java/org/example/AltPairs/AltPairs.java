package org.example.AltPairs;

public class AltPairs {
    public String altPairs(String str){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i+=4) {
            int end = i +2;

            if (end > str.length()){
                end = str.length();
            }
            result.append(str, i, end);
        }
        return result.toString();
    }
}
