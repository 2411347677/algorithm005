package com.kds.sort;

import edu.princeton.cs.algs4.StdOut;

/**
 * 选择排序<br/>
 * 找到数组中最小的元素将它和数组第一个元素交换位置 <br/>
 * 然后找到第二小的元素将他和数组第二个元素交换位置<br/>
 * 以此类推...
 */
public class SelectionSort{

    public static void sort(Comparable[] a) {
        int length = a.length;
        for(int i=0;i<length;i++){
            int min = i;    //先假设第i个元素最小，其他元素需要和它比较
            for (int j=i+1;j<length;j++){
                if (Sort.less(a[j],a[min]))
                    Sort.exch(a,j,min);
            }
        }
    }
}
