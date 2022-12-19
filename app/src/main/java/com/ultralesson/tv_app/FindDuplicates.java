package com.ultralesson.tv_app;

import java.util.TreeSet;

public class FindDuplicates
{
    public static void main(String[] args)
    {
        int[] numbers = { 1, 55, 666, 43434, 11212, 11323, 55, 22, 33, 546, 64342,
                232, 5432, 2444, 113, 333, 666, 4533, 232 };

        // Treeset does not allow duplicate elements. Add function returns false if element is duplicate
//        ! - not equal to
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int num : numbers)
        {
            if(treeSet.add(num)==false)
            {
                System.out.println("Duplicate Element :" + num);
            }
        }
    }
}
