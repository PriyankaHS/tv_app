package com.ultralesson.tv_app;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_Demo
{
    public static void main(String[] args)
    {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(17);
        set.add(27);
        set.add(154);
        set.add(987);
        set.add(300);
        System.out.println("Numbers in ascending order " + set);

        // Constructor with comparator
        TreeSet<Integer> reverseSet = new TreeSet<>(Comparator.reverseOrder());
        reverseSet.add(300);
        reverseSet.add(987);
        reverseSet.add(154);
        reverseSet.add(27);
        reverseSet.add(17);
        System.out.println("Numbers in descending order " + reverseSet);


        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(9);
        numbers.add(21);
        numbers.add(99);
        numbers.add(73);
        numbers.add(45);

        System.out.println(numbers);
        System.out.println(numbers.first());
        System.out.println(numbers.last());
        System.out.println(numbers.headSet(17));
        System.out.println(numbers.tailSet(21));
        System.out.println(numbers.remove(9));
    }
}
