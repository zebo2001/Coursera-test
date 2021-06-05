package Homework4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);




        System.out.println("Please enter a word");
        String word = scanner.nextLine();

        System.out.println("Please enter the length of the word");
        int length = scanner.nextInt();


        int trueLength= word.length();
        if (length==trueLength) System.out.println("You entered true length ");
        else System.out.println("You entered false length ");

        System.out.println("Please enter  a letter you want index of");
        String letter = scanner.next();


        System.out.println("Index of your letter is: "+ word.indexOf(letter));



    }
}
