package Homework4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your gender: ");
        String gender = scanner.nextLine();

        System.out.println("Please enter your full name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter your state code: ");
        String stateCode = scanner.nextLine();

        System.out.println("Please enter your city: ");
        String city = scanner.nextLine();

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        if (age>18 && name.startsWith("A") && name.endsWith("V") && stateCode.startsWith("I") && stateCode.endsWith("L") && city.length()<10 && gender.equals("M")  )
            System.out.println("You are able to vote");
        else {
            System.out.println("You are not able to vote");}

    }
}
