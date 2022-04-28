package com.bridgelabz;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int Number = sc.nextInt();

        if (Number % 2 == 0)
            System.out.println(Number + " is an even number");
        else
            System.out.println(Number + " is an odd number");
    }
}
