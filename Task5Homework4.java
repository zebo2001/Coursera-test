package Homework4;

import java.util.Scanner;

/*
Using Scanner ask the user to enter one of the three string values. 1- Print the first char of those three-string together.
2- Print the last char of each string together
3- Print true if each of the string lengths is equaled to each other. Example:
Input -1: We Input -2: Love Input -3: Java Output:
WLJ
eea
false (since each string length is not equals to each other)
 */
public class Task5Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//we love java
        System.out.println("Please enter a word:");
        String word1 = scanner.nextLine();

        System.out.println("Please enter a word:");
        String word2 = scanner.nextLine();

        System.out.println("Please enter a word:");
        String word3 = scanner.nextLine();
    /////First chars of words
        char firstCharOfFirstWord= word1.charAt(0);
        char firstCharOfSecondWord = word2.charAt(0);
        char firstCharOfThirdWord = word3.charAt(0);
        System.out.println("First char of each word: "+ firstCharOfFirstWord+""+firstCharOfSecondWord+firstCharOfThirdWord);

        ////////Last char of each word

        char lastCharOfFirstWord= word1.charAt(word1.length()-1);
        char lastCharOfSecondWord = word2.charAt(word2.length()-1);
        char lastCharOfThirdWord = word3.charAt(word3.length()-1);
        System.out.println("Last char of each word: "+ lastCharOfFirstWord+""+lastCharOfSecondWord+lastCharOfThirdWord);
/////if it is equal

        int word1Length = word1.length();
        int word2Length = word2.length();
        int  word3Length = word3.length();

        boolean ifTheyAreEqual = ((word1Length==word2Length) && (word2Length==word3Length));
        System.out.println(ifTheyAreEqual);


    }
}
