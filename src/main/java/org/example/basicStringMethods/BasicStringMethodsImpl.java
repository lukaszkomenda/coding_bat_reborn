package org.example.basicStringMethods;

public class BasicStringMethodsImpl implements BasicStringMethods{
    @Override
    public String helloName(String name) {
        return "Hello " + name;
    }

    @Override
    public String makeAbba(String a, String b) {
        return a+b+b+a;
    }
}
