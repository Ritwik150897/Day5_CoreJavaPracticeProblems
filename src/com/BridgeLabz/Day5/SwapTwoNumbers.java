package com.BridgeLabz.Day5;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number A: ");
        int a = sc.nextInt();
        System.out.println("Enter Number B: ");
        int b = sc.nextInt();

        System.out.println("Number A: " + a);
        System.out.println("Number B: " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping: ");
        System.out.println("Number A: " + a);
        System.out.println("Number B: " + b);
    }
}
