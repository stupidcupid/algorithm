package com.datastructure.queue;

/**
 * Created by nanzhou on 2017/7/25.
 */
public class PriorityQApp {

    public static void main(String[] args) {

        PriorityQ priorityQ = new PriorityQ(5);

        priorityQ.insert(20);
        priorityQ.insert(10);
        priorityQ.insert(30);
        priorityQ.insert(50);
        priorityQ.insert(40);

        while (!priorityQ.isEmpty()) {

            long item = priorityQ.remove();
            System.out.print(item + " ");
        }
        System.out.println("");
    }
}
