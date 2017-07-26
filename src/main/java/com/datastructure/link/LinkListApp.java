package com.datastructure.link;

/**
 * Created by nanzhou on 2017/7/26.
 */
public class LinkListApp {

    public static void main(String[] args) {

        LinkList theList = new LinkList();

        theList.insertFirst(2, 2.22);
        theList.insertFirst(3, 3.33);
        theList.insertFirst(4, 4.44);
        theList.insertFirst(5, 5.55);

        theList.displayList();

        while (!theList.isEmpty()) {

            Link alink = theList.deleteFirst();
            System.out.print(" Deteled ");
            alink.displayLink();
            System.out.print("");
        }
        theList.displayList();
    }
}
