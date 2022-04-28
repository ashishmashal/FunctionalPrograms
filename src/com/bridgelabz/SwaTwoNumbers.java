package com.bridgelabz;

public class SwaTwoNumbers {
    public static void main(String[] args) {
        int num1=25;
        int num2=10;
        System.out.println("--Before Swap--");
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);

        // Value of first number is assigned to Blank
        int Blank = num1;
        // Value of second number is assigned to first number
        num1 = num2;
        // Value of Blank(which contains initial value of first number) is assigned to second number
        num2 = Blank;

        System.out.println("--After Swap--");
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
    }
}
