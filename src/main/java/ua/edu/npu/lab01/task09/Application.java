package ua.edu.npu.lab01.task09;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string;
        System.out.println("Enter string");
        string = input.nextLine();
        Count count = new Count();
        count.count(string);
        count.output();
    }
}
