package com.datastructure.link.doublylink;

/**
 * Created by nanzhou on 2017/7/28.
 */
public class DoublyLinkedApp {

    /**
     * 双向链表
     * @param args
     */
    public static void main(String[] args) {

        DoublyLinkedList doublyLinked = new DoublyLinkedList();

        doublyLinked.insertFirst(22);
        doublyLinked.insertFirst(44);
        doublyLinked.insertFirst(66);

        doublyLinked.insertLast(11);
        doublyLinked.insertLast(33);
        doublyLinked.insertLast(55);


        doublyLinked.displayForward();
        doublyLinked.displayBackward();

        doublyLinked.deleteFirst();
        doublyLinked.deleteLast();
        doublyLinked.deleteKey(11);

        doublyLinked.displayForward();

        doublyLinked.insertAfter(22,77);
        doublyLinked.insertAfter(33,88);

        doublyLinked.displayForward();
    }
}
