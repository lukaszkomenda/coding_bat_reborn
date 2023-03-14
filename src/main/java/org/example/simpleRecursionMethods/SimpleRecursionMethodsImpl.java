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
}
