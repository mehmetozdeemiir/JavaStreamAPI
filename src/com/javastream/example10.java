package com.javastream;

import java.util.Arrays;
import java.util.List;

public class example10 {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //bad
        for(int i = 0; i < numbers.size(); i++) {
            int result = numbers.get(i) * 2;
            System.out.println(result);
        }

        //good
        numbers.stream()
                .map(number -> number * 2)
                .forEach(x -> System.out.println(x));

    }

}
