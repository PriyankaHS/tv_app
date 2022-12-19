package com.ultralesson.tv_app;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AL_Sorting
{
    public static void main(String[] args)
    {
        ArrayList<String> alpha = new ArrayList<>(5);
        alpha.add("R");
        alpha.add("A");
        alpha.add("M");
        alpha.add("P");
        alpha.add("K");

        System.out.println("Before Sorting : " + alpha);
//        Collections.sort(alpha);
//        System.out.println("After Sorting : " + alpha);

//        List<String> sortedAlpha = alpha.stream().sorted().collect(Collectors.toList());
//        System.out.println("After Sorting : " + sortedAlpha);

        Collections.sort(alpha, Collections.reverseOrder());
        System.out.println("After Sorting : " + alpha);



    }
}
