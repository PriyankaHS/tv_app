package com.ultralesson.tv_app;
import java.util.*;
public class LinkedListDemo
{
    public static void main(String[] args)
    {
//        LinkedList<String> alpha = new LinkedList<>();
//        alpha.add("R");
//        alpha.add("I");
//        alpha.add("Y");
//        alpha.add("A");
//        alpha.add("R");
//        alpha.add("A");
////        alpha.addFirst("P");
//        alpha.add(0,"P");
//        alpha.addLast("M");
//
//        System.out.println(alpha);

        LinkedList<String> alphaSetA = new LinkedList<>();
        alphaSetA.add("R");
        alphaSetA.add("A");
        alphaSetA.add("M");

        LinkedList<String> alphaSetB = new LinkedList<>();
        alphaSetB.addAll(alphaSetA);
        alphaSetB.add("P");
        alphaSetB.add("R");
        alphaSetB.add("I");
        alphaSetB.add("Y");
        alphaSetB.add("A");
        alphaSetB.addAll(0,alphaSetA);

        String alphabb = alphaSetB.get(2);
        System.out.println(alphabb);
        System.out.println(alphaSetB);
    }
}
