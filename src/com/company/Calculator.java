package com.company;

import java.util.Scanner;

public class Calculator {

    public static void calculaotr(){
        System.out.println("PLease input the shape you want (Triangle, Rectangle or a Square)");
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        int perimeter = 0;
        double area = 0;
        int x = 0, y = 0, z= 0;
            switch(shape) {
                case "Triangle":
                    System.out.println("Please input all 3 sides of a triangle");
                    String a = scanner.nextLine();
                    String b = scanner.nextLine();
                    String c = scanner.nextLine();
                    if (a.equals("0") || b.equals("0") || c.equals("0") ){
                        System.out.println("Triangle edge can’t be 0.");
                        calculaotr();
                    }
                    x = Integer.parseInt(a);
                    y = Integer.parseInt(b);
                    z =Integer.parseInt(c);
                    if (x + y < z || x + z < y || y + z < x){
                        System.out.println("Triangle is invalid");
                        calculaotr();
                    }
                    perimeter = x+y+z;
                    area = Math.sqrt(perimeter/2*(perimeter*2-x)*(perimeter/2-y)*(perimeter/2-z));
                    System.out.println("Perimeter: " + perimeter + " area "+ area );
                    break;
                case "Rectangle":
                    System.out.println("please input both sides of a rectangle");
                    String a1 = scanner.nextLine();
                    String b1 = scanner.nextLine();
                    if (a1.equals("0") || b1.equals("0") ){
                        System.out.println("Rectangle edge can’t be 0.");
                        calculaotr();
                    }
                    x = Integer.parseInt(a1);
                    y = Integer.parseInt(b1);
                    perimeter = x*2+y*2;
                    area = x*y;
                    System.out.println("Perimeter: " + perimeter + " area "+ area );
                    break;
                case "Square":
                    System.out.println("please input both sides of a square");
                    String a2 = scanner.nextLine();
                    if (a2.equals("0")){
                        System.out.println("Square edge can’t be 0.");
                        calculaotr();
                    }
                    x = Integer.parseInt(a2);
                    perimeter=x*4;
                    area=x*x;
                    System.out.println("Perimeter: " + perimeter + " area "+ area );
                    break;
                default:
                    System.out.println("Something went wrong try again");
                    calculaotr();
            }
        }

    }


