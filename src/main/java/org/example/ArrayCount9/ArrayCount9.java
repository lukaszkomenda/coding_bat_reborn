package org.example.ArrayCount9;

public class ArrayCount9 {
    public int arrayCount9(int[] nums){
        int counter = 0;

        for (int num : nums) {
            if (num == 9) counter++;
        }

        return counter;
    }
}
