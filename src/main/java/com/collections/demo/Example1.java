package com.collections.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        List search = new ArrayList();

          //System.out.println(saveEvenNumbers(number).toString());
       search =  printEvenNumbers((ArrayList<Integer>) saveEvenNumbers(number));
     //  searchlist(5);

    }
//    public static void searchlist(int s){
//        if (list.contains(5))
//            System.out.println("5 exists in the ArrayList");
//
//        else
//            System.out.println("5 does not exist in the ArrayList");
//
//
//    }
    public static List<Integer> printEvenNumbers(ArrayList<Integer> list){
      //  ArrayList arr = new ArrayList()
       // System.out.println(list);
        List<Integer> doublelist = new ArrayList<Integer>();
        for(int i=0;i<list.size();i++) {
           doublelist.add(list.get(i));
            //System.out.println(list.get(i));
        }
        return doublelist;

    }
    public static List<Integer> saveEvenNumbers(int n){
        List<Integer> arrayList =  new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(i%2 == 0)
                arrayList.add(i);
        }
        return arrayList;


    }
}
