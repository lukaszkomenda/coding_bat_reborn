package org.example.arrayMethods;

public class ArrayMethodsImpl implements ArrayMethods {

    @Override
    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    @Override
    public boolean sameFirstLast(int[] nums) {
        if (nums.length > 0) {
            return nums[0] == nums[nums.length - 1];
        } else {
            return false;
        }
    }

    @Override
    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    @Override
    public boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0]) {
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
        return new int[]{nums[2], nums[1], nums[0]};
    }

    @Override
    public int[] maxEnd3(int[] nums) {
        if (nums[0] >= nums[nums.length - 1]) {
            return new int[]{nums[0], nums[0], nums[0]};
        } else {
            return new int[]{nums[nums.length - 1], nums[nums.length - 1], nums[nums.length - 1]};
        }
    }

    @Override
    public int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            return nums[0] + nums[1];
        }
    }

    @Override
    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    @Override
    public int[] makeEnds(int[] nums) {
        if (nums.length == 1) {
            return new int[]{nums[0], nums[0]};
        } else {
            return new int[]{nums[0], nums[nums.length - 1]};
        }
    }

    @Override
    public boolean has23(int[] nums) {
        if (nums[0] == 2 || nums[1] == 2) {
            return true;
        } else return nums[0] == 3 || nums[1] == 3;
    }

    @Override
    public boolean no23(int[] nums) {
        if (nums[0] == 2 || nums[0] == 3) {
            return false;
        }
        return nums[1] != 2 && nums[1] != 3;
    }

    @Override
    public int[] makeLast(int[] nums) {
        int[] newArray = new int[nums.length * 2];

        for (int i = 0; i < newArray.length - 1; i++) {
            newArray[i] = 0;
        }
        newArray[newArray.length - 1] = nums[nums.length - 1];

        return newArray;
    }

    @Override
    public boolean double23(int[] nums) {
        if (nums.length == 1 || nums.length == 0) {
            return false;
        } else if (nums[0] == 2 && nums[1] == 2) {
            return true;
        } else return nums[0] == 3 && nums[1] == 3;
    }

    @Override
    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        }
        if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }

    @Override
    public int start1(int[] a, int[] b) {
        int countA = 0;
        int countB = 0;

        if (a.length > 0 && a[0] == 1) {
            countA++;
        }

        if (b.length > 0 && b[0] == 1) {
            countB++;
        }
        return countA + countB;
    }

    @Override
    public int[] biggerTwo(int[] a, int[] b) {
        boolean isABiggerThanB = (a[0] + a[1]) >= (b[0] + b[1]);

        if (isABiggerThanB) {
            return a;
        } else {
            return b;
        }
    }

    @Override
    public int[] makeMiddle(int[] nums) {
        int length = nums.length;

        if (length == 2) {
            return nums;
        }
        return new int[]{nums[length / 2 - 1], nums[length / 2]};
    }

    @Override
    public int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }

    @Override
    public int[] swapEnds(int[] nums) {
        int firstLetter = nums[0];

        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = firstLetter;

        return nums;
    }

    @Override
    public int[] midThree(int[] nums) {
        int length = nums.length;

        if (length == 3) {
            return nums;
        }
        return new int[]{nums[length / 2 - 1], nums[length / 2], nums[length / 2 + 1]};
    }

    @Override
    public int maxTriple(int[] nums) {
        int firstValue = nums[0];
        int middleValue = nums[nums.length / 2];
        int lastValue = nums[nums.length - 1];

        if (firstValue >= middleValue && firstValue >= lastValue) {
            return firstValue;
        } else if (middleValue >= firstValue && middleValue >= lastValue) {
            return middleValue;
        } else {
            return lastValue;
        }

    }

    @Override
    public int[] frontPiece(int[] nums) {
        if (nums.length >= 2) {
            return new int[]{nums[0], nums[1]};
        } else {
            return nums;
        }
    }

    @Override
    public boolean unlucky1(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return false;
        }
        if (nums.length == 2) {
            return nums[0] == 1 && nums[1] == 3;
        } else {
            if (nums[0] == 1 && nums[1] == 3) {
                return true;
            } else {
                if (nums[1] == 1 && nums[2] == 3) {
                    return true;
                } else return nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3;
            }
        }
    }

    @Override
    public int[] make2(int[] a, int[] b) {
        if (a.length == 0){
            return new int[] {b[0], b[1]};
        } else if (a.length == 1){
            return new int[] {a[0], b[0]};
        } else {
            return new int[] {a[0], a[1]};
        }


    }

    @Override
    public int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length ==0){
            return a;
        } else if (a.length == 0){
            return new int[] {b[0]};
        } else if (b.length == 0){
            return new int[] {a[0]};
        } else {
            return new int[] {a[0], b[0]};
        }

    }
}
