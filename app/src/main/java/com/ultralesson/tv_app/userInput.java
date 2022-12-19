package com.ultralesson.tv_app;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = sc.nextInt();
        System.out.println("Your age is : " + age);

    }
}
