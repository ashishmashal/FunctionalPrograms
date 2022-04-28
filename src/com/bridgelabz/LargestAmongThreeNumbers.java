package com.bridgelabz;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num1 as 'a':");
        int a=sc.nextInt();
        System.out.println("Enter Num2 as 'b':");
        int b=sc.nextInt();
        System.out.println("Enter Num3 as 'c':");
        int c=sc.nextInt();

        if (a>b && a>c)
            System.out.println(a+" is largest among three numbers");
        else if (b>c && b>a)
            System.out.println(b+" is largest among three numbers");
        else
            System.out.println(c+" is largest among three numbers");
    }
}
