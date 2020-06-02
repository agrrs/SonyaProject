package ua.edu.npu.lab01.task08;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        Count Counting = new Count();
        Split Split = new Split();
        System.out.println("Enter String");
        str = input.nextLine();
        Split.split(str);
        Counting.counting(Split.getStringArray());
        Counting.output();
    }
}
