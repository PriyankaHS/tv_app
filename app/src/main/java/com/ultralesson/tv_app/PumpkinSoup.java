package com.ultralesson.tv_app;

//Recipe :
//        Heat oil in a large saucepan over low heat
//        Add onion and leek and cook for 2-3 minutes, until softened but not colored.
//        Add garlic and spices and cook, stirring, for 30 seconds
//        Add pumpkin, potato, and stock, and bring to the boil
//        Turn heat to low, cover, and simmer for 30 minutes
//        Allow to cool slightly, then blend in batches.
//        Return soup to the pan, stir through cream and reheat gently.
//        Season and Serve
public class PumpkinSoup
{
    public PumpkinSoup()
    {
        System.out.println("Preparing Pumpkin soup!!!");
    }

    public PumpkinSoup heatPan()
    {
        System.out.println("First heat the oil in a large saucepan over low heat!");
        return this;
    }

    public PumpkinSoup prepareSoup(int time)
    {
        System.out.printf("Add onion and leek and cook for %s minutes!", time);
        System.out.println();
        return this;
    }

    public PumpkinSoup addItems(int time)
    {
        System.out.printf("Adding garlic and spices and cook, stirring for %s seconds", time);
        return this;
    }

    public PumpkinSoup addVeggies()
    {
        System.out.println("\nAdd pumpkin, potato, stock, and bring to the boil!");
        return this;
    }

    public PumpkinSoup cookSoup(int time)
    {
        System.out.printf("Turn heat to low, cover, and simmer for %s minutes", time);
        System.out.println();
        return this;
    }

    public PumpkinSoup coolDown()
    {
        System.out.println("Allow to cool slightly, then blend in batches!");
        return this;
    }

    public PumpkinSoup serveSoup()
    {
        System.out.println("Return soup to the pan, stir through cream and reheat gently.");
        System.out.println("Season and Serve! Soup is ready now!!!");
        return this;
    }

    public static void main(String[] args)
    {
        PumpkinSoup ps = new PumpkinSoup();
        ps.heatPan();
        ps.prepareSoup(3);
        ps.addItems(30);
        ps.addVeggies();
        ps.cookSoup(30);
        ps.coolDown();
        ps.serveSoup();
    }

}
