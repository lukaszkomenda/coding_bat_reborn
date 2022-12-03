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

    @Override
    public int[] makePi() {
        return new int[]{3,1,4};
    }

    @Override
    public boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0]){
            return true;
        }

        return a[a.length - 1] == b[b.length - 1];
    }

    @Override
    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    @Override
    public int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }

    @Override
    public int[] reverse3(int[] nums) {
        return new int[] {nums[2], nums[1], nums[0]};
    }
}
