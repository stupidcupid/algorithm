package com.datastructure.binarytree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nanzhou on 2017/8/2.
 */
public class TreeApp {


    public static void main(String[] args) throws IOException {

        int value;

        Tree theTree = new Tree();

        theTree.insert(12, 1.2);
        theTree.insert(13, 1.4);
        theTree.insert(10, 1.6);
        theTree.insert(18, 1.7);
        theTree.insert(14, 1.9);
        theTree.insert(19, 1.8);
        theTree.insert(11, 1.5);
        theTree.insert(17, 1.0);

        while (true) {

            System.out.println("Enter fisrt letter of show : ");
            System.out.println("insert, find, delete, or traverse ");
            int choice = getChar();

            switch (choice) {

                case 's':
                    theTree.displayTree();
                    break;
                case 'i':
                    System.out.print("Enter value to insert : ");
                    value = getInt();
                    theTree.insert(value, value + 0.9);
                    break;
                case 'f':
                    System.out.print("Enter value to find : ");
                    value = getInt();
                    Node found = theTree.find(value);
                    if (null != found) {

                        System.out.println("Found : ");
                        found.dispalyNode();
                        System.out.println("\n");
                    } else {

                        System.out.println("Can not find ");
                        System.out.println(value + "\n");
                    }
                    break;
                case 'd':
                    System.out.println("Enter value to delete : ");
                    value = getInt();
                    boolean didDelete = theTree.delete(value);
                    if (didDelete)
                        System.out.println("Deleted " + value + "\n");
                    else
                        System.out.println("Can not delete ");
                    System.out.println("value " + value);
                    break;
                case 't':
                    System.out.println("Enter type 1,2 or 3 ");
                    value = getInt();
                    theTree.traverse(value);
                    break;
                default:
                    System.out.println("Invalid entry \n");
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
