package Homework0;

public class Task3ConvertKg {
    public static void main(String[] args) {


        int kilogram = 8;

        double valueOfPound = 2.205;
        int valueOfGram = 1000;

        double pounds = kilogram * valueOfPound;
        int grams = kilogram * valueOfGram;


        System.out.println("8 kilograms = " + pounds + " pounds" + " \n8 kilograms = " + grams + " grams ");

    }
}
