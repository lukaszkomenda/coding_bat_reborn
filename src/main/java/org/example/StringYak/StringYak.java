package org.example.StringYak;

public class StringYak {
    public String stringYak(String str){
        if (str.contains("yak")){
            return str.replace("yak", "");
        }
        return str;
    }
}
