package com.datastructure.iterator;

/**
 * Created by nanzhou on 2017/7/28.
 */
public class Link {

    public long dData;

    public Link next;

    public Link(long dd) {

        dData = dd;
    }

    public void displayLink() {

        System.out.println(dData + " ");
    }
}
