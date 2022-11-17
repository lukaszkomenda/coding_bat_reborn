package org.example.WithoutEnd2;

public class WithoutEnd2 {
    public String withoutEnd2(String str){
        if(str.length() >= 2){
            return str.substring(1, str.length() - 1);
        } else{
            return "";
        }
    }
}
