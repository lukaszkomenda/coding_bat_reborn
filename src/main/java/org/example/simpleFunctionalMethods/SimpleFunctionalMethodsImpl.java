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
}
