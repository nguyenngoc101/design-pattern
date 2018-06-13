package com.ngocnv.Behavior.strategy;

public class Main {

    public static void main(String[] args) {
        Sort mergeSort = new MergeSort();
        Sort heapSort = new HeapSort();
        Sort quickSort = new QuickSort();

        Context context = new Context(mergeSort);
        context.sortArray();

        context.setSort(heapSort);
        context.sortArray();

        context.setSort(quickSort);
        context.sortArray();
    }
}
