package com.learning.spring;

import org.springframework.stereotype.Component;

@Component
public class BubbeSortAlgorithm implements SortAlgorithm {
    public int[] sort(int [] numbers){
        return numbers;
    }
}
