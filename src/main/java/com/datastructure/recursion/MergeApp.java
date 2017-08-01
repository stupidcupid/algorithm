package com.datastructure.recursion;

/**
 * Created by nanzhou on 2017/7/31.
 */
public class MergeApp {

    /**
     * 归并算法
     *
     * @param args
     */
    public static void main(String[] args) {

        int[] arrayA = new int[]{
                23, 44, 56, 90
        };

        int[] arrayB = new int[]{
                2, 6, 43, 234, 244, 668
        };

        int[] arrayC = new int[10];

        merge(arrayA, 4, arrayB, 6, arrayC);

        for (int i = 0; i < 10; i++) {

            System.out.print(arrayC[i] + " ,");
        }


    }

    /**
     * 看不懂 妈的
     *
     * @param arrayA
     * @param sizeA
     * @param arrayB
     * @param sizeB
     * @param arrayC
     */
    public static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {

        int aDex = 0, bDex = 0, cDex = 0;
        while (aDex < sizeA && bDex < sizeB)

            if (arrayA[aDex] < arrayB[bDex])
                arrayC[cDex++] = arrayA[aDex++];
            else
                arrayC[cDex++] = arrayB[bDex++];
        while (aDex < sizeA)
            arrayC[cDex++] = arrayA[aDex++];

        while (bDex < sizeB)
            arrayC[cDex++] = arrayB[bDex++];

    }

}
