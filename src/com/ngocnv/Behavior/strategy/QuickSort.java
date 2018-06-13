package com.ngocnv.Behavior.strategy;

import java.util.Collection;

public class QuickSort implements Sort {

    @Override
    public <T> void sort(Collection<T> collection) {
        System.out.println("Quick Sort!");
    }
}
