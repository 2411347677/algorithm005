package com.kds.sort;

import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.Quick;

public class SortTest {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{9,8,7,6,5,4,3,2,1};
        InsertionSort.sort(a);
        Sort.show(a);
    }
}
