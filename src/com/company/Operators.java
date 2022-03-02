package com.company;

public class Operators {

    public static void triangle(int a, int b, int c){
        if (a + b < c || a + c < b || b + c < a){
            System.out.println("triangle is invalid");
        }
        else {
            System.out.println("Triangle is " + Type(a,b,c));
        }
    }

     static String Type(int a, int b, int c){
        if(a==b && a==c && b==c){
            return "Equilateral";
        }else if(a==b || a==c || b==c){
            return "Isosceles";
        }else
            return "Scalene";
    }

    public static void cars(double distance, double fuelLevel, double fuelUsage, double fuelPrice){
        double kilometerPerLiter = 100/fuelUsage;
        double reachableDistance = kilometerPerLiter * fuelLevel;
        if(reachableDistance > distance){
            double kilometersAvailable = reachableDistance - distance;
            double fuelLeft = kilometersAvailable/kilometerPerLiter;
            System.out.println("Destination is in " + distance + "km. Car is able to reach the destination. It will have " + fuelLeft +" liters of fuel left.");
        }else {
            double kilometersLeft = distance - reachableDistance;
            double fuelNeeded = kilometersLeft/kilometerPerLiter;
            double price = fuelNeeded*fuelPrice;
            System.out.println("Destination is in " + distance + "km. Car is not able to reach the destination. It needs " + fuelNeeded + " liter of fuel more. It will cost " + price + " .");
        }
    }


}


