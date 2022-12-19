package com.ultralesson.tv_app;

import java.util.Scanner;

public class prod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose a Product - 1.Lipstick, 2.Eyeliner, 3.Blush, 4.Moisturizer, 5.Compact");
        int product = sc.nextInt();

        switch(product)
        {
            case 1:
                System.out.println("Maybeline");
                break;

            case 2:
                System.out.println("Lakme");
                break;

            case 3:
                System.out.println("Revlon");
                break;

            case 4:
                System.out.println("Ponds");
                break;

            case 5:
                System.out.println("Mac");
                break;

            default:
                System.out.println("No such products are available!");
                break;

        }
    }
}
