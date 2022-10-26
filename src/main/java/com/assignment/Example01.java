package com.assignment;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        if (number > 0) {
            System.out.println("\n You have entered POSITIVE number");
        }
        else if(number ==0){
            System.out.println("\n You have entered Zero");
        }
        else
            System.out.println("\n You have entered NEGATIVE number");

    }
}
