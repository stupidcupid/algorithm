package com.datastructure.stack;

/**
 * Created by nanzhou on 2017/7/25.
 */
public class Reverser {

    private String input;

    private String output;

    public Reverser(String in) {

        input = in;
    }

    public String doRev() {

        int stackSize = input.length();
        StackC stackC = new StackC(stackSize);

        for (int j = 0; j < input.length(); j++) {

            char ch = input.charAt(j);
            stackC.push(ch);
        }
        output = "";
        while (!stackC.isEmpty()) {

            char ch = stackC.pop();
            output = output + ch;

        }
        return output;
    }
}
