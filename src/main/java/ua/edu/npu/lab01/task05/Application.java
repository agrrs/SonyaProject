package ua.edu.npu.lab01.task05;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String MainString;
        System.out.println("Enter String");
        MainString = input.nextLine();
        Output output = new Output();
        output.doubleSpace(MainString);
        output.numbers(MainString);
    }
}
