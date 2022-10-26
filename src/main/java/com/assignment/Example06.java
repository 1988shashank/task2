package com.assignment;

import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age;
        char gender;
        System.out.println("Pleas enter Age");
        age= sc.nextInt();
        if(age<0 || age>=120){
            System.out.println("Please Enter Valid Age");
            age= sc.nextInt();
        }

        System.out.println("Please enter your gender(M/F)");
        gender = sc.next().charAt(0);
        if((age<=58 && (gender == 'f' || gender =='F' ))){
            System.out.println("Interest is 8.2");
        }
        if((age>=59 && age<=120) && (gender == 'f' || gender =='F' )){
            System.out.println("Interest is 7.6");
        }
        if((age>=1 && age<=60) && (gender == 'm' || gender =='M' )){
            System.out.println("Interest is 9.2");
        }
        if((age>=61 && age<=120) && (gender == 'm' || gender =='M' )){
            System.out.println("Interest is 8.3");
        }


    }
}
