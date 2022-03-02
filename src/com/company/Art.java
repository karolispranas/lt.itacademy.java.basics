package com.company;

public class Art {

    public static void art(int rows){
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
            if (i==rows){
                System.out.println("\s".repeat(rows)+"#");
            }
        }
    }

}
