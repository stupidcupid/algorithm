package com.algorithm;

/**
 * Created by nanzhou on 2017/7/20.
 */
public class BubbleSort {

    /**
     * 冒泡算法  时间复杂度 O(n^2)
     *
     * @param args
     */
    public static void main(String[] args) {

        int[] arr = new int[]{122, 23, 324, 425, 456, 657, 717, 859, 690};

        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {

            boolean flag = true;//设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已然完成

            for (int j = 0; j < length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }

        for (int i = 0; i < length; i++) {

            System.out.print(arr[i] + ",");
        }
    }
}
