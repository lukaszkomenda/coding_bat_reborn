package org.example.mediumFunctionalMethods;

import java.util.List;
import java.util.stream.Collectors;

public class MediumFunctionalMethodsImpl implements MediumFunctionalMethods{
    @Override
    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n-> n >= 0)
                .collect(Collectors.toList());
    }
}
