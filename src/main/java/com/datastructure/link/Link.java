package com.datastructure.link;

/**
 * Created by nanzhou on 2017/7/26.
 */
public class Link {

    public int iData;

    public double dData;

    public Link next;

    public Link(int id, double dd) {

        iData = id;
        dData = dd;
    }

    public void displayLink() {

        System.out.print(" { " + iData + "," + dData + " } ");
    }
}
