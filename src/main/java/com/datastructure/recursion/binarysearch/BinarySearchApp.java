package com.datastructure.recursion.binarysearch;

/**
 * Created by nanzhou on 2017/7/31.
 */
public class BinarySearchApp {

    public static void main(String[] args) {


        long[] arr = new long[]{1, 2, 4, 6, 8, 10, 12};


        System.out.println(reFind(1, 0, arr.length, arr));
        System.out.println(reFind(2, 0, arr.length, arr));
        System.out.println(reFind(4, 0, arr.length, arr));
        System.out.println(reFind(6, 0, arr.length, arr));
        System.out.println(reFind(8, 0, arr.length, arr));
        System.out.println(reFind(10, 0, arr.length, arr));
        System.out.println(reFind(12, 0, arr.length, arr));
    }

    private static int reFind(long searchKey, int lowerBound, int upperBound, long[] arr) {

        int curIn = (lowerBound + upperBound) / 2;

        if (arr[curIn] == searchKey)
            return curIn;
        else if (lowerBound > upperBound)
            return arr.length;
        else {
            if (arr[curIn] < searchKey)
                return reFind(searchKey, curIn + 1, upperBound, arr);
            else {
                return reFind(searchKey, lowerBound, curIn - 1, arr);
            }
        }
    }


}
