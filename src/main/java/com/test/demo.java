package com.test;


import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int ans = 1;
        System.out.println(" a = " +a);
        for(int i=1; i<=a; i++){
            ans = ans*i;
        }
        System.out.println(" Factorial = " +ans);
    }
}
