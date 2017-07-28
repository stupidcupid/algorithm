package com.datastructure.link.sortlink;

/**
 * Created by nanzhou on 2017/7/27.
 */
public class Link {

    public long dData;

    public Link next;

    public Link(long dd) {

        dData = dd;
    }

    public void displayLink() {

        System.out.print(dData + " ");
    }
}
