package com.ultralesson.tv_app.capstoneOOAD;

import java.util.ArrayList;
import java.util.TreeMap;

public class FruitBowl {
    Fruit[] bowl;
    TreeMap<String, ArrayList<Fruit>> list;
    TreeMap<String, ArrayList<Fruit>> list2;

    FruitBowl(Fruit[] bowl) {
        this.bowl = bowl;
        list = new TreeMap<>();
        for (Fruit fruit : bowl) {
            list.computeIfAbsent(fruit.getColor(), k -> new ArrayList<>());
        }
    }

    public Fruit[] getBowl() {
        return bowl;
    }

    private void setFilterColor() {
        list2 = new TreeMap<>();
        for (Fruit fruit : bowl) {
            String fruitColor = fruit.getColor();
            list2.computeIfAbsent(fruitColor, k -> new ArrayList<>());
            list2.get(fruitColor).add(fruit);
        }
    }

    public TreeMap<String, ArrayList<Fruit>> getFilterColor() {
        setFilterColor();
        return list2;
    }

    private void setFilterType() {
        list2 = new TreeMap<>();
        for (Fruit fruit : bowl) {
            String fruitType = fruit.getType();
            list2.computeIfAbsent(fruitType, k -> new ArrayList<>());
            list2.get(fruitType).add(fruit);
        }
    }

    public TreeMap<String, ArrayList<Fruit>> getFilterType() {
        setFilterType();
        return list2;
    }

    private void setFilterSize() {
        int pos;
        Fruit temp;
        for (int i = 0; i < bowl.length; i++) {
            pos = i;
            for (int j = i + 1; j < bowl.length; j++) {
                if (bowl[j].getSize() < bowl[pos].getSize()) {
                    pos = j;
                }
            }

            temp = bowl[pos];
            bowl[pos] = bowl[i];
            bowl[i] = temp;
        }
    }

    public Fruit[] getSortArray() {
        setFilterSize();
        return bowl;
    }
}
//    public Object getFilter(String filter) {
//        if (filter.equalsIgnoreCase("color")) {
//            return getFilterColor();
//        } else if (filter.equalsIgnoreCase("type")) {
//            return getFilterType();
//        } else if (filter.equalsIgnoreCase("size")) {
//            return getSortArray();
//        }
//        return null;
//    }

