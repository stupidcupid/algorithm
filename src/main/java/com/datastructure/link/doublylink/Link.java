package com.datastructure.link.doublylink;

/**
 * Created by nanzhou on 2017/7/27.
 */
public class Link {

    public long dData;

    public Link next;

    public Link previous;

    public Link(long d) {

        dData = d;
    }

    public void display() {

        System.out.print(dData + " ");
    }
}
