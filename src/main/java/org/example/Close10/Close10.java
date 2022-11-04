package org.example.Close10;

public class Close10 {
    public int close10(int a, int b){
        if (Math.abs(10-a) > Math.abs(10-b)){
            return b;
        } else if (Math.abs(10 -a) == Math.abs(10-b)) {
            return 0;
        } else {
            return a;
        }
    }
}
