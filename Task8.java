package Homework4;



import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first word");
        String first = scanner.nextLine();

        System.out.println("Please enter second word");
        String second = scanner.nextLine();

        String lastTwo = first.substring(first.length()-2);
        boolean result = second.startsWith(lastTwo);
        System.out.println(result);

}}
