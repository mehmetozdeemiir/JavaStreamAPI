package com.javastream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class UpperCase {

    //Arrays.asList()= aldığı array i listeye çeviriyor.
    //stream()= stream adında bir collention a ceviriyor. stream yapmadan diğer metodlara ulaşılamıyor. stream bir collection değildir.

    public static void main(String[] args) {
        System.out.println(mapToUpperCase2("a","b","b","d"));
    }

    //Before
    public static Collection<String> mapToUppercase(String... names) {
        Collection<String> uppercaseNames = new ArrayList<>();
        for(String name : names) {
            uppercaseNames.add(name.toUpperCase());
        }
        return uppercaseNames;
    }

    //Stream API
    public static Collection<String> mapToUpperCase2(String... names){
       return Arrays.stream(names).map(String::toUpperCase).toList();
    }



}
