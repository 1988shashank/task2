package com.collections.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Example01 {
    public static void main(String[] args) {
        Vector v = new Vector(3);

        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);


        System.out.println("Capacity :" +v.capacity());
        System.out.println("test");
        List list1 =List.of("Banana","Pom");
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("orange");
        list.add("purple");
        list.add(2,"peach");
        list.set(0,"Apples");
        list.addAll(3,list1);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        for(String lists:list){
//            System.out.println(lists);
//        }
//        Iterator wordsIterator =list.iterator();
//        while(wordsIterator.hasNext()){
//            System.out.println(wordsIterator.next());
//        }

ArrayList<Integer> integerList = new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
for(Integer oneint: integerList){
    System.out.println(oneint);
}
    }

}
