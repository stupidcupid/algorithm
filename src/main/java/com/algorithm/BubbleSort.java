package com.algorithm;

/**
 * Created by nanzhou on 2017/7/20.
 */
public class BubbleSort {

    /**
     * 冒泡算法
     *
     * @param args
     */
    public static void main(String[] args) {

        int[] arr = new int[]{122, 23, 324, 425, 456, 657, 717, 859, 690};

        int length = arr.length;

        for (int i = length - 1; i > 0; i--) {

            for (int j = 0; j < i; ++j) {

                if (arr[i] > arr[j + 1]) {

                    int temp = arr[i];
                    arr[i] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < length; i++) {

            System.out.print(arr[i] + ",");
        }
    }
}
