package com.bridgelabz;

public class PowerofTwo {
    public static void main(String[] args)
    {
        int base=2;
        int n;     //Power Value
        for (n=1; n<31; n++)
        {
            System.out.println("Power of 2^" +n+" is: " + Math.pow(base, n));
        }
    }

}
