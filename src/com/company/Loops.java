package com.company;

public class Loops {

    public static void year1(int daysInAYear){
        int hours = 0, minutes = 0;
        for (int i = 0; i<daysInAYear; i++){
            hours=hours+24;
            minutes=minutes+1440;
        }
        System.out.println("There are "+ hours +" hours or "+ minutes +" minutes in one year.");
    }

    public static void year2(int daysInAYear){
        int hours = 0, minutes = 0;
        while (daysInAYear > 0){
            hours=hours+24;
            minutes=minutes+1440;
            daysInAYear--;
        }
        System.out.println("There are "+ hours +" hours or "+ minutes +" minutes in one year.");
    }

    public static void factorial(int num){
        int factorial = 1;
        for (int i=0; i<num; i++){
            factorial = factorial * (num-i);
        }
        System.out.println("Factorial of number "+num+" is "+factorial+".");
    }
}
