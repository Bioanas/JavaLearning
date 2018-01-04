package com.ia;

public class Printf_vs_println {


    public static void main (String[] args) {
        int x = 5;
        int y = 6;
        int sum = x + y;
        System.out.println (sum);
        System.out.println (x);
        System.out.println (y);
        System.out.printf ("The value of variable y is %d", y);
        System.out.println ();
        System.out.printf ("The value of variable x is %d", x);
    }

}
