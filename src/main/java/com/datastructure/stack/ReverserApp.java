package com.datastructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Created by nanzhou on 2017/7/25.
 */
public class ReverserApp {

    public static void main(String[] args) throws IOException {

        String input, output;

        while (true) {
            System.out.println("Enter a String : ");
            System.out.flush();
            input = getString();

            if (input.equals("")) {

                break;
            }
            Reverser reverser = new Reverser(input);
            output = reverser.doRev();

            System.out.println("Reverser " + output);

        }

    }

    public static String getString() throws IOException {

        Stack sta = new Stack();

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        String s = br.readLine();
        return s;
    }
}
