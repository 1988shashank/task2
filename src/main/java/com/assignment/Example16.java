package com.assignment;

import java.util.Scanner;

public class Example16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();
        for(int i=0;i<=num;i++) {
            for(int j=1;j<=i;j++)
                System.out.print("*"+"\t");
            System.out.println();
        }

    }
}
