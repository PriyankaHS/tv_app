package com.ultralesson.tv_app;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Student_Marks
{
    public static void main(String[] args)
    {
        //Custom comparator to verify student marks
        Comparator<Student_Details> studentComparator = new Comparator<Student_Details>()
        {
            @Override
            public int compare(Student_Details s1, Student_Details s2)
            {
                return s1.getMarks().compareTo(s2.getMarks());
            }
        };

        TreeSet<Student_Details> studentsMarks = new TreeSet<>(studentComparator);
        studentsMarks.add(new Student_Details("RamPriya", 93));
        studentsMarks.add(new Student_Details("Pavithra", 37));
        studentsMarks.add(new Student_Details("Krishna", 68));
        studentsMarks.add(new Student_Details("Nibhun", 80));
        studentsMarks.add(new Student_Details("Aishu", 25));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks to obtain the list of Students.");
        int marks = scanner.nextInt();
        SortedSet<Student_Details> name = studentsMarks.tailSet(new Student_Details(marks));
        System.out.println("Students who have obtained marks above: "+marks);
        name.forEach(System.out::println);

    }
}
