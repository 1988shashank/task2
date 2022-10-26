package com.assignment;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        String str;
        Scanner sc =  new Scanner(System.in);
        str =  sc.nextLine();
        if(str.isEmpty())
            System.out.println("No Values");
        else
            System.out.println(str);
    }
}

