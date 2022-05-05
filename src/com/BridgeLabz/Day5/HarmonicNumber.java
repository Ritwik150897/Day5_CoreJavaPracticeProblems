package com.BridgeLabz.Day5;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int N = sc.nextInt();

        if(N != 0){
            for (float i = 1; i <= N; i++){
                float ans = 1 / i;
                System.out.println("1 / " + i + " = " + ans );
            }
        }else {
            System.out.println("Enter number greater than 0.");
        }
    }
}
