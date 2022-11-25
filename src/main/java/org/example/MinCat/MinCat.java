package org.example.MinCat;

public class MinCat {

    public String minCat(String a, String b){
        int lengthA = a.length();
        int lengthB = b.length();

        if (lengthA == 0 || lengthB == 0){
            return "";
        }  else {
            if (lengthA == lengthB){
                return a + b;
            } else if (lengthA > lengthB) {
                return a.substring(lengthA - lengthB) + b;
            } else {
                return a + b.substring(lengthB - lengthA);
            }
        }
    }
}
