package com.BridgeLabz.Day5;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int year = sc.nextInt();

        if(year < 9999 && year > 999){
            if(year % 4 == 0){
                System.out.println(year + " Is a Leap Year.");
            }else {
                System.out.println(year + " Is not a Leap Year.");
            }
        }else {
            System.out.println("Please Enter a Valid Year.");
        }
    }
}
