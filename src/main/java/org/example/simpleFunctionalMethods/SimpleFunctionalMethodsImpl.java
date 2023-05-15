package org.example.simpleFunctionalMethods;

import java.util.List;
import java.util.stream.Collectors;

public class SimpleFunctionalMethodsImpl implements SimpleFunctionalMethods {
    @Override
    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }

    @Override
    public List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * n)
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> addStar(List<String> strings) {
        strings.replaceAll(n-> n + "*");
        return strings;
    }

    @Override
    public List<String> copies3(List<String> strings) {
        strings.replaceAll(n-> n + n + n);
        return strings;
    }

    @Override
    public List<String> moreY(List<String> strings) {
        strings.replaceAll(n-> "y" + n + "y");
        return strings;
    }

    @Override
    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n-> (n+1) * 10);
        return nums;
    }

    @Override
    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n-> n % 10);
        return nums;
    }

    @Override
    public List<String> lower(List<String> strings) {
        strings.replaceAll(String::toLowerCase);
        return strings;
    }

    @Override
    public List<String> noX(List<String> strings) {
        strings.replaceAll(n-> n.replaceAll("x", ""));
        return strings;
    }
}
