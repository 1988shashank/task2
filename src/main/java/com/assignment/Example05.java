package com.assignment;

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a;

        System.out.println("Please enter the first value");
        a = sc.next().charAt(0);
        int ascii = a;

        if((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)){

            System.out.println("Entered Value is ALPHABET");
        }
        else if(ascii >=48 && ascii<=57) {
            System.out.println("Entered Value is Number");
        }
        else{
            System.out.println("Entered Value is  SYMBOL");
        }
    }

}
