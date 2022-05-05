package com.BridgeLabz.Day5;

import java.util.Scanner;

public class LargestAmongstThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number A: ");
        int a = sc.nextInt();
        System.out.println("Enter Number B: ");
        int b = sc.nextInt();
        System.out.println("Enter Number C: ");
        int c = sc.nextInt();

        if(a>=b && a>=c) {
            System.out.println(a + " is the largest Number");
        } else if (b>=a && b>=c) {
            System.out.println(b + " is the largest Number");
        } else{
            System.out.println(c+" is the largest number");
        }
}
}
