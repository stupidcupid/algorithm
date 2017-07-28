package com.datastructure.link.sortlink;

/**
 * Created by nanzhou on 2017/7/27.
 */
public class SortedListApp {

    /**
     * 有序链表
     * @param args
     */
    public static void main(String[] args) {

        SortedList theSorted = new SortedList();
        theSorted.insert(20);
        theSorted.insert(40);

        theSorted.displayLink();

        theSorted.insert(10);
        theSorted.insert(30);
        theSorted.insert(50);

        theSorted.displayLink();

        theSorted.remove();

        theSorted.displayLink();
    }
}
