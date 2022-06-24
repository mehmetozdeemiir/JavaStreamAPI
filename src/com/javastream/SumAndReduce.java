package com.javastream;

import java.util.List;

public class SumAndReduce {

    public static void main(String[] args) {
    }

    //Before
    public static int calculate(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    //Stream API
    public static int calculate1(List<Integer> numbers) {
        return numbers.stream().reduce(Integer::sum).orElse(0);
        //return numbers.stream().reduce((i,sum)-> i+sum).orElse(0);
    }
}
