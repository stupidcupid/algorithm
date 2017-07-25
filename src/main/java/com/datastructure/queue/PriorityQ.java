package com.datastructure.queue;

/**
 * Created by nanzhou on 2017/7/25.
 */
public class PriorityQ {

    /**
     * 优先级队列
     */
    private int maxSize;

    private long[] queArr;

    private int nItems;

    public PriorityQ(int s) {
        maxSize = s;
        queArr = new long[maxSize];
        nItems = 0;

    }

    public void insert(long item) {

        int j;
        if (nItems == 0) {

            queArr[nItems++] = item;
        } else {

            for (j = nItems - 1; j >= 0; j--) {

                if (item > queArr[j]) {
                    queArr[j + 1] = queArr[j];
                } else {
                    break;
                }
            }
            queArr[j + 1] = item;
            nItems++;
        }
    }

    public long remove() {
        return queArr[--nItems];
    }

    public long peekMin() {

        return queArr[nItems - 1];
    }

    public boolean isEmpty() {

        return (nItems == 0);
    }

    public boolean isFull() {

        return (nItems == maxSize);
    }
}
