package com.BridgeLabz.Day5;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int N = sc.nextInt();

        if(N >= 0 && N <= 31){
            for(int i = 1; i <= N; i++){
                System.out.println("2 ^ "+ i + " = " + Math.pow(2, i));
            }
        }else {
            System.out.println("Enter Number between 0 to 31.");
        }
    }
}
