package com.learning.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringApplications {

    public static void main(String args[]){
//        BinarySearch binarysearch = new BinarySearch(new BubbleSortAlgorithm());
        ApplicationContext applicationContext = SpringApplication.run(SpringApplications.class, args);
        BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
        int[] s = new int[] {23,45,6 };

        int result = binarySearch.binarySearch(s, 3);
        System.out.println(result);
       // SpringApplication.run(SpringApplications.class, args);

    }
}
