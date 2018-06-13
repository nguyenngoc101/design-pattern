package com.ngocnv.Behavior.strategy;

import java.util.Collection;

public class MergeSort implements Sort {

    @Override
    public <T> void sort(Collection<T> collection) {
        System.out.println("Merge Sort!");
    }
}
