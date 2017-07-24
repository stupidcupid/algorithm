package com.algorithm;

/**
 * Created by nanzhou on 2017/7/24.
 */
public class InsertSort {


    /**
     * 插入排序
     *
     * @param args
     */
    public static void main(String[] args) {

        int[] arr = new int[]{122, 23, 324, 425, 456, 657, 717, 859, 690};

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j > 0; j--) {

                if (arr[j] < arr[j - 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + ",");
        }
    }
}
