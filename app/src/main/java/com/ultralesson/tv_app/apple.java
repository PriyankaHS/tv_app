package com.ultralesson.tv_app;

import javax.swing.*;

public class apple {

    // Member variables
    private String type;
    private String color;
    private int weight;

    // Constructors
    public apple(String type, String color, int weight)
    {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    // Methods
    public boolean isFresh()
    {
    // Method implementation
        return true;
    }

    public String getColor()
    {
        return color;
    }

    public int getWeight()
    {
        return weight;
    }

    public static void main(String[] args)
    {
        apple a = new apple("Kashmir", "Red", 17);
        System.out.println("Kashmir Apple is " + a.getColor() + " in color");
    }

}
