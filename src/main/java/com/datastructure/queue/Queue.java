package com.datastructure.queue;

/**
 * Created by nanzhou on 2017/7/25.
 */
public class Queue {

    private int maxSize;

    private long[] queArr;

    private int front;

    private int rear;

    private int nItems;

    public Queue(int s) {

        maxSize = s;
        queArr = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j) {

        if (rear == maxSize - 1) {

            rear = -1;
        }
        queArr[++rear] = j;
        nItems++;
    }

    public long remove() {

        long temp = queArr[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;

        return temp;
    }

    public long peekFront() {

        return queArr[front];
    }

    public boolean isEmpty() {

        return (nItems == 0);
    }

    public boolean isFull() {

        return (maxSize == nItems);
    }

    public int size() {

        return nItems;
    }
}
