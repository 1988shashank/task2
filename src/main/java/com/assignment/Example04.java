package com.assignment;

import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a, b;
        System.out.println("Please enter the first value");
        a = sc.next().charAt(0);
        System.out.println("Please enter the first value");
        b = sc.next().charAt(0);

        int asca = a;
        int ascb = b;
        if(asca>ascb) {

            System.out.println(b);
            System.out.println(a);

        }
        else{
            System.out.println(a);
            System.out.println(b);

        }

    }
}
