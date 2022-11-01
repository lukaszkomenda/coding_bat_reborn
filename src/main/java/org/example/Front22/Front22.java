package org.example.Front22;

public class Front22 {
    public String front22 (String str){
        if (str.length() >= 2) {
            return str.substring(0, 2) + str.substring(0, 2)
                    + str.substring(2) + str.substring(0, 2);
        } else if (str.length() == 1){
            return str + str + str;
        } else {
            return str;
        }
    }
}
