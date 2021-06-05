package Homework4;

import java.util.Locale;
import java.util.Scanner;

public class Task1Song {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a song name: ");
        String song = scanner.nextLine();

        char firstChar = song.charAt(0);
        char lastChar = song.charAt(song.length()-1);
        int length = song.length();
        char three = song.charAt(3);
        String uppercase = song.toUpperCase();
        String  lowercase = song.toLowerCase();

        System.out.println("Your song name: "+ song);
        System.out.println("First char: "+firstChar);
        System.out.println("Last char: "+lastChar);
        System.out.println("Length of song: "+length);
        System.out.println("Index number of (k): "+ song.indexOf('k'));
        System.out.println("Char from an index number of 3: "+three);
        System.out.println(uppercase);
        System.out.println(lowercase);

    }
}
