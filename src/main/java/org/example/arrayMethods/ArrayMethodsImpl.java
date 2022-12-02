package org.example.arrayMethods;

public class ArrayMethodsImpl implements ArrayMethods {

    @Override
    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }
}
