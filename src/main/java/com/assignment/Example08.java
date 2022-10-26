package com.assignment;

import java.util.Scanner;

public class Example08 {
    public static void main(String[] args) {
        System.out.println("Please enter a color code");
        Scanner sc = new Scanner(System.in);
        char color = sc.next().charAt(0);
        switch(color) {
            case 'R':
                System.out.println("Red");
                break;
            case 'B':
                System.out.println("Blue");
                break;

            case 'G':
                System.out.println("Green");
                break;

            case 'O':
                System.out.println("Orange");
                break;

            case 'Y':
                System.out.println("Yellow");
                break;
            case 'W':
                System.out.println("White");
                break;

            default:
                System.out.println("Invalid Code");
        }

    }
}
