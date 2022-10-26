package com.assignment;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
      int count=0;
        for(int n=10; n<=99; n++){
           count = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                  count++;
                }


            }
            if(count <= 1 ){

                    System.out.println(n + " is a Prime number");
            }

        }
    }

}
