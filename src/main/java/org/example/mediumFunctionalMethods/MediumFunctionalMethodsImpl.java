package org.example.mediumFunctionalMethods;

import java.util.List;
import java.util.stream.Collectors;

public class MediumFunctionalMethodsImpl implements MediumFunctionalMethods {
    @Override
    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }

    @Override
    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n % 10 != 9)
                .collect(Collectors.toList());
    }

    @Override
    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n -> n >= 13 & n <= 19);
        return nums;
    }

    @Override
    public List<String> noZ(List<String> strings) {
        strings.removeIf(s -> s.contains("z"));
        return strings;
    }

    @Override
    public List<String> noLong(List<String> strings) {
        strings.removeIf(s-> s.length() >= 4);
        return strings;
    }

    @Override
    public List<String> no34(List<String> strings) {
        strings.removeIf(s-> s.length() == 3 || s.length() == 4);
        return strings;
    }

    @Override
    public List<String> noYY(List<String> strings) {
        strings.replaceAll(s -> s + "y");
        strings.removeIf(s -> s.contains("yy"));
        return strings;
    }

    @Override
    public List<Integer> two2(List<Integer> nums) {
        nums.replaceAll(n-> n * 2);
        nums.removeIf(n-> n % 10 == 2);
        return nums;
    }

    @Override
    public List<Integer> square56(List<Integer> nums) {
        nums.replaceAll(n-> n * n + 10);
        nums.removeIf(n-> n % 10 == 5 || n % 10 == 6);
        return nums;
    }
}

