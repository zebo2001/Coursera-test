package Homework4;

import java.util.Scanner;

/*
Using Scanner ask user to enter one string value with three word 1- Print first letter of each word
2- Print last letter of each word
3- Print length of each word (BONUS QUESTION)
Example:
Please enter value: "Java String Test" Output:
JST
agt
4
6
4
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter three words: "); // Homework is cool
        String threeWords = scanner.nextLine();

        String firstWord = threeWords.substring(0,threeWords.indexOf(' '));
        System.out.println("First word: "+ firstWord);

        String lastTwoWords = threeWords.substring(threeWords.indexOf(' ')+1);
        System.out.println("Last two words: "+ lastTwoWords);

        String secondWord = lastTwoWords.substring(0,lastTwoWords.indexOf(' '));
        System.out.println("Second word: "+secondWord);

        String thirdWord = lastTwoWords.substring(lastTwoWords.indexOf(' ')+1);
        System.out.println("Third word: "+thirdWord);

        ///////////////////First letter of each word

        char firstLetterOfFirstWord = firstWord.charAt(0);
        char firstLetterOfSecondWord = secondWord.charAt(0);
        char firstLetterOfThirdWord = thirdWord.charAt(0);
        System.out.println(firstLetterOfFirstWord+"" +firstLetterOfSecondWord+firstLetterOfThirdWord);

        //////////////////////Last letter of each word

        char lastCharOfFirstWord = firstWord.charAt(firstWord.length()-1);
        char lastCharOfSecondWord = secondWord.charAt(secondWord.length()-1);
        char lastCharOfThirdWord = thirdWord.charAt(thirdWord.length()-1);
        System.out.println(lastCharOfFirstWord+""+lastCharOfSecondWord+lastCharOfThirdWord);

//////////Length of each word
        System.out.println(firstWord.length());
        System.out.println(secondWord.length());
        System.out.println(thirdWord.length());

    }
}
