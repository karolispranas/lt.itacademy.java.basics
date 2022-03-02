package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        * Pašalinkit komentaro simbolį nuo vienos užduoties ir paleiskite programą
        * */

        //uzd1();
        //uzd2();
        //bonus();
        //uzd3();
        //uzd4();
        //uzd5();
        //uzd6();
        //uzd7();
        //uzd8();
        //uzd9();
        //uzd10();
    }

    public static void uzd1(){
         Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        String age = scanner.nextLine();
        System.out.println("Hello I am " + name +" "+ surname +  " age " + age + ". I am attending IT Academy 2020!");
    }

    public static void uzd2(){
        boolean bool = true;
        byte bit = 0;
        char ch1 = 'H', ch2 = 'w', ch3 = 'r', ch4 = 'd';
        float floot = 2;
        int num = 3110;
        short sh = 1;
        String string ;
        string = String.valueOf(ch1) + String.valueOf(num) + " " + String.valueOf(ch2) + String.valueOf(bit) + String.valueOf(ch3) + String.valueOf(sh) + String.valueOf(ch4) + " " + String.valueOf(floot) + " " + String.valueOf(bool) ;
        System.out.println(string);
    }

    public static void bonus(){
        Art.art(5);
    }

    public static void uzd3(){
        Arithmetics.arithmetics(5);
    }

    public static void uzd4(){
        Arithmetics.convert(2.4, 4);
    }

    public static void uzd5(){
        Operators.triangle(1,3,5);
    }

    public static void uzd6(){
        Operators.cars(100, 6, 7, 1.25 );
    }

    public static void uzd7(){
        Loops.year1(365);
    }

    public static void uzd8(){
        Loops.year2(365);
    }

    public static void uzd9(){
        Loops.factorial(5);
    }

    public static void uzd10(){
        Calculator.calculaotr();
        System.out.println("would you like to go again? Yes/No");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals("Yes")){
            uzd10();
        }
    }
}
