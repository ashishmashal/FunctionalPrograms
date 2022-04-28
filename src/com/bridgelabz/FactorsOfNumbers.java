package com.bridgelabz;

import java.util.Scanner;

public class FactorsOfNumbers {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a Number: ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        //because 2 is only the even prime factor
        while (num%2==0)
        {
            System.out.println(2+" ");
            num/=2;
        }
        //n must be odd at this point. So we can skip one element (Note i = i+ 2)
        for (int i=3; i <= Math.sqrt(num); i+=2)
        {
            //While i divides num, print i and divide num
            while (num % i == 0)
            {
                System.out.println(i + " ");
                num /= i;
            }
        }
        if (num>2)
            System.out.println(num);
    }
}
