package com.assignment;

public class Example14 {
    public static void main(String[] args) {
        int n, count = 0;

        if (args.length == 0) {
            System.out.println("Please enter a valid number");
        } else {
            n = Integer.parseInt(args[0]);

            if (n <= 1) {
                System.out.println("The number is not prime");
                return;
            }


            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println("The number is not prime");
            } else {
                System.out.println("The number is prime");
            }

        }
    }
}
