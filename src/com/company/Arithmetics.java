package com.company;


public class Arithmetics {
    public static void arithmetics(int input){
        double volume = Math.pow(input,3);
        int perimeter = input*12;
        System.out.println("volume: " + volume + "cm^3." + " " + "Perimeter: " + perimeter + "cm.");
    }

    public static void convert(double feet,double inches){
        double feetToInch = feet*12;
        double sumInches =feetToInch + inches;
        double inchesToCentimeters = sumInches*2.54;
        System.out.println(feet + " feet and " + inches + " = " + inchesToCentimeters + " cm");
    }
}
