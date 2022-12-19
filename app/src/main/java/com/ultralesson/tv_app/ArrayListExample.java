package com.ultralesson.tv_app;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class ArrayListExample {
    @Test
    public void addItemToList() {
        ArrayList<String> alphabets = new ArrayList();
        alphabets.add("R");
        alphabets.add("A");
        alphabets.add("M");
    }

    public void getItemFromList() {
        ArrayList<String> firstList = new ArrayList<>(5);
        firstList.add("R");
        firstList.add("A");
        firstList.add("M");

        Assert.assertEquals(firstList.get(0), "R");
        Assert.assertEquals(firstList.get(1), "A");
        Assert.assertEquals(firstList.get(2), "M");
    }

    @Test
    public void addItemToListAtSpecifiedIndex() {
        ArrayList<String> firstList = new ArrayList(7);
        firstList.add(0, "R");
        firstList.add(1, "A");
        firstList.add(2, "M");
        firstList.add(3,"P");
        firstList.add(4, "R");
        firstList.add(5, "I");

        firstList.remove(3);
    }

    @Test
    public void containsElement()
    {
        ArrayList<String> firstList = new ArrayList<>(5);
        firstList.add("G");
        firstList.add("E");
        firstList.add("E");
        firstList.add("T");

//        boolean isElementPresent = firstList.contains("E");
//        Assert.assertTrue(isElementPresent);

//        int indexOfT = firstList.indexOf("T");
//        Assert.assertEquals(1, indexOfT);
    }
}

//
//        ArrayList<String> secondList = new ArrayList(5);
//        secondList.add("A");
//        secondList.add("B");
//        secondList.add("C");
//        secondList.addAll(firstList);
//    }




