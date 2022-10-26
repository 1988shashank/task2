package com.test;

import java.util.Scanner;

public class fibanocci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans =0;
        int x = 0;
        int y = 1;
        int number = in.nextInt();
        System.out.println(x);
        System.out.println(y);

        for(int i =0;i<=number; i++)
        {
            ans =  x+ y;
            x=y;
            y=ans;
            System.out.println(ans);
        }

    }

}
