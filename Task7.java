package Homework4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the First String value: ");
        String first = scanner.nextLine();

        System.out.println("Please enter the Second String value:");
        String second = scanner.nextLine();

        boolean result = first.contains(second) || second.contains(first);

        System.out.println(result);


    }
}
