package com.BridgeLabz.Day5;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Dividend: ");
        int dividend = sc.nextInt();
        System.out.println("Enter a Divisor: ");
        int divisor = sc.nextInt();

        System.out.println("Quotient: " + dividend / divisor);
        System.out.println("Remainder: " + dividend % divisor);
    }
}
