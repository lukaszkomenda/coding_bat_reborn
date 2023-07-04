package org.example.WithoutX2;

public class WithoutX2 {

    public String withoutX2(String str) {
        if (str.length() == 0) {
            return str;
        } else if (str.length() == 1) {
            if (str.startsWith("x")) {
                return str.substring(1);
            } else {
                return str;
            }
        } else {
            if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
                return str.substring(2);
            } else if (str.charAt(0) != 'x' && str.charAt(1) == 'x') {
                return str.charAt(0) + str.substring(2);


            } else if (str.charAt(0) == 'x' && str.charAt(1) != 'x') {
                return str.substring(1);
            } else {
                return str;
            }
        }
    }
}

//if (str.length() == 0){
//        return str;
//        } else if (str.length() == 1){
//        if (str.startsWith("x")){
//        return str.substring(1);
//        } else {
//        return str;
//        }
//        } else {
//        if (str.substring(0,1).equals("x") && str.substring(1,2).equals("x")){
//        return str.substring(2);
//        } else if (!str.substring(0,1).equals("x") && str.substring(1,2).equals("x")) {
//        return str.substring(0,1) + str.substring(2);
//        } else if (str.substring(0, 1).equals("x") && !str.substring(1, 2).equals("x")) {
//        return str.substring(1);
//        } else {
//        return str;
//        }
//        }
