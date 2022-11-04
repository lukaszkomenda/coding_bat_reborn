package org.example.IntMax;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class IntMax {
    public int intMax(int a, int b, int c){
        List<Integer> listOfValues = Arrays.asList(a,b,c);

        return listOfValues
                .stream()
                .mapToInt(value -> value)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }
}
