package com.assignment;


import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int res = number%2;
        if(res == 1){
            System.out.println("You have given ODD number");
        }
        else{
            System.out.println("You have given Even number");
        }

    }
}
