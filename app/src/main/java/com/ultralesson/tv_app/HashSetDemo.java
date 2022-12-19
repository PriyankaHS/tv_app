package com.ultralesson.tv_app;
import java.util.*;

public class HashSetDemo
{
    public static void main(String args[])
    {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers.isEmpty()); // false

        numbers.clear();

        System.out.println(numbers.isEmpty()); //true

        for(int number : numbers)
        {
            System.out.println(number);
        }

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("Using Streams..");
        numbers.stream().iterator().forEachRemaining(System.out::println); // Streams

        numbers.forEach(System.out::println);

        // Sorting a HashSet
        ArrayList<Integer> numbersList = new ArrayList<>(numbers);
        Collections.sort(numbersList);
        System.out.println(numbersList);

    }
}