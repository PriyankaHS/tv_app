package com.ultralesson.tv_app.capstoneOOAD;

import java.util.ArrayList;
import java.util.TreeMap;

class Main
{
    public static void main(String[] args)
    {
        Fruit fruit1 = new Fruit("red", 25, "c");
        Fruit fruit2 = new Fruit("blue", 25, "c");
        Fruit fruit3 = new Fruit("red", 25, "c");
        Fruit fruit4 = new Fruit("green", 25, "c");
        Fruit fruit5 = new Fruit("red", 25, "c");
        Fruit fruit6 = new Fruit("green", 25, "c");

        Fruit[] bowl = {fruit1, fruit2, fruit3, fruit4, fruit5, fruit6};
        FruitBowl obj = new FruitBowl(bowl);
        TreeMap<String, ArrayList<Fruit>> abc = obj.getFilterColor();

        for (String s: abc.keySet())
        {
            for (Fruit fruit : abc.get(s))
            {
                System.out.println(fruit.getColor());
            }
        }
    }
}
