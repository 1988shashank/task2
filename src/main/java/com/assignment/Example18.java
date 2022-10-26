package com.assignment;

import java.util.Scanner;

public class Example18 {
    public static void main(String[] args) {
        int r = 0,rev=0,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to reverse");
        int n=sc.nextInt();//It is the number variable to be checked for palindrome

        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            rev=(rev*10)+r;
            n=n/10;
        }
        if(rev == temp){
            System.out.println(temp+" is palindrome");
        }
        else{
            System.out.println(temp+" is NOT palindrome");
        }

    }
}
