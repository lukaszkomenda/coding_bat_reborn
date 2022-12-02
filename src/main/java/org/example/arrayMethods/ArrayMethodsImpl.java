package org.example.arrayMethods;

public class ArrayMethodsImpl implements ArrayMethods {

    @Override
    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    @Override
    public boolean sameFirstLast(int[] nums) {
        if (nums.length > 0){
            return nums[0] == nums[nums.length - 1];
        } else {
            return false;
        }
    }
}
