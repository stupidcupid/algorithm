package com.datastructure.iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nanzhou on 2017/7/28.
 */
public class InterIterApp {

    public static void main(String[] args) throws IOException {

        LinkList linkList = new LinkList();
        ListIterator iterator = linkList.getIterator();

        long value;

        iterator.insertAfter(20);
        iterator.insertAfter(40);
        iterator.insertAfter(80);
        iterator.insestBefore(60);

        while (true) {

            System.out.println("Enter first letter of show, reset ,");
            System.out.println("next , get ,before , after , delete:");
            System.out.flush();

            int choice = getChar();
            switch (choice) {

                case 's':
                    if (!linkList.isEmpty()) {

                        linkList.disPlayLinkList();
                    } else {
                        System.out.println("List is Empty ");
                    }
                    break;
                case 'r':
                    iterator.reset();
                    break;
                case 'n':
                    if (!linkList.isEmpty() && !iterator.atEnd()) {

                        iterator.nextLink();
                    } else {
                        System.out.println("can't get nex link ");
                    }
                    break;
                case 'g':
                    if (!linkList.isEmpty()) {

                        value = iterator.getCurrent().dData;
                        System.out.println("Returned: " + value);
                    } else {
                        System.out.println("List is Empty ");
                    }
                    break;
                case 'b':
                    System.out.println("Enter value to insert ");
                    System.out.flush();
                    value = getInt();
                    iterator.insestBefore(value);
                    break;
                case 'a':
                    System.out.println("Enter value to insert ");
                    System.out.flush();
                    value = getInt();
                    iterator.insertAfter(value);
                    break;
                case 'd':
                    if (!linkList.isEmpty()) {

                        value = iterator.deleteCurrent();
                        System.out.println("Deleted " + value);
                    } else {
                        System.out.println("can't delete");
                    }
                    break;
                default:
                    System.out.println("Invalid entry ");
            }
        }
    }

    public static String getString() throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String s = reader.readLine();
        return s;
    }

    public static char getChar() throws IOException {

        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException {

        String s = getString();
        return Integer.parseInt(s);
    }
}
