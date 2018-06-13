package com.ngocnv.Behavior.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Context {

    private Sort sort;
    private List<Integer> arrays;

    public Context(Sort sort) {
        this.sort = sort;
        this.arrays = Arrays.asList(1, 3, 5, 7);
    }

    public void sortArray() {
        sort.sort(arrays);
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }
}
