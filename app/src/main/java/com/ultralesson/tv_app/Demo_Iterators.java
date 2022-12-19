package com.ultralesson.tv_app;

import org.checkerframework.checker.units.qual.A;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo_Iterators
{
    public static void main(String[] args)
    {
        ArrayList<String> alpha = new ArrayList<>(10);
        alpha.add("R");
        alpha.add("A");
        alpha.add("M");
        alpha.add("P");
        alpha.add("R");
        alpha.add("I");
        alpha.add("Y");
        alpha.add("A");

        // Traditional For loop - Method 1
//        for (int i = 0; i<alpha.size(); i++)
//        {
//            System.out.println(alpha.get(i));
//        }
//        System.out.println();
//        System.out.println("*****");
//
//        // Enhanced For loop (for-each loop) - Method 2
//        for(String alphabet : alpha)
//        {
//            System.out.println(alphabet);
//        }

        Iterator<String> itr = alpha.iterator();

//        while(itr.hasNext())
//        {
//            System.out.println(itr.next());
//        }
//        System.out.println();
//        System.out.println("*****");
//        Iterator<String> newItr = alpha.iterator();
//        newItr.forEachRemaining(alphabet -> System.out.print(alphabet));

//        while(itr.hasNext())
//        {
//            String next = itr.next();
//
//            if(next.equals("R"))
//            {
//                itr.remove();
//            }
//        }
//        System.out.println(alpha);

        ListIterator<String> listIterator = alpha.listIterator();

        System.out.println("Forward Iteration:");
        System.out.println("----------------------");

        while (listIterator.hasNext())
        {
            System.out.println("Current element is " + listIterator.next());

        }

        System.out.println();
        System.out.println("Backward Iteration:");
        System.out.println("----------------------");

        while (listIterator.hasPrevious())
        {
            System.out.println("Current element is " + listIterator.previous());
        }
    }
    }
