package com.assignment;

public class Example19 {
    public static void main(String[] args) {
        int N =100;
        for (int num = 0; num < N; num++)
        {
            if (num % 3 == 0 && num % 5 == 0 && num % 2 == 0)
                System.out.print(num + " ");
        }
    }
}
