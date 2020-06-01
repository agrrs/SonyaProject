package ua.edu.npu.lab01.task02;

import java.util.Scanner;

public class StringArray {
    Scanner input = new Scanner(System.in);
    String[] strings;

    public StringArray (int stringsNumber) {
        strings = new String[stringsNumber];
    }

    public String[] inputStrings () {
        for (int i = 0; i <strings.length; i++) {
            System.out.println("Enter string number " + (i+1));
            strings[i] = input.next();
        }
        return strings;
    }

    public String[] getStrings() {
        return strings;
    }

    public void output() {
        for (int i = 0; i <strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    public void sorting () {
        String e;
        for (int i = 1; i <strings.length; i++) {
            for (int j = 0; j <strings.length-1; j++) {
                if(strings[j].length()>strings[j+1].length()) {
                    e = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1] = e;
                }
            }
        }
    }
}
