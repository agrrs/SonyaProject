package ua.edu.npu.lab01.task07;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        Redaction redaction = new Redaction();
        Split split = new Split();
        System.out.println("Enter String");
        str = input.nextLine();
        split.Split(str);
        String[] strArr = split.getStringArray();
        redaction.redaction(strArr);
        split.output(strArr);
    }
}
