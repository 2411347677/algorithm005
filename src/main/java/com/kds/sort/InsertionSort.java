package com.kds.sort;

/**
 * 插入排序<br/>
 *将第i个元素插入到前面有序的子数组里<br/>
 */
public class InsertionSort {
    public static void sort(Comparable[] a){
        int length = a.length;
        for (int i=1;i<length;i++){ //将a[i]插入到a[i-1],a[i-2]...当中
            for (int j=i;j>0&&Sort.less(a[j],a[j-1]);j--){  //第j个元素只要做到比第j-1个元素大，并且比第j+1个元素小就可以了
                Sort.exch(a,j,j-1);
            }
        }
    }
}
