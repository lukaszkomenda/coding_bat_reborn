package org.example.Max1020;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Max1020 {
    public int max1020 (int a, int b){
        if (a < 10 || a > 20){
            a = 0;
        }

        if (b < 10 || b > 20){
            b = 0;
        }

        if (a == 0 && b == 0){
            return 0;
        }

        List<Integer> listOfValues = Arrays.asList(a,b);

        return listOfValues
                .stream()
                .mapToInt(value -> value)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }
}
