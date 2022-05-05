package com.BridgeLabz.Day5;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Flips: ");
        int flips = sc.nextInt();
        float heads = 0;
        float tails = 0;

        if(flips > 0){
            for(int i = 1; i <= flips; i++){
                double f = Math.floor(Math.random() * 10) % 2;

                if(f == 1.0){
                    System.out.println("Heads");
                    heads++;
                }else{
                    System.out.println("Tails");
                    tails++;
                }
            }
        }else {
            System.out.println("Enter Positive Integer Only.");
        }

        System.out.println("Heads Percentage: " + ( heads / flips ) * 100 + " %");
        System.out.println("Tails Percentage: " + ( tails / flips ) * 100 + " %");
    }
}
