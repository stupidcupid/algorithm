package com.datastructure.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nanzhou on 2017/7/31.
 */
public class TriangelApp {

    static int number;

    public static void main(String[] args) throws IOException {

        for(;;){

            System.out.println("Enter a number : ");
            number = getInt();
            int answer = triangle(number);

            System.out.println("Triangle : " + answer);
        }
    }


    public static int triangle(int n) {

        if (n == 1)
            return n;
        else
            return (n + triangle(n - 1));
    }

    public static String getString() throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();

        return s;
    }

    public static int getInt() throws IOException {

        String s = getString();

        return Integer.parseInt(s);
    }

}
