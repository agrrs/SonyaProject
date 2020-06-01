package ua.edu.npu.lab01.task01;

import java.util.Scanner;

public class StringArray {
    Scanner input = new Scanner(System.in);
    String[] strings;

    public StringArray(int stringsNumber) {
        strings = new String[stringsNumber];
    }

    public String[] inputStrings () {
        for (int i = 0; i <strings.length; i++) {
            System.out.println("Enter string " + (i+1));
            strings[i] = input.next();
        }
        return strings;
    }

    public void output () {
        for (int i = 0; i <strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    public String[] getStrings() {
        return strings;
    }

    public void findShortest () {
        int shortestString = 0;
        for (int i = 1; i <strings.length; i++) {
            if(strings[shortestString].length()>strings[i].length()) {
                shortestString = i;
            }
        }
        System.out.println("Shortest string: " + strings[shortestString] + "    Length: " + strings[shortestString].length());
    }
}
