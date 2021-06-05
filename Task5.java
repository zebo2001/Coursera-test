package Project3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
/*
Using the scanner asks the user to enter one sentence with
three words and print the index number of each word's last character and then
print the sum of each index number that you found
 */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter three words: ");
        String threeWords = scanner.nextLine();



        String firstWord = threeWords.substring(0,(threeWords.indexOf(threeWords.charAt(' '))));
        System.out.println(firstWord);


        System.out.println(threeWords.indexOf(' '));



    }
}
