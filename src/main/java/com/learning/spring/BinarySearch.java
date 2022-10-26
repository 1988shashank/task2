package com.learning.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
    @Autowired
 private SortAlgorithm sortAlgorithm;
 public BinarySearch(SortAlgorithm sortAlgorithm){
     super();
     this.sortAlgorithm = sortAlgorithm;
 }

    public int binarySearch(int[] numbers, int numberToSearchFor){

        int[] result = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        return 3;

    }
}
