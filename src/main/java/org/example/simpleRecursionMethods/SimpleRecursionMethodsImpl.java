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
}
