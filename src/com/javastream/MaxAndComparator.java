package com.javastream;

import java.util.*;

public class MaxAndComparator {

    public static void main(String[] args) {
    }

    //Before
    public static Person getOldestPerson (List <Person> people) {
        Person oldestPerson = new Person("", 0);
        for (Person person : people) {
            if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }

    //Stream API
    public static Person getOldestPerson1(List<Person> people) {
         return people.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .orElse(null); //max optional olduğu için
    }
}

