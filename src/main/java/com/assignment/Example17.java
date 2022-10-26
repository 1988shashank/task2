package com.assignment;

import java.util.Scanner;

public class Example17 {
    public static void main(String[] args) {
        int r = 0,sum=0,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to reverse");
        int n=sc.nextInt();//It is the number variable to be checked for palindrome

        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        System.out.println("Reversed : "+sum);
    }
}
