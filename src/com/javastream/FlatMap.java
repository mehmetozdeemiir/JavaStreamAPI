package com.javastream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FlatMap {

    //nested list
    /*
    {
        {A, B, C}
        {D, E, F}
    }

    {A, B, C, D, E, F}
    */
    public static void main(String[] args) {
    }

    //Before
    public static List<String> transform(List<List<String>> collection) {
        List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection) {
            for (String value : subCollection) {
                newCollection.add(value);
            }
        }
        return newCollection;
    }
    //Stream API
    public static List<String> transform1(List<List<String>> collection) {
        return collection.stream()
                .flatMap(Collection::stream) //Stream<Stream<String>> -> Stream<String>
                .toList(); //Stream<String> -> List<String>
    }
}
