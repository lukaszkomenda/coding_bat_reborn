package org.example.ConCat;

public class ConCat {

    public String conCat(String a, String b){

        String mergedAb = a + b;

        if (a.length() != 0 && b.length() != 0){
            String lastLetterA = a.substring(a.length() -1);
            String firstLetterB = b.substring(0,1);

            if (lastLetterA.equals(firstLetterB)){
                return a + b.substring(1);
            } else {
                return mergedAb;
            }
        } else {
            return mergedAb;
        }

    }
}
