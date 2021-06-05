package Project2;

public class Task1Coins {
    public static void main(String[] args) {

        double quarters = 0.25;
        int amountOfQuarters = 5;
        double totalQuarters = amountOfQuarters * quarters;

        double dimes = 0.10;
        int amountOfDimes = 4;
        double totalDimes = amountOfDimes * dimes;

        double nickels = 0.05;
        int amountOfNickles = 3;
        double totalNickels = amountOfNickles * nickels;

        double pennies = 0.01;
        int amountOfPennies = 2;
        double totalPennies = amountOfPennies * pennies;

        double totalValueOfCoins = totalQuarters + totalDimes + totalNickels + totalPennies;

        System.out.println("the total value in dollars is about " + totalValueOfCoins);

    }
}
