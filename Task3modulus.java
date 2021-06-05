package Project2;

public class Task3modulus {
    public static void main(String[] args) {

        int allDigits = 578432;
        int limit = 999999; // cant exceed
        int minimum = 111111; // cant be lower than

        System.out.println("Example one: ");
        int digitSix = allDigits % 10;
        System.out.println(digitSix);
        allDigits = allDigits / 10;
        int digitFive = allDigits % 10;
        System.out.println(digitFive);
        allDigits = allDigits / 10;
        int digitFour = allDigits % 10;
        System.out.println(digitFour);
        allDigits = allDigits / 10;
        int digitThree = allDigits % 10;
        System.out.println(digitThree);
        allDigits = allDigits / 10;
        int digitTwo = allDigits % 10;
        System.out.println(digitTwo);
        allDigits = allDigits / 10;
        int digitOne = allDigits % 10;
        System.out.println(digitTwo);
        allDigits = allDigits / 10;

        int multiplication = digitSix * digitFive * digitFour * digitThree * digitTwo * digitOne;
        System.out.println("Multiplication of 578432 = " + multiplication);
        System.out.println("reverse number is " + digitSix + digitFive + digitFour + digitThree + digitTwo + digitOne); // reverse number
        int sum = digitSix + digitFive + digitFour + digitThree + digitTwo + digitOne;
        System.out.println("Sum of 578432 = " + sum);
    }
    }
