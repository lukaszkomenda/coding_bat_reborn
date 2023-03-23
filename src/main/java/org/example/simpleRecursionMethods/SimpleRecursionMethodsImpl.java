package org.example.simpleRecursionMethods;

public class SimpleRecursionMethodsImpl implements SimpleRecursionMethods{
    @Override
    public int factorial(int n) {

        if (n <= 2){
            return n;
        }

        return n*factorial(n-1);
    }

    @Override
    public int bunnyEars(int bunnies) {
        return bunnies * 2;
    }

    @Override
    public int fibonacci(int n) {
        if(n <= 1)
            return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }

    @Override
    public int bunnyEars2(int bunnies) {
        if(bunnies == 0)
            return 0;

        if(bunnies % 2 == 1)
            return 2 + bunnyEars2(bunnies-1);

        return 3 + bunnyEars2(bunnies-1);
    }

    @Override
    public int triangle(int rows) {

        if(rows == 0)
            return 0;

        return rows + triangle(rows-1);
    }

    @Override
    public int sumDigits(int n) {
        return String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }

    @Override
    public int count7(int n) {
        if(n == 0)
            return 0;

        if(n % 10 == 7)
            return 1 + count7(n / 10);

        return count7(n / 10);
    }

    @Override
    public int count8(int n) {
        if(n == 0)
            return 0;

        if(n % 10 == 8) {
            if((n / 10) % 10 == 8)
                return 2 + count8(n/10);

            return 1 + count8(n/10);
        }

        return count8(n/10);
    }

    @Override
    public int powerN(int base, int n) {
        return (int) Math.pow(base, n);
    }

    @Override
    public int countX(String str) {
        return str.length() - str.replace("x", "").length();
    }

    @Override
    public int countHi(String str) {
        return str.split("hi", -1).length - 1;
    }

    @Override
    public String changeXY(String str) {
        return str.replace("x", "y");
    }

    @Override
    public String changePi(String str) {
        return str.replace("pi", "3.14");
    }

    @Override
    public String noX(String str) {
        return str.replace("x", "");
    }

    @Override
    public boolean array6(int[] nums, int index) {
        if(index >= nums.length)
            return false;

        return nums[index] == 6 || array6(nums, index + 1);
    }

    @Override
    public int array11(int[] nums, int index) {
        if(index >= nums.length)
            return 0;

        if(nums[index] == 11)
            return 1 + array11(nums, index + 1);

        return array11(nums, index + 1);
    }

    @Override
    public boolean array220(int[] nums, int index) {
        if(index >= nums.length - 1)
            return false;

        return nums[index+1] == 10 * nums[index] || array220(nums, index + 1);
    }

    @Override
    public String allStar(String str) {
        if(str.length() <= 1)
            return str;

        return str.charAt(0) + "*" + allStar(str.substring(1));
    }
}
