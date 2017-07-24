package com.algorithm;

/**
 * Created by nanzhou on 2017/7/20.
 */
public class SelectSort {

    /**
     * 选择排序
     *
     * @param args
     */
    public static void main(String[] args) {

        int[] arr = new int[]{122, 23, 324, 425, 456, 657, 717, 859, 690};

        int minIndex = 0;
        int temp = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            minIndex = i;//无序区的最小数据组下标
            for (int j = i + 1; j < arr.length; j++) {

                //在无序区找到最小数据并保存其下标
                if (arr[j] < arr[minIndex]) {

                    minIndex = j;
                }
            }
            if (minIndex != i) {

                //如果无序区的最小值位置不是默认的第一个数据，则交换之
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + ",");
        }
    }
}
